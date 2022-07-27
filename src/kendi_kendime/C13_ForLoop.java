package kendi_kendime;

public class C13_ForLoop {
    public static void main(String[] args) {
        String input="love";
        for (int i = 0; i <input.length() ; i++) {
            for (int j = i; j <input.length(); j++) {
                System.out.print(input.substring(j,j+1));
            }
            System.out.println("");

        }

    }
}
