package Task6;



public class Student implements Comparable<Student>{
    private static int studentCount = 0;

    private int id;
    private String name;
    private int examScore;

    public Student(){
        String[] names = {"Arlen", "Liam", "Oliver", "James",
                "William", "Lucas", "Jack", "Samuel", "Emma",
                "Charles", "Luna", "Sofia", "Emily", "Zorina", "Hannah"};
        studentCount++;
        this.id = studentCount;
        this.name = names[(int)(Math.random()*15)];
        this.examScore = (int)(Math.random()*201)+100;
    }

    @Override
    public int compareTo(Student student) {
        if (id > student.id)
            return 1;
        else if (id < student.id)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Student's id = " + id + ",\tname = " +
                name + ",\texam score = " + examScore;
    }

    public int getExamScore() {
        return examScore;
    }
}
