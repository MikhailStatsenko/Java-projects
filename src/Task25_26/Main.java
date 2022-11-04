package Task25_26;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.moscowmap.ru/metro.html#lines";
        String path = "/Users/mikhail/IdeaProjects/Java-projects/src/Task25_26/file.json";

        Parser.parseToJson(url, path);

        Parser.parseFromJson(path);
    }
}
