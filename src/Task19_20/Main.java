package Task19_20;

import java.util.Collections;

public class Main {
    static void outputPrettier(String searchType, boolean found, double time) {
        System.out.println(searchType + ": номер " +
                (found ? "найден" : "не найден") + "поиск занял " + time + "нс"
        );
    }

    public static void main(String[] args) {
        Numbers nums = new Numbers();

        for (int i = 0; i < 10; i++) {
            nums.generate(111);
        }
        System.out.println(nums.getArrayList());

        String testNum = nums.getArrayList().get(4);
        System.out.println("\nНомер для поиска: " + testNum);

        boolean found = false;
        long m = 0;

        m = System.nanoTime();
        found = nums.straightSearch(testNum);
        outputPrettier("Поиск перебором", found, (double) (System.nanoTime() - m));

        m = System.nanoTime();
        found = nums.hashSetSearch(testNum);
        outputPrettier("Поиск в HashSet", found, (double) (System.nanoTime() - m));

        m = System.nanoTime();
        found = nums.treeSetSearch(testNum);
        outputPrettier("Поиск в TreeSet", found, (double) (System.nanoTime() - m));

        Collections.sort(nums.getArrayList());
        m = System.nanoTime();
        found = nums.binarySearch(testNum);
        outputPrettier("Бинарный поиск", found, (double) (System.nanoTime() - m));
    }
}
