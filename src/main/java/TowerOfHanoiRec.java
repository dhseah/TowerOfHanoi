public class TowerOfHanoiRec implements TowerOfHanoi {
    private final Stack<Integer> src;
    private final Stack<Integer> end;
    private final Stack<Integer> aux;
    private int moveCount;

    public TowerOfHanoiRec(int n) {
        src = new Stack<>();
        for (int i = n; i > 0; i--) {
            src.push(i);
        }
        end = new Stack<>();
        aux = new Stack<>();
        moveCount = 0;
    }

    @Override
    public void solve(int n) {
        System.out.println("SOLVING PUZZLE RECURSIVELY");
        System.out.println("<< Start >>");
        this.print();
        move(n, this.src, this.end, this.aux);
        System.out.println();
    }

    // move solves the puzzle recursively.
    private void move(int n, Stack<Integer> src, Stack<Integer> end, Stack<Integer> aux) {
        if (n > 0) {
            move(n - 1, src, aux, end);
            end.push(src.pop());
            moveCount++;
            System.out.printf("<< Move %d >>\n", moveCount);
            this.print();
            move(n - 1, aux, end, src);
        }
    }

    @Override
    public void print() {
        System.out.print("SRC |");
        this.src.print();
        System.out.println();
        System.out.print("END |");
        this.end.print();
        System.out.println();
        System.out.print("AUX |");
        this.aux.print();
        System.out.println();
    }

    public int getMoveCount() { return moveCount; }

}
