import java.util.Scanner;
public class ProcessAName5026211056 {

    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        name = input.nextLine();
        int spasi = name.indexOf(" ");
        char huruf_pertama = name.charAt(0);
        String lastName = name.substring(spasi+1);
        System.out.println("Your name is: "+ lastName+", "+ huruf_pertama+".");
    }
}