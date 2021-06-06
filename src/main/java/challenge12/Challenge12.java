package challenge12;



import java.util.Locale;
import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);


        System.out.println("Enter the principal:");
        String principalS = inputs.nextLine();
        double principalD = Double.parseDouble(principalS);

        System.out.println("Enter the rate of Interest (As a percentage):");
        String rateS = inputs.nextLine();
        double rateD = Double.parseDouble(rateS);

        System.out.println("Enter the number of years:");
        String yearsS = inputs.nextLine();
        int yearsD = Integer.parseInt(yearsS);

        double interest = principalD * (rateD/100) * yearsD;
        double total = Math.round((interest+principalD)*100);
        total = total/100;
        String totalc = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(total);

        System.out.println("After " + yearsS + " years at " + rateD + "%, the investment will be worth " + totalc);




    }
}