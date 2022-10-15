package Task12_15.Ex2;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, building, apartment;
    public void separateStringTokenizer(String str){
        StringTokenizer st = new StringTokenizer(str, ",.;-");
        country = st.nextToken();
        region = st.nextToken();
        city = st.nextToken();
        street = st.nextToken();
        house = st.nextToken();
        building = st.nextToken();
        apartment = st.nextToken();
    }

    public void separateSplit(String str){
        String[] data = str.split(",");
        country = data[0];
        region = data[1];
        city = data[2];
        street = data[3];
        house = data[4];
        building = data[5];
        apartment = data[6];
    }

    @Override
    public String toString() {
        return country + region + city + street +
                house + building + apartment;
    }
}