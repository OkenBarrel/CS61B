package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> ns=new AList<Integer>();
        AList<Double> times=new AList<Double>();
        AList<Integer> opc=new AList<Integer>();

        int row=7;

        int[] ns_int=new int[]{1000,2000,4000,8000,16000,32000,64000};
        for (int l=0;l<row;l++){
            ns.addLast(ns_int[l]);
        }
        double t;
        int m=10000;
        SLList<Integer> l=new SLList<Integer>();
        for(int i=0;i<row;i++){

            for(int j=0;j<ns.get(i);j++){
                l.addLast(10);
            }
            Stopwatch sw=new Stopwatch();
            for(int k=0;k<m;k++){
                l.getLast();
            }
            t=sw.elapsedTime();
            opc.addLast(m);
            times.addLast(t);
        }
        printTimingTable(ns,times,opc);
    }

}
