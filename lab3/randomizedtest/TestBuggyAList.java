package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import java.awt.print.PrinterGraphics;

import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE

    @Test
    public void tsetThreeAddThreeRemove(){
        AListNoResizing <Integer> n=new AListNoResizing<>();
        BuggyAList <Integer> b=new BuggyAList<Integer>();
        b.addLast(4);
        n.addLast(4);
        b.addLast(5);
        n.addLast(5);
        b.addLast(6);
        n.addLast(6);

        assertEquals(b.size(),n.size());
        assertEquals(b.removeLast(),n.removeLast());
        assertEquals(b.removeLast(),n.removeLast());
        assertEquals(b.removeLast(),n.removeLast());
    }
    @Test
    public void randomizedTest(){
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> bug=new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                bug.addLast(randVal);
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                int size_b=bug.size();
                assertEquals(size,size_b);
            }else if(operationNumber==2&&L.size()!=0&&bug.size()!=0){
                //getLast
                int last_a=L.getLast();
                int last_b=bug.getLast();
                assertEquals(last_a,last_b);
            }else if(operationNumber==3&&L.size()!=0&&bug.size()!=0){
                //remove last
                L.removeLast();
                bug.removeLast();
            }
        }
    }
}
