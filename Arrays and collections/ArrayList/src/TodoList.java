import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        System.out.println("Введите число: " +
                "\n1 - Выводит список дел" +
                "\n2 - Добавляет дело в список" +
                "\n3 - Редактирует дело" +
                "\n4 - Удаляет дело" +
                "\n0 - выход из программы");
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while(number != 0){
            number = scanner.nextInt();
            switch (number){
                case 1: allList(toDoList);
                break;
                case 2: addList(toDoList);
                break;
                case 3: editList(toDoList);
                break;
                case 4: removeList(toDoList);
                break;
            }

        }
        return;
    }
    public static ArrayList<String> addList(ArrayList<String> toDoList){
        System.out.println("Введите дело, которое хотите добавить: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("Дело добавлено.");
        toDoList.add(sentence);
        return toDoList;
    }
    public static void allList(ArrayList<String> toDoList){
        System.out.println("Список дел: ");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + "." + toDoList.get(i));
        }
    }
    public static ArrayList<String> removeList(ArrayList<String> toDoList){
        System.out.println("Введите номер дела: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt() - 1;

        while(index > toDoList.size() && index < 0){
            System.out.println("Введи заново номер дела");
            index = sc.nextInt();
        }
            toDoList.remove(index);

        System.out.println("Дело убрано");
        return toDoList;
    }
    public static ArrayList<String> editList(ArrayList<String> toDoList){
        System.out.println("Введите номер дела и текст для изменения");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        String sentence = sc.next();
        toDoList.set(index, sentence);
        System.out.println("Дело было изменено");
        return toDoList;
    }
}
