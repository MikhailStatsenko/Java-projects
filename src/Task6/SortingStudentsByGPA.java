package Task6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student stud1, Student stud2) {
       if (stud1.getExamScore() > stud2.getExamScore())
           return 1;
       else if (stud1.getExamScore() < stud2.getExamScore())
           return -1;
       else
           return 0;
    }

    public void sortingStudentsByGPA(Student[] studArr, int low, int high){
        int l = low, h = high;
        Student mid = studArr[(l+h)/2];
        do{
            while (compare(studArr[l], mid) > 0) l++;
            while (compare(studArr[h], mid) < 0) h--;
            if (l <= h){
                Student tmp = studArr[l];
                studArr[l] = studArr[h];
                studArr[h] = tmp;
                l++; h--;
            }
        } while (l < h);

        if (low < h) sortingStudentsByGPA(studArr, low, h);
        if (high > l) sortingStudentsByGPA(studArr, l, high);
    }
}
