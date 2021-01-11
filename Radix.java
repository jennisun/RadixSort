public class Radix extends class MyLinkedList{

  public static int nth(int a, int col) {
    String n = String.valueOf(a);
    return Integer.parseInt(String.valueOf(n.charAt(n.length() - 1 - col)));
  }

}
