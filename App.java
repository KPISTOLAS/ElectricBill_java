import java.util.Date;
import java.util.Scanner;

class M {
    public static void main(String[] args) {
        final float Dcost = 0.0850F;
        final float Ncost = 0.030F;
        Scanner in = new Scanner(System.in);
        String Idcode;
        String name;
        String surename;
        float Dc;
        float Nc;
        Date D;
            int an;

        do {
            System.out.print("Give me your id number: ");
            Idcode = in.nextLine();

            System.out.print("Give me your name: ");
            name = in.nextLine();

            System.out.print("Give me your surename: ");
            surename = in.nextLine();

            System.out.print("Give me your day consumption: ");
            Dc = in.nextFloat();

            System.out.print("Give me your night consumption: ");
            Nc = in.nextFloat();

            float x = (Dc * Dcost) + (Nc * Ncost);
            D = new Date();

            System.out.println("ID number: " + Idcode);
            System.out.println("Name: " + name);
            System.out.println("Surename: " + surename);
            System.out.println("Total cost: " + x);
            System.out.println("Date: " + D);

            in.nextLine(); // Consume the leftover newline character

            
            do {
                System.out.println("Do you want to continue?");
                System.out.println("Yes (1) or No (0)");
                an = in.nextInt();
            } while (!(an==1 || an==0));

        } while (!(an==0));

    }

}
