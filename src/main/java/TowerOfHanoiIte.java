public class TowerOfHanoiIte implements TowerOfHanoi {
    private final Stack<Integer> src;
    private final Stack<Integer> end;
    private final Stack<Integer> aux;
    private int moveCount;

    public TowerOfHanoiIte(int n) {
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
        System.out.println("SOLVING PUZZLE ITERATIVELY");
        System.out.println("<< Start >>");
        this.print();
        move(n, this.src, this.end, this.aux);
    }

    private void move(int n, Stack<Integer> src, Stack<Integer> end, Stack<Integer> aux) {
//        moveCount = 1;
        if (n % 2 == 0) {
            while (end.getLen() != n) {
                // make legal move btw src & aux (either direction)
                transfer(src, aux);
                System.out.printf("<< Move %d >>\n", ++moveCount);
                this.print();

                // make legal move btw src & end (either direction)
                transfer(src, end);
                System.out.printf("<< Move %d >>\n", ++moveCount);
                this.print();

                // make legal move btw aux & end (either direction)
                transfer(aux, end);
                System.out.printf("<< Move %d >>\n", ++moveCount);
                this.print();

            }
        } else {
            while (end.getLen() != n) {
                // make legal move btw src & end (either direction)
                transfer(src, end);
                System.out.printf("<< Move %d >>\n", ++moveCount);
                this.print();

                // check if the move completed the puzzle
                if (end.getLen() == n) {
                    break;
                }

                // make legal move btw src & aux (either direction)
                transfer(src, aux);
                System.out.printf("<< Move %d >>\n", ++moveCount);
                this.print();

                // make legal move btw aux & end (either direction)
                transfer(aux, end);
                System.out.printf("<< Move %d >>\n", ++moveCount);
                this.print();
            }
        }
    }

    // transfer is a helper function to move a disc
    // between two stacks.
    private void transfer(Stack<Integer> stack1, Stack<Integer> stack2) {
        // if stack2 is empty, stack1 must not be empty
        // move disc from stack1 onto stack2
        if (stack2.peek() == null) {
            stack2.push(stack1.pop());
        } else if (stack1.peek() == null) { // if stack1 is empty
            stack1.push(stack2.pop()); // move disc from stack2 onto stack1
        } else { // neither is empty
            // move the smaller disc on either stack onto the other
            if (stack1.peek() < stack2.peek()) {
                stack2.push(stack1.pop());
            } else {
                stack1.push(stack2.pop());
            }
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

    public int getMoveCount() {
        return moveCount;
    }
}
