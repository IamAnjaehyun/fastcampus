package std_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
//스트림은 일회용? 또 쓰려면 다시만들어라?

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        for(int num : arr) System.out.println(num);

        System.out.println();

        IntStream is = Arrays.stream(arr);
        is.forEach(n-> System.out.println(n));
        //foreach 는 하나씩 꺼내는거

        //sum 연산
        int sum = Arrays.stream(arr).sum();
        System.out.println("\n" + sum);

        //stream 연산

    }
}
