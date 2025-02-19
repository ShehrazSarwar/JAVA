import java.util.Vector;

public class AnimalVector {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Zebra");
    
        if (animals.contains("Zebra")) {
            System.out.println("Zebra is found in the vector.");
        } else {
            System.out.println("Zebra is not found in the vector.");
        }
    }
}
