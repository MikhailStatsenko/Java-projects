package Task27_28;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Threads {
    private static String srcFolder = "/Users/mikhail/IdeaProjects/Java-projects/src/Task27_28/images";
    private static String dstFolder = "/Users/mikhail/IdeaProjects/Java-projects/src/Task27_28/dst";

    public static void reduceImage(File file) {
        BufferedImage image;
        try {
            image = ImageIO.read(file);
            if (image == null) {
                return;
            }

            int newWidth = image.getWidth() / 2;
            int newHeight = (int) Math.round(
                    image.getHeight() / (image.getWidth() / (double) newWidth)
            );
            BufferedImage newImage = new BufferedImage(
                    newWidth,
                    newHeight,
                    BufferedImage.TYPE_INT_RGB
            );

            int widthStep = image.getWidth() / newWidth;
            int heightStep = image.getHeight() / newHeight;

            int rgb;
            for (int x = 0; x < newWidth; x++) {
                for (int y = 0; y < newHeight; y++) {
                    rgb = image.getRGB(x * widthStep, y * heightStep);
                    newImage.setRGB(x, y, rgb);
                }
            }

            File newFile = new File(dstFolder + "/" + file.getName());
            ImageIO.write(newImage, "jpg", newFile);
        }
        catch (IOException e) {}
    }

    static void reduceImagesMonoThread() {
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();

        try {
            if (!Files.exists(Paths.get(dstFolder))) {
                Files.createDirectories(Paths.get(dstFolder));
            }

            for (final File file : files) {
                reduceImage(file);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void reduceImagesMultiThread() {
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();

        try {
            if (!Files.exists(Paths.get(dstFolder))) {
                Files.createDirectories(Paths.get(dstFolder));
            }

            for (final File file : files) {
                if (Runtime.getRuntime().availableProcessors() != 0) {
                    new Thread(() -> reduceImage(file)).start();
                } else {
                    reduceImage(file);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        reduceImagesMonoThread();
        reduceImagesMultiThread();

        System.out.println("Duration: " + (System.currentTimeMillis() - start));
    }
}
