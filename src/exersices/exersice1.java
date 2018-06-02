package exersices;

import java.util.Scanner;

public class exersice1 {
   public static void main(String[] args){
       //Scanner sc = new Scanner(System.in);
       String text = "What a nice day";
       String outText = "";
       String[] array = text.split(" ");
       for (int i = array.length - 1; i >= 0; i--){
           outText += array[i] + " ";
       }
       System.out.println(outText);
   }
}
