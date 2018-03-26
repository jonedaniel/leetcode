package old;

public class AddTwoNumbersTest {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * Example
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */
    public static void main(String[] args) {
        new AddTwoNumbersTest().testCase();
    }

    public void testCase() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(2);

        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        /*l1.next = l2;
        l2.next = l3;*/

        l5.next = l6;
        l6.next = l7;

/*        ListNode l1 = new ListNode(0);
        ListNode l5 = new ListNode(0);*/
        System.out.println(getNum(l1));
        System.out.println(getNum(l5));
        System.out.println(getNum(addTwoNumbers(l1, l5)));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = getListNode(getNum(l1) + getNum(l2));
        ListNode lx = ln;
        while (true) {
            try {
                if (null != lx.next) {
                    if (lx.next.next == null) {
                        if (lx.next.val == 0) {
                            lx.next = null;
                            break;
                        }
                    }
                }
            } catch (Exception e) {break;}
            lx = lx.next;
        }
        return ln;
    }

    private int getNum(ListNode l1) {
        int i   = 1;
        int ret = 0;
        while (l1 != null) {
            ret += l1.val * i;
            i *= 10;
            l1 = l1.next;
        }
        return ret;
    }

    private ListNode getListNode(int num) {
        int      count  = num % 10;
        ListNode lFirst = new ListNode(count);
        ListNode l      = lFirst;
        while (num > 0) {
            num /= 10;
            ListNode listNode = new ListNode(num % 10);
            l.next = listNode;
            l = listNode;
        }
        return lFirst;
    }

}

class ListNode {
    int      val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
