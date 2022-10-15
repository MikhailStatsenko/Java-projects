package Task10.Ex2;

public class MultifunctionalChair implements Chair{
    private String ownerName;

    MultifunctionalChair(String name) {
        this.ownerName = name;
    }

    public void setOwnerName(String name){
        this.ownerName = name;
    }

    public void sayMyName(){
        System.out.println("Здравствуйте, " + ownerName + "!");
    }

    @Override
    public String getChairType() {
        return "Multifunctional Chair";
    }
}
