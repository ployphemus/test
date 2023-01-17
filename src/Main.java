import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String version = "0.01";
        char finish = 'n';
        while(finish != 'y') {
            System.out.println("Fuel System " + version + "\n");
            //select user role, will be replaced with login screen
            System.out.println("Please select role: \n1. Admin\n2. User\n3. Fuel Truck");
            Scanner input = new Scanner(System.in);
            input.close();

            finish = 'y';
        }
    }
}