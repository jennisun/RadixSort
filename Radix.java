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

  public static void merge(SortableLinkedList original,SortableLinkedList[]buckets) {
    for (SortableLinkedList i : buckets) {
			original.extend(i);
		}
  }

  public static void radixSortSimple(SortableLinkedList data) {
    int maxlen = 0;

    for (int i = 0;i < data.size(); i ++) {
      if (length((int)data.get(i)) > maxlen) {
        maxlen = length((int)data.get(i));
      }
    }

    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int j = 0; j < 10; j ++) buckets[j] = new SortableLinkedList();

    for (int k = 0; k < maxlen; k ++) {
      while (data.size() != 0) {
        if (k < length((int)data.get(0))) buckets[nth(data.get(0), k)].add(data.get(0));
        else buckets[0].add(data.get(0));
        data.remove(0);
      }

      merge(data, buckets);
    }
  }





}
