package Task6;

public class Test {
    static void printArr (Student[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void ex1(int studentCount){
        Student[] iDNumber = new Student[studentCount];
        for (int i = 0; i < studentCount; i++){
            iDNumber[i] = new Student();
        }

        Sorting.shuffle(iDNumber);

        System.out.println("Array before sorting:");
        printArr(iDNumber);

        Sorting.insertionSort(iDNumber);

        System.out.println();
        System.out.println();
        System.out.println("Array after sorting:");
        printArr(iDNumber);
    }

    static void ex2(int studentCount){
        Student[] iDNumber = new Student[studentCount];
        for (int i = 0; i < studentCount; i++){
            iDNumber[i] = new Student();
        }

        Sorting.shuffle(iDNumber);

        System.out.println("Array before sorting:");
        printArr(iDNumber);

        SortingStudentsByGPA quickSort = new SortingStudentsByGPA();
        quickSort.sortingStudentsByGPA(iDNumber, 0, iDNumber.length-1);

        System.out.println();
        System.out.println();
        System.out.println("Array after sorting:");
        printArr(iDNumber);
    }

    static void ex3(int studentCount1, int studentCount2){
        Student[] iDNumber1 = new Student[studentCount1];
        Student[] iDNumber2 = new Student[studentCount2];

        for (int i = 0; i < studentCount1; i++){
            iDNumber1[i] = new Student();
        }
        for (int i = 0; i < studentCount2; i++){
            iDNumber2[i] = new Student();
        }

        Sorting.shuffle(iDNumber1);
        Sorting.shuffle(iDNumber2);

        System.out.println("Array №1 before sorting:");
        printArr(iDNumber1);
        System.out.println("Array №2 before sorting:");
        printArr(iDNumber2);

        Student[] iDNumberMerged = new Student[studentCount1+studentCount2];

        Sorting.merge(iDNumberMerged, iDNumber1, iDNumber2);
        Sorting.mergeSort(iDNumberMerged);

        System.out.println();
        System.out.println();
        System.out.println("Merged array after sorting:");
        printArr(iDNumberMerged);
    }

    public static void main(String[] args) {
        ex1(10);
        //ex2(10); // Соритровка по последнему столбцу
        //ex3(5, 7);
    }
}
