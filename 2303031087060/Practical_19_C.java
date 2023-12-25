public class Practical_19_C {
  public static void main(String[] args) {
    String text  = "  Hello, world!";
    String trimedText = text.trim();
    String lowerCaseText = trimedText.toLowerCase();
    boolean startsWithHello = lowerCaseText.startsWith("hello");
    boolean containsWorld = lowerCaseText.contains("world");
    String replacedText = trimedText.replace("world", "Java");
    System.out.println("Original Text: " + text);
    System.out.println("Trimed Text: " + trimedText);
    System.out.println("LowerCase Text: " + lowerCaseText);
    System.out.println("Starts with hello: " + startsWithHello);
    System.out.println("Contains World: " + containsWorld);
    System.out.println("Replaced Text: " + replacedText);
  }
}
