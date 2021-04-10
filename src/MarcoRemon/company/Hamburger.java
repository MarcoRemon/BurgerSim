package MarcoRemon.company;

import java.text.DecimalFormat;
import java.util.*;

public class Hamburger {

    private final double cowMeat = 2.50;
    private final double chickenMeat = 1.75;
    private final double porkMeat = 1.70;
    private final double mutton = 1.50;
    private final double veggie = 2.00;
    private final double cheese = 0.99;
    private final double lettuce = 0.35;
    private final double tomato = 0.45;
    private final double onion = 0.45;
    private final double caramelOnion = 0.65;
    private double price;
    private double earnings;
    private final DecimalFormat format = new DecimalFormat("#.00");

    public void dayEarnings() {
        System.out.println("Today earnings were:" + format.format(earnings) + "$");
    }

    public boolean startClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, please, introduce your name.");
        String consumer = scanner.nextLine();
        System.out.println("Well then, " + consumer + " lets begin.");
        System.out.println("What kind of meat do you want?");
        displayMeat();
        if (!addMeat()) {

            return false;
        }
        System.out.println("Choose bread type:");

        if (!displayBreads()) {
            return false;
        }
        System.out.println("What else would you like with your burger?");
        displayAdditions();
        if (!addAdditions()) {
            return false;
        }
        System.out.println("Final price would be:" + format.format(earnings));
        System.out.println("Confirm buy? Y/N");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("y")) {
            earnings += price;
        } else {
            price = 0;
            earnings += 0;
            return false;
        }

        return true;


    }

    private boolean addAdditions() {


        Scanner scanner = new Scanner(System.in);
        Set<String> items = new TreeSet<String>();
        boolean choosing = true;
        while (choosing) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Cheese for " + cheese + "?  Y/N  ");
                    String confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        price += cheese;
                        items.add("Cheese");
                        System.out.println("Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (confirmation.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }
                        break;


                    } else {
                        System.out.println("Previous item was cancelled. Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (keepBuying.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }

                    }
                    break;


                case 2:
                    System.out.println("Lettuce for " + lettuce + "?  Y/N  ");
                    String confirmation2 = scanner.nextLine();
                    if (confirmation2.equalsIgnoreCase("y")) {
                        price += lettuce;
                        items.add("Lettuce");
                        System.out.println("Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (confirmation2.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }
                        break;


                    } else {
                        System.out.println("Previous item was cancelled. Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (keepBuying.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }

                    }
                    break;
                case 3:
                    System.out.println("Tomato for " + tomato + "?  Y/N  ");
                    String confirmation3 = scanner.nextLine();
                    if (confirmation3.equalsIgnoreCase("y")) {
                        price += tomato;
                        items.add("Tomato");
                        System.out.println("Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (confirmation3.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }
                        break;


                    } else {
                        System.out.println("Previous item was cancelled. Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (keepBuying.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }

                    }
                    break;

                case 4:
                    System.out.println("Onion for " + onion + "?  Y/N  ");
                    String confirmation4 = scanner.nextLine();
                    if (confirmation4.equalsIgnoreCase("y")) {
                        price += onion;
                        items.add("Onion");
                        System.out.println("Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (confirmation4.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }
                        break;


                    } else {
                        System.out.println("Previous item was cancelled. Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (keepBuying.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }

                    }
                    break;

                case 5:
                    System.out.println("Caramelized onion for " + caramelOnion + "?  Y/N  ");
                    String confirmation5 = scanner.nextLine();
                    if (confirmation5.equalsIgnoreCase("y")) {
                        price += caramelOnion;
                        items.add("Caramelized onion");
                        System.out.println("Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (confirmation5.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }
                        break;


                    } else {
                        System.out.println("Previous item was cancelled. Would you like to keep ordering? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (keepBuying.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }

                    }
                    break;

                case 6:
                    System.out.println("No addition ? Y/N");
                    String confirmation6 = scanner.nextLine();
                    if (confirmation6.equalsIgnoreCase("y")) {

                        System.out.println("Would you like to reconsider? Y/N");
                        String keepBuying = scanner.nextLine();
                        choosing = keepBuying.equalsIgnoreCase("y");
                        if (keepBuying.equalsIgnoreCase("y")) {
                            displayAdditions();
                        }
                        break;


                    }

            }
        }

        if (!items.isEmpty()) {
            System.out.println("The hamburger will contain the following");
            for (String item : items) {
                System.out.println(item);
            }
            return true;
        } else System.out.println("No additions chosen");
        return true;
    }

    private void displayAdditions() {
        System.out.println("1)Cheese is:" + cheese + "$");
        System.out.println("2)Lettuce is:" + lettuce + "$");
        System.out.println("3)Tomato is:" + tomato + "$");
        System.out.println("4)Onion is:" + onion + "$");
        System.out.println("5)Caramelized onion is:" + caramelOnion + "$");
        System.out.println("6)None.");
    }


    private boolean displayBreads() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like white bread? Y|N");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("y")) {
            System.out.println("White bread then.");
            return true;
        } else System.out.println("Would you like wheat bread then? Y/N");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Wheat bread then.");
            return true;
        } else System.out.println("Cancelling buy.");
        return false;


    }

    private void displayMeat() {
        System.out.println("1)Cow hamburguer is: " + cowMeat + "$");
        System.out.println("2)Chicken hamburguer is: " + chickenMeat + "$");
        System.out.println("3)Pork hamburguer is: " + porkMeat + "$");
        System.out.println("4)Mutton hamburguer is: " + mutton + "$");
        System.out.println("5)Veggie hamburguer is: " + veggie + "$");
        System.out.println("6)Cancel buy.");


    }

    private boolean addMeat() {
        Scanner scanner = new Scanner(System.in);


        String confirmation;
        boolean choosing = true;
        while (choosing) {
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("You have chosen cow, is this correct? Y/N ");
                    confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        price = +cowMeat;
                        choosing = false;
                    } else {
                        displayMeat();
                        choosing = true;
                    }
                    break;

                case 2:
                    System.out.println("You have chosen chicken, is this correct? Y/N ");
                    confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        price = +chickenMeat;
                        choosing = false;
                    } else {
                        displayMeat();

                        choosing = true;
                    }
                    break;
                case 3:
                    System.out.println("You have chosen pork, is this correct? Y/N ");
                    confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        price = +porkMeat;
                        choosing = false;
                    } else {
                        displayMeat();
                        choosing = true;
                    }
                    break;
                case 4:
                    System.out.println("You have chosen mutton, is this correct? Y/N ");
                    confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        price = +mutton;
                        choosing = false;
                    } else {
                        displayMeat();
                        choosing = true;
                    }
                    break;
                case 5:
                    System.out.println("You have chosen veggie, is this correct? Y/N ");
                    confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        price = +veggie;
                        choosing = false;
                    } else {
                        displayMeat();
                        choosing = true;
                    }
                    break;
                case 6:
                    System.out.println("Canceling...");

                    return false;
                default:
                    System.out.println("That's not a valid option");
                    displayMeat();
                    choosing = true;
                    break;
            }
        }
        return true;
    }


}
