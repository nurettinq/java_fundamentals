package day17_forloop;

public class C03_NestedLoop {
    public static void main(String[] args) {
        String input = "DENİZ";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));

            }
            System.out.println("");
        }


    }
}
