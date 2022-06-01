package fibonacciSeries;

/*input:N=10
output: 0 1 1 2 3 5 8 13 21 34*/

public class FibonacciSeries {
    public static void main(String[] args) {
        long N = 10L    ; //int will give -ve results for larger values, So, better to take long
        fibonacci(N);

//        for (long i=0L; i<N; i++) {
//            System.out.print(fibonacciRecursive(i)+" ");
//        }
    }
//fibonacci using recursion
    static long fibonacciRecursive(long N) {
        if (N<=1){
         return N;
        }else
        return fibonacciRecursive(N-1)+fibonacciRecursive(N-2);
    }
//fibonacci using iteration
    static void fibonacci(long N) {
        long num1=0, num2=1;
        System.out.print(num1+" "+num2+" ");
        int counter=2;
        while (counter<N){
            long num3 = num1+num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}