import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //Завдання 1
        String[] strings_1 = {"brange", "plum", "onibn", "grape"};
        characterReplacement(strings_1);

        //Завдання 2
        List<String> list_2  = Arrays.asList("orange", "plum", "tomato", "onion", "grape", "onion");
        deleting_words(list_2, "onion");

        //Завдання 3
        List<String> list_3  = Arrays.asList("Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa");
        nameSearch(list_3,enteringWord());
    }
    public static void characterReplacement(String[] strings) {
        String[] strings_new = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings_new[i] = strings[i].replace('b', 'o');
        }
        for (int i = 0; i < strings_new.length; i++) {
            System.out.println(i+1 + ") " + strings_new[i]);
        }
        System.out.println();
    }
    public static void deleting_words(List<String> list, String wordToDelete) {
        ArrayList<String> list_new = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(wordToDelete)){
            list_new.add(list.get(i));}
        }
        for (String word : list_new){
            count++;

            stringBuilder
                    .append(count)
                    .append(") ")
                   .append(word)
                    .append("\n");


        }
        System.out.println(stringBuilder.toString());
        System.out.println();
    }

    public static String enteringWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you are looking for");
        String searchName = scanner.nextLine();
        return searchName;
    }
    public static void nameSearch(List<String> list, String searchName){
        int count = 0;
        for (String name : list){
            if (name.equals(searchName)){
                count++;
            }
        } if (count == 0){
            System.out.println("There is no such name");
        } else {
            System.out.println("The name " + searchName + " appears " + count + " times.");
        }
    }
    }