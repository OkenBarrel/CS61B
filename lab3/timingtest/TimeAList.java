package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
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
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> ns=new AList<Integer>();
        AList<Double> times=new AList<Double>();

        int row=8;

        int[] ns_int=new int[]{1000,2000,4000,8000,16000,32000,64000,128000};
        for (int l=0;l<row;l++){
            ns.addLast(ns_int[l]);
        }
        double t;
        AList<Integer> l=new AList<Integer>();
        for(int i=0;i<row;i++){
            Stopwatch sw=new Stopwatch();
            for(int j=0;j<ns.get(i);j++){
                l.addLast(10);
            }
            t=sw.elapsedTime();
            times.addLast(t);
        }
        printTimingTable(ns,times,ns);

    }
}
