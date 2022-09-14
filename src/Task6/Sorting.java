package Task6;



public class Sorting{
    public static void shuffle(Student[] arr){
        for (int i = 0; i < arr.length; i++){
            int r = (int)(Math.random()* arr.length);
            Student tmp = arr[r];
            arr[r] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void insertionSort(Comparable[] arr){
        for (int i = 1; i < arr.length; i++){
            Comparable current = arr[i];
            int j = i - 1;
            for (; j >= 0 && current.compareTo(arr[j]) < 0; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
    }

    public static void mergeSort(Student[] arr){
        int size = arr.length;
        if (size < 2) return;

        int mid = size/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[size-mid];

        for (int i = 0; i < mid; i++){
            l[i] = arr[i];
        }
        for (int i = mid; i < size; i++){
            r[i-mid] = arr[i];
        }

        mergeSort(l);
        mergeSort(r);

        merge(arr, l, r);
    }

    public static void merge(Student[] arr, Student[] l, Student[] r){
        int left = l.length, right = r.length;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right){
            if (l[i].compareTo(r[j]) <= 0){
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < left){
            arr[k++] = l[i++];
        }
        while (j < right){
            arr[k++] = r[j++];
        }
    }
}
