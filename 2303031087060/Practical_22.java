import java.util.ArrayList;

public class Practical_22 {
    public static void main(String[] args) {
        // Create an ArrayList for String data
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("My");
        stringList.add("name");
        stringList.add("is");
        System.out.println("String Data in the List:");
        System.out.println(stringList);
        // Create an ArrayList for Integer data
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        System.out.println("\nInteger Data in the List:");
        System.out.println(intList);
    }
}