package FilterOddAndEvenFromListOfIntegers;

import java.util.List;
import java.util.stream.Collectors;

public class Main  {
    public static void main(String[] args) {

        List<Integer> li = List.of(1,2,3,4,5,6,7,8,9,0);
        List<Integer> evenList = li.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even numbers list : -> "+evenList);


        List<Integer> oddList = li.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("Odd numbers list: ->"+oddList);

    }

}
