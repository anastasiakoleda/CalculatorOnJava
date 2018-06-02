package exersices;

public class exersice2 {
    public static void main(String[] args){
        String[] states = {"one", "two", "three", "four", "mikk"};
        for (int i = 0; i < states.length; i++){
            String[] s = states[i].split("");
            System.out.println(s);
        }
    }
}
