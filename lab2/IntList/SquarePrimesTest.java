package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimpleOne() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimpleTwo() {
        IntList lst = IntList.of(1, 2, 3, 5, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1 -> 4 -> 9 -> 25 -> 121", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSuperPrinesSimplwThree(){
        IntList lst=IntList.of(1,2,3,6,11,12);
        boolean changed=IntListExercises.squarePrimes(lst);
        assertEquals("1 -> 4 -> 9 -> 6 -> 121 -> 12",lst.toString());
        assertTrue(changed);
    }
}
