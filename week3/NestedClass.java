package week3;

class IntStack {
    private IntStackNode head;
    // IntStackNode is the inner class of the class IntStack.
    // Each instance of this inner class functions as one link in the
    // overall stack that it helps to represent.
    private static class IntStackNode {
        private int val;
        private IntStackNode next;
        private IntStackNode(int v, IntStackNode n) {
            val = v;
            next = n;
        }
    }
    public IntStack push(int v) {
        head = new IntStackNode(v, head);
        return this;
    }
    public int pop() {
        int x = head.val;
        head = head.next;
        return x;
    }
}

public class NestedClass {
    public static void main(String[] args) {
        IntStack s = new IntStack();
        s.push(4).push(3).push(2).push(1).push(0);
        //prints: 0, 1, 2, 3, 4,
        for(int i = 0; i < 5; i++) {
        System.out.print(s.pop() + ", ");
        }
    }
}

