package Task12_15.Ex1;

public class Person {
    private String name, surname, patronymic;

    public Person(String surname) {
        this.name = "";
        this.patronymic = "";
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.name = name;
        this.patronymic = "";
        this.surname = surname;
    }

    public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    private StringBuilder getInitial (String str){
        StringBuilder result = new StringBuilder();
        if (!str.isEmpty()){
            result.append(str.charAt(0)).append(".");
        }
        return result;
    }

    public String getFullName(){
        StringBuilder result = new StringBuilder(surname);
        StringBuilder tmp = new StringBuilder(getInitial(name));
        if (!tmp.isEmpty()){
            result.append(" ").append(tmp);
        }
        tmp = getInitial(patronymic);
        if (!tmp.isEmpty()){
            result.append(" ").append(tmp);
        }
        return result.toString();
    }
}