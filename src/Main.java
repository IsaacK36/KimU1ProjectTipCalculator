import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total bill: ");
        double bill = scanner.nextDouble();
        System.out.print("Enter the tip percentage: ");
        int tipPercent = scanner.nextInt();
        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();
        double totalTip = Math.round((bill*tipPercent/100.0)*100.0)/100.0;
        double totalBill = Math.round((bill + totalTip)*100.0)/100.0;
        double tipPerPerson = Math.round((totalTip/numPeople)*100.0)/100.0;
        double totalPerPerson = Math.round((totalBill/numPeople)*100.0)/100.0;
        System.out.println("The total tip amount is " + totalTip);
        System.out.println("The total bill including tip is " + totalBill);
        System.out.println("The tip per person is " + tipPerPerson);
        System.out.println("The total per person is " + totalPerPerson);
    }
}