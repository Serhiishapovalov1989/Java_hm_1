package homework;

public class Main {

    public static void main(String[] args) {

        char ch = 'G';
        int in = 89;
        byte by = 4;
        short sh = 56;
        float fl = 4.7333436F;
        double dub = 4.355453532;
        long lo = 12121;

        System.out.println("Character: " + "ch");
        System.out.println("Integer: " + "in");
        System.out.println("Byte: " + "by");
        System.out.println("Short: " + "sh");
        System.out.println("Float: " + "fl");
        System.out.println("Double: " + "dub");
        System.out.println("Long: " + "lo");


        //________________________________________________________________________________//


        int intN = 345;
            int firstNumber = intN/100;
            int secondNumber = intN%100/10;
            int thirdNumber = intN%10;

        System.out.println("Число: " + 345 + "->" + firstNumber + "," + secondNumber + "," + thirdNumber + ".");


    }
}
