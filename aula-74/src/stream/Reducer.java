package stream;

import java.util.Arrays;
import java.util.List;

public class Reducer {
    
    public static void main(String[] args) {
        
        //lista criada a partir de um array de números
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int result = 0;

        for (Integer number : numbers){
            result = result + number;
        }

        System.out.println("Soma sem stream:" + result);

        Integer resultStream = numbers.stream()

        //sum -> resultado de uma soma parcial
        .reduce(0, (sum, number) -> sum + number);

        System.out.println("Soma com stream:" + resultStream);
    }
}
