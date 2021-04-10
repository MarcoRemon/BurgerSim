package MarcoRemon.company;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
 
        Hamburger hamburger = new Hamburger();
        System.out.println("Program is starting");
        boolean running = true;
        while (running) {

            hamburger.startClient();

            System.out.println("1)Start 2)Finish");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    hamburger.startClient();
                    break;
                case 2:

                    running = false;
                    break;
            }
        }

        hamburger.dayEarnings();


    }

}

