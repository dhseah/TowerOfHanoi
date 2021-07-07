public class Stack {
    private Node tail;
    private int len;

    public Stack() {
        this.tail = null;
        this.len = 0;
    }

    public void push(int data) {
        Node node = new Node(data);

        node.next= this.tail;
        this.tail = node;
        this.len++;
    }

    public int pop() {
        if (this.tail == null) {
            return -1;
        }

        int res = this.tail.data;
        this.tail = this.tail.next;
        this.len--;
        return res;
    }

    public int peek() {
        return this.tail != null ? this.tail.data : -1;
    }

    public void print() {
        if (this.tail == null) {
            return;
        }

        int temp = this.pop();
        this.print();
        System.out.printf("%d ", temp);
        this.push(temp);
    }

    public int getLen() {
        return this.len;
    }

    class Node {
       private int data;
       private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}


