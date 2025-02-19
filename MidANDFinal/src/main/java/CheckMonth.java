import java.util.Scanner;

public class CheckMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a month name: ");
        String inputMonth = sc.next().toUpperCase();
       
        boolean found = false;

        for (Months month : Months.values()) {
            if (month.name().equals(inputMonth)) {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("The month exists in the enum list");
        } else{
            System.out.println("The month doesn't exists in the enum list");
        }
    }
}
