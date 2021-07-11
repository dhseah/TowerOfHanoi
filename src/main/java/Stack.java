public class Stack<T> {
    private Node<T> tail;
    private int len;

    public Stack() {
        this.tail = null;
        this.len = 0;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);

        node.setNext(this.tail);
        this.tail = node;
        this.len++;
    }

    public T pop() {
        if (this.tail == null) {
            return null;
        }

        T res = this.tail.getData();
        this.tail = this.tail.getNext();
        this.len--;
        return res;
    }

    public T peek() {
        return this.tail != null ? this.tail.getData() : null;
    }

    public void print() {
        if (this.tail == null) {
            return;
        }

        T temp = this.pop();
        this.print();
        System.out.printf("%s ", temp);
        this.push(temp);
    }

    public int getLen() {
        return this.len;
    }

}


