public class Radix{

  public static int nth(int a, int col) {
    String n = String.valueOf(a);
    return Integer.parseInt(String.valueOf(n.charAt(n.length() - 1 - col)));
  }

  public static int length(int a) {
    String n = String.valueOf(a);
    if (n.charAt(0) == '-') return n.length() - 1;
    else return n.length();
  }

  public static void merge(MyLinkedList original,MyLinkedList[]buckets) {
    for (MyLinkedList i : buckets) {
			original.extend(i);
		}
  }
}
