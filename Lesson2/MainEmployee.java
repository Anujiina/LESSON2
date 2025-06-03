import java.util.Scanner;
import java.util.Locale;

public class MainEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("name oruulna uu");
        String name = scanner.next();
        System.out.println("salary oruulna uu");
        double fixedSalary = scanner.nextDouble();
        System.out.println("sales oruulna uu");
        double totalSales = scanner.nextDouble();
        
     
        double nemelt = totalSales * 0.15;
        double totalSalary = fixedSalary + nemelt;
        
        
        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
        
        scanner.close();
    }
}