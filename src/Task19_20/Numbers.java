package Task19_20;

import java.util.*;

public class Numbers {
    Random rand = new Random();
    private String letters = "АВЕКМНОРСТУХ";
    private int lettersAmount = 12;

    private ArrayList<String> arrayList = new ArrayList<>();
    private HashSet<String> hashSet = new HashSet<>();
    private TreeSet<String> treeSet = new TreeSet<>();

    private void addLetter(StringBuffer sb) {
        sb.append(letters.charAt(rand.nextInt(lettersAmount)));
    }

    public String generate(int region) {
        StringBuffer strBuff = new StringBuffer();
        addLetter(strBuff);

        int randInt = rand.nextInt(10);
        strBuff.append(randInt).append(randInt).append(randInt);

        addLetter(strBuff);
        addLetter(strBuff);

        strBuff.append(addZero(region));

        String res = strBuff.toString();
        arrayList.add(res);
        hashSet.add(res);
        treeSet.add(res);
        return res;
    }

    public static String addZero(int n) {
        if (n < 10) {
            return "0" + String.valueOf(n);
        }
        return String.valueOf(n);
    }

    public boolean straightSearch(String str) {
        return arrayList.contains(str);
    }

    public boolean binarySearch(String str) {
        return Collections.binarySearch(arrayList, str) >= 0;
    }

    public boolean hashSetSearch(String str) {
        return hashSet.contains(str);
    }

    public boolean treeSetSearch(String str) {
        return treeSet.contains(str);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public String getLetters() {
        return letters;
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }

    public TreeSet<String> getTreeSet() {
        return treeSet;
    }
}
