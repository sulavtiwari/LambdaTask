package SumOfTwoIntegers;

public class Main {
    public static void main(String[] args) {
        Calculate cal = new Sum();
        int sum =cal.sum(2,5);
        System.out.println("The sum of two integers is:  "+sum);

        //using anonymous class

        Calculate add = new Calculate() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        System.out.println("Sum of two Integers by anonymous class is :"+add.sum(2,5));


        //using lambda expression

        Calculate add1 = (int a, int b)->a+b;
        System.out.println("The addition by lambda expression is :"+add1.sum(2,5));
    }
}
