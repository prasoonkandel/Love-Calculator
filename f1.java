import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of Boy: ");
        String Boyname = scanner.nextLine();
        System.out.print("Enter name of Girl: ");
        String girlName = scanner.nextLine();

        scanner.close();
 System.out.print("Loading...");
try {
    
    Thread.sleep(3000);
    
} catch (InterruptedException e) {
    e.printStackTrace();
}


System.out.print("\r");                
System.out.print("            ");      
System.out.print("\r"); 

        int loveScore = (int) (Math.random() * 101);
        System.out.println("Love percent between "+ Boyname + " and "+ girlName + " is: " + loveScore + "%");

    }
}

