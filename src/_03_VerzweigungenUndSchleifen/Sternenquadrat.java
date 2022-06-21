import java.util.Scanner;

public class Sternenquadrat {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Geben Sie eine natürliche Zahl ein.");
        int ui1 = ui.nextInt();
        for (int i = 0; i < ui1; i++) {
            for (int f = 0; f < ui1; f++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}








