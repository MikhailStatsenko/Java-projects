package Task12_15.Ex3;

public class Shirt {
    String code, name, color, size;

    public Shirt(String code, String name, String color, String size) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public static Shirt[] getShirtFromString(String[] info){
        int shirtCount = info.length;
        Shirt[] allShirts = new Shirt[shirtCount];
        for (int i = 0; i < shirtCount; i++){
            String[] parameters = info[i].split(",");
            allShirts[i] = new Shirt(parameters[0], parameters[1], parameters[2], parameters[3]);
        }
        return allShirts;
    }

    @Override
    public String toString() {
        return "{code='" + code + ", name='" + name +
                ", color='" + color + ", size='" + size +"}";
    }
}
