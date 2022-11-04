package Task25_26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Parser {
    public static void parseToJson(String url, String path) throws IOException {
        Metro metro = new Metro();

        Document doc = Jsoup.connect(url).maxBodySize(0).get();

        String lineName;
        Elements lines = doc.select(".t-text-simple .t-metrostation-list-header");
        for (Element line : lines) {
            lineName = line.attr("data-line");
            metro.addLine(lineName, line.text());
            Elements stations = doc.select(".t-text-simple div[data-depend-set=\"lines-"+lineName+"\"]  .name");
            for (Element station : stations) {
                metro.addStation(lineName, station.text());
            }
        }
        File jsonFile = new File(path);
        jsonFile.createNewFile();

        FileWriter fw = new FileWriter(path);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        fw.write(gson.toJson(metro));
        fw.close();
    }

    public static void parseFromJson(String path) throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader(path);

        Metro obj;
        obj = gson.fromJson(reader, Metro.class);

        int count;
        for (Map.Entry<String, ArrayList<String>> line : obj.getStations().entrySet()) {
            count = 0;
            Metro.Line ln = obj.findByLineNum(line.getKey());
            if (ln == null) {
                continue;
            }
            else {
                System.out.print(ln.getName() + ": ");
            }
            for (String name : line.getValue()) {
                count++;
            }
            System.out.println(count);
        }
        reader.close();
    }
}