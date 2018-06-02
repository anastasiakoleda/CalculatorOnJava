package selftest;

public class new2 {
    public static void main (String[] args) {
        String s = "Tere, TUDENG!";
        String t = asenda (s); // "_ere, ______!"
        System.out.println (s + " --> " + t);
    }

    public static String asenda (String s) {
       char [] c = s.toCharArray();
       for (int i=0; i < c.length; i++){
           if (Character.isUpperCase(c[i])){
               c[i] = '_';
           }
       }
      return String.valueOf(c);
    }

}
