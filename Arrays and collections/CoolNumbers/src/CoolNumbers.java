import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class CoolNumbers {
    public static void main(String[] args) {
        ArrayList<String> numbersArrayList;
        String findNumber = "А333РУ66";
        long startTime = System.nanoTime();
        numbersArrayList = generateCoolNumbers();
        long finishTime = System.nanoTime();
        System.out.println("Время формирования массива: " + (finishTime-startTime) + " нс.");
        System.out.println("Количество элементов массива: " + numbersArrayList.size());

        binarySearch(numbersArrayList, findNumber);
        perebor(numbersArrayList, findNumber);
        HashSet<String> numberHashSet = new HashSet<>(numbersArrayList);
        findInHashSet(numberHashSet, findNumber);
        TreeSet<String> numberTreeSet = new TreeSet<>(numbersArrayList);
        findInTreeSet(numberTreeSet, findNumber);
       // printArray(numbersArrayList);

    }
    public static void findInTreeSet(TreeSet<String> number, String findNumber){

        long startTime = System.nanoTime();
        boolean isFind = number.contains(findNumber);
        long finishTime = System.nanoTime();
        if (isFind) System.out.println("Поиск в TreeSet: номер найден, поиск занял " + (finishTime - startTime) + " нс");
        else System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + (finishTime - startTime) + " нс");
    }
    public static void findInHashSet(HashSet<String> number, String findNumber){
        long startTime = System.nanoTime();
        boolean isFind = number.contains(findNumber);
        long finishTime = System.nanoTime();
        if (isFind) System.out.println("Поиск в HashSet: номер найден, поиск занял " + (finishTime - startTime) + " нс");
        else System.out.println("Поиск в HashSet: номер не найден, поиск занял " + (finishTime - startTime) + " нс");
    }
    public static void perebor(ArrayList<String> numbers, String findNumber){
        long startTime = System.nanoTime();
        boolean flag = false;
        for(String item : numbers){
            if(item.equals(findNumber)) flag = true;
        }
        long finishTime = System.nanoTime();
        if(flag) System.out.println("Элемент найден, время для поиска составило: " + (finishTime - startTime) + " нс.");
        else System.out.println("Элемент не найден, время для поиска составило : " + (finishTime - startTime) + " нс.");
    }
    public static void binarySearch(ArrayList<String> numbers, String findNumber){
        Collections.sort(numbers);
        long startTime = System.nanoTime();
        int binarySearch = Collections.binarySearch(numbers, findNumber);
        long finishTime = System.nanoTime();
        if (binarySearch >= 0) System.out.println("Элемент найден, время поиска: " + (finishTime - startTime) + " нс");
        else System.out.println("Элемент не найден, время поиска: " + (finishTime-startTime) + " нс");
    }
    public static ArrayList<String> generateCoolNumbers(){
        ArrayList<String> coolNumbers = new ArrayList<>();
        char[] alphabet = "АВЕКМНОРСТУХ".toCharArray();


        for (int region = 1; region < 200; region++) {
            for (int z = 0; z < alphabet.length; z++) {
                for (int y = 0; y < alphabet.length; y++) {
                    for (int n = 0; n < 10; n++) {
                        for (int x = 0; x < alphabet.length; x++) {
                            coolNumbers.add(Character.toString(alphabet[x]) +
                                    Integer.toString(n) +
                                    Integer.toString(n) +
                                    Integer.toString(n) +
                                    Character.toString(alphabet[y]) +
                                    Character.toString(alphabet[z]) +
                                    Integer.toString(region));

                        }
                    }
                }
            }
        }
        return coolNumbers;
    }
    public static void printArray(ArrayList<String> arrayList){
        for(String item : arrayList){
            System.out.println(item);
        }
    }
}
