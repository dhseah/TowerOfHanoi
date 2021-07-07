import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiIteTest {
    @Test
    public void testSolve0() {
        TowerOfHanoiIte testTowers = new TowerOfHanoiIte(0);
        testTowers.solve(0);
        assertEquals(0, testTowers.getMoveCount());
    }

    @Test
    public void testSolve1() {
        TowerOfHanoiIte testTowers = new TowerOfHanoiIte(1);
        testTowers.solve(1);
        assertEquals(1, testTowers.getMoveCount());
    }

    @Test
    public void testSolve2() {
        TowerOfHanoiIte testTowers = new TowerOfHanoiIte(2);
        testTowers.solve(2);
        assertEquals(3, testTowers.getMoveCount());
    }

    @Test
    public void testSolve3() {
        TowerOfHanoiIte testTowers = new TowerOfHanoiIte(3);
        testTowers.solve(3);
        assertEquals(7, testTowers.getMoveCount());
    }

    @Test
    public void testSolve4() {
        TowerOfHanoiIte testTowers = new TowerOfHanoiIte(4);
        testTowers.solve(4);
        assertEquals(15, testTowers.getMoveCount());
    }
}