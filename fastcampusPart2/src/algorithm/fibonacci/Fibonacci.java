package algorithm.fibonacci;

public class Fibonacci {

    int[] value;
    int number;

    public Fibonacci(int number) {
        this.number = number;
        value = new int[number];
    }

    public int fibonacciRecur(int n) { //재귀
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);

    }

    public int fibonacciIter(int n) { // 반복
        int ppre = 0; //1번째 값
        int pre = 1; //2번째 값
        int current = 0; //3번째 값
        if (n == 0) return 0;
        if (n == 0) return 1;
        for (int i = 2; i <= n; i++) {
            current = ppre + pre;
            ppre = pre;
            pre = current;
        }
        return current;
    }

    public int fibonacciMem(int n) { //배열 , 메모리제이션(이전 계산한값 저장해놓고 갖다 씀)
        value[0] = 0;
        value[1] = 1;

        if (n == 0) return value[0];
        if (n == 1) return value[1];
        int i;
        for (i = 2; i <= n; i++) {
            value[i] = value[i - 1] + value[i - 2];
        }
        return value[i - 1];

    }

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci(100);

        int result = fib.fibonacciRecur(10);
        System.out.println(result);

        result = fib.fibonacciIter(10);
        System.out.println(result);

        result = fib.fibonacciMem(10);
        System.out.println(result);
    }

}
