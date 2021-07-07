import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // declare & initialise a puzzle of size n
        // that will be solved recursively
        TowerOfHanoiRec myTowers = new TowerOfHanoiRec(n);
        myTowers.solve(n);

        // declare & initialise a puzzle of size n
        // that will be solved iteratively
        TowerOfHanoiIte myTowersIte = new TowerOfHanoiIte(n);
        myTowersIte.solve(n);
    }
}
