import java.util.Scanner;

public class ActivityThreeJeminez {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int capacity = 10; // Array capacity
      String[] order = new String[capacity];
      String[] add-ons = new String[capacity];
      int[] quantity = new int[capacity];
      int[] quantity2 = new int[capacity];
      int sum = 0; char ans; int ctr = 0;
      int ctr2 = 0; int price; int total = 0;

      System.out.println("----- Welcome to HAHAHA -----;");

      do {
        System.out.println("     Menu:          |        Add-ons:");
        System.out.println("C1 = Php 100.00     |    R1 = Php 35.00");
        System.out.println("C2 = Php 150.00     |    R2 = Php 50.00");
        System.out.println("C3 = Php 200.00    ");

        do {
          System.out.println("Select order: ");
          order[ctr] = scnr.nextLine().toLowerCase();

          System.out.println("Enter the quantity : ");
          quantity[ctr] = scnr.nextInt();
          scnr.nextLine();

          if (order[ctr].equals("c1")) {
            price = 100;
            total = price * quantity[ctr];
            sum += total;
          } else if (order[ctr].equals("c2")) {
            price = 150;
            total = price * quantity[ctr];
            sum += total;
          } else if (order[ctr].equals("c3")) {
            price = 200;
            total = price * quantity[ctr];
            sum += total;
          }

          System.out.println("Would you like to add more menu items? [Y/N]: ");
          ans = scnr.next().charAt(0);
          scnr.nextLine();
          if (ans == 'y' || ans == 'Y') {
            ctr++;
          }
        } while (ans == 'y' || ans == 'Y');

        do {
          System.out.println("Select an order for add-ons: ");
          adns[ctr2] = scnr.nextLine().toLowerCase();

          System.out.println("Enter the quantity for this add-on: ");
          quantity2[ctr2] = scnr.nextInt();
          scnr.nextLine();

          if (adns[ctr2].equals("r1")) {
            price = 35;
            total = price * quantity2[ctr2];
            sum += total;
          } else if (adns[ctr2].equals("r2")) {
            price = 50;
            total = price * quantity2[ctr2];
            sum += total;
          }

          System.out.println("Would you like to add more add-ons? [Y/N]: ");
          ans = scnr.next().charAt(0);
          scnr.nextLine();
          if (ans == 'y' || ans == 'Y') {
            ctr2++;
          }