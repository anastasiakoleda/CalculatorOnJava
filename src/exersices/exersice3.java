package exersices;

public class exersice3 {
    public static void main(String[] args){
       int[] array = {1, 2, 1, 5, 3, 4, 7, 5};
        int a = 0;
        for (int i = 0; i < array.length; i ++){
          if  (a > array[i]){
              array[i] = 0;
              System.out.println(array[i]);
          }
          else{
              a = array[i];
              System.out.println(array[i]);
          }
       }

    }
}
