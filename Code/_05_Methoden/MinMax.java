package _05_Methoden;

import java.util.Random;

public class MinMax {
  public static void main(String[] args) {
    int[] arr = new int[10];
    arr = liesEin(arr);
    gibAus(arr);
    int[] ausgabe = minMax(arr);
    System.out.println("Minimum = " + ausgabe[0] + ", Maximum = " + ausgabe[1] + ".");
  }

  public static int[] liesEin(int[] array){
    Random r = new Random();
    for (int i=0;i<=9;i++) {
      array[i] = r.nextInt(100 - 0);
    } 
    return array;
  }

  public static void gibAus(int[] array){
    System.out.println("10 zufällige Zahlen: ");
    for (int i=0;i<=8;i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println(array[9] + ".");
  }

  public static int[] minMax(int[] array){
    int[] zurueck = {array[0], array[0]};
    for (int i=0; i<=9; i++) {
      if (array[i] > zurueck[1]) {
        zurueck[1] = array[i];
      } 
      else if (array[i] < zurueck[0]) {
        zurueck[0] = array[i];
      } 
    }
    return zurueck;
  } 
} 
