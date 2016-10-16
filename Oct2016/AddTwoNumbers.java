public class AddTwoNumbers {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    ListNode l11 = new ListNode(4);
    ListNode l12 = new ListNode(3);
    l1.next = l11;
    l11.next = l12;

    ListNode l2 = new ListNode(5);
    ListNode l21 = new ListNode(6);
    ListNode l22 = new ListNode(4);
    l2.next = l21;
    l21.next = l22;

    println(addTwoNumbers(l1, l2));
  }

  public static void print(ListNode l) {
    if(l.next != null) {
      print(l.next);
    }
    System.out.print(l.val);
  }

  public static void println(ListNode l) {
    print(l);
    System.out.println();
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return l2;
  }
}
