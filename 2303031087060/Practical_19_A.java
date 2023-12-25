public class Practical_19_A {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello, ");
    sb.insert(6, "Java").append("world").delete(0, 6).reverse();

    System.out.println(sb.toString());
  }
}