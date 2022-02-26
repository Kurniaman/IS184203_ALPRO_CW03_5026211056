import java.util.Scanner;
public class TestClass5026211056 {
    public static void main(String[]args){
        //nomor 1
        ComputeMethods5026211056 com = new ComputeMethods5026211056();
        Scanner keyboard = new Scanner(System.in);
        double fah,celcius;
        System.out.print("Temp in Fahrenheit : ");
        fah = keyboard.nextDouble();
        celcius = com.fToC(fah);
        System.out.println("Temp in celsius is "+ celcius);

        // nomor 2
        int a,b;
        double c;
        System.out.print("Masukkan a :");
        a= keyboard.nextInt();
        System.out.print("Masukkan b :");
        b= keyboard.nextInt();
        c=com.hypotenuse(a, b);
        System.out.println("Hypotenuse is "+c);

        //nomor 3
        System.out.println("The sum of the dice values is "+com.roll());
    }
}