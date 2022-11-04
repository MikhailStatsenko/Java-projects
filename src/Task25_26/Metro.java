package Task25_26;

import java.io.Serializable;
import java.util.*;

public class Metro {
    private Map<String, ArrayList<String>> stations = new LinkedHashMap<>();
    private  ArrayList<Line> lines = new ArrayList<>();

    public void addStation(String lineName, String stationName) {
        if (stations.get(lineName) == null) {
            stations.put(lineName, new ArrayList<>(Arrays.asList(stationName)));
        }
        else {
            stations.get(lineName).add(stationName);
        }
    }

    public void addLine(String number, String name) {
        if (findByLineNum(number) == null){
            lines.add(new Line(number, name));
        }
    }

    class Line {
        private String number;
        private String name;

        public Line(String number, String name) {
            this.number = number;
            this.name = name;
        }

        public String getNumber() {
            return this.number;
        }

        public String getName() {
            return this.name;
        }
    }

    public Line findByLineNum(String number) {
        for (Line l : lines) {
            if (l.getNumber().equals(number)) {
                return l;
            }
        }
        return null;
    }

    public Map<String, ArrayList<String>> getStations(){
        return stations;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }
}
