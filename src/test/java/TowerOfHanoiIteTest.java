import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiIteTest {
    @Test
    public void testSolve() {
        for (int i = 0; i <= 10; i++) {
            TowerOfHanoiIte testTowers = new TowerOfHanoiIte(i);
            testTowers.solve(i);
            assertEquals(Math.pow(2, i) - 1, testTowers.getMoveCount());
        }
    }
}