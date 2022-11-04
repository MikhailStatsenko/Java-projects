package Task23_24;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*;
import java.net.URL;

public class DownloadImg {
    private static final String url = "https://www.mirea.ru/";
    private static final String path = "/Users/mikhail/IdeaProjects/Java-projects/src/Task23_24/images";

    public static void main(String[] args) throws IOException {
        File imagesDir = new File(path);
        imagesDir.delete();
        imagesDir.mkdir();
        Document doc = Jsoup.connect(url).get();
        Elements images = doc.select("img[src]");

        for (Element img : images) {
            String src = img.attr("src");
            if (src.charAt(0) == '/')
                src = url.substring(0, url.length()-1) + src;
            getImages(src);
        }
    }

    private static void getImages(String src) throws IOException {
        int indexOfName = src.lastIndexOf("/");

        if (indexOfName == src.length()) {
            src = src.substring(1, indexOfName);
        }

        indexOfName = src.lastIndexOf("/");
        String name = src.substring(indexOfName);

        System.out.println(name.substring(1));

        URL url = new URL(src);
        InputStream in = url.openStream();

        OutputStream out = new BufferedOutputStream(new FileOutputStream( path + name));

        for (int b; (b = in.read()) != -1;) {
            out.write(b);
        }
        out.close();
        in.close();
    }
}
