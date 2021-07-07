import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiRecTest {

    @Test
    void testSolve0() {
        TowerOfHanoiRec testTowers = new TowerOfHanoiRec(0);
        testTowers.solve(0);
        assertEquals(0, testTowers.getMoveCount());
    }

    @Test
    void testSolve1() {
        TowerOfHanoiRec testTowers = new TowerOfHanoiRec(1);
        testTowers.solve(1);
        assertEquals(1, testTowers.getMoveCount());
    }

    @Test
    void testSolve2() {
        TowerOfHanoiRec testTowers = new TowerOfHanoiRec(2);
        testTowers.solve(2);
        assertEquals(3, testTowers.getMoveCount());
    }

    @Test
    void testSolve3() {
        TowerOfHanoiRec testTowers = new TowerOfHanoiRec(3);
        testTowers.solve(3);
        assertEquals(7, testTowers.getMoveCount());
    }

    @Test
    void testSolve4() {
        TowerOfHanoiRec testTowers = new TowerOfHanoiRec(4);
        testTowers.solve(4);
        assertEquals(15, testTowers.getMoveCount());
    }
}