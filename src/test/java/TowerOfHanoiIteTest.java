import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiIteTest {
    TowerOfHanoiIte testTowers;

    public void test1() {
        TowerOfHanoiIte testTowers = new TowerOfHanoiIte(1);
        testTowers.solve(1);
        assertEquals(1, testTowers.getMoveCount());
    }
}