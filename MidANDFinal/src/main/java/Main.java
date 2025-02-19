import java.util.Scanner;

public class Main {
    
    static void calculation(int choice, float m1, float m2, float m3, float m4, float maxMarks) {
        float totalMarks = m1 + m2 + m3 + m4;
        float percentage = (totalMarks / maxMarks) * 100;

        switch (choice) {
            case 1:
                System.out.println("Total Marks: " + totalMarks);
                break;

            case 2:
                System.out.println("Total Percentage: "+ percentage +"%");
                break;

            case 3:
                System.out.print("Overall Grade: ");
                if (percentage >= 90) {
                    System.out.println("A+");
                } else if (percentage >= 80) {
                    System.out.println("A");
                } else if (percentage >= 70) {
                    System.out.println("B+");
                } else if (percentage >= 60) {
                    System.out.println("B");
                } else if (percentage >= 50) {
                    System.out.println("C");
                } else if (percentage >= 40) {
                    System.out.println("D");
                } else {
                    System.out.println("Fail");
                }
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum marks: ");
        float maxMarks = sc.nextFloat();

        System.out.print("Enter 1st Subject Marks: ");
        float m1 = sc.nextFloat();
        
        System.out.print("Enter 2nd Subject Marks: ");
        float m2 = sc.nextFloat();
        
        System.out.print("Enter 3rd Subject Marks: ");
        float m3 = sc.nextFloat();
        
        System.out.print("Enter 4th Subject Marks: ");
        float m4 = sc.nextFloat();

        System.out.println("\nMenu:");
        System.out.println("1. Calculate the total and display it.");
        System.out.println("2. Calculate the total percentage and display it.");
        System.out.println("3. Calculate overall grade.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        calculation(choice, m1, m2, m3, m4, maxMarks);
    }
}
