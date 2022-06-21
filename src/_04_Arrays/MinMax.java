package _04_Arrays;

import java.util.Scanner;

public class MinMax {
  public static void main(String[] args) {
    int numbers[] = new int[5];
    Scanner scan = new Scanner(System.in);
    System.out.println("Array Test 3.0.8.34");
    System.out.println(" ");
    System.out.print("Geben Sie fünf natürliche Zahlen (durch Leerzeichen getrennt) an: ");
    for (int i=0; i<=4; i++) {
      numbers[i] = scan.nextInt();
    }
    int small = numbers[0];
    int large = numbers[0];
    for (int i = 0; i <= 4; i++) {
      if(numbers[i] > large) large = numbers[i];
      if(numbers[i] < small) small = numbers[i];
    }
    System.out.println("Größte Zahl: " + large);
    System.out.println("Kleinste Zahl: " + small);
  } 
}