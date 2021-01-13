public class tester{
  public static void main(String[] args) {
    // System.out.println(Radix.nth(-40294, 3));
    // System.out.println(Radix.length(-40294));

    SortableLinkedList words = new SortableLinkedList();

    words.add(124);
    words.add(2);
    words.add(-14113);
    words.add(-13);

    Radix.radixSort(words);
    System.out.println(words);

  }
}
