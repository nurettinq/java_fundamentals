package kendi_kendime_2;

public class C20_MethodCreatiion {
    public static void main(String[] args) {
        String input = "nurettin";
        System.out.println(tersteYazdır1(input));

    }

    private static String tersteYazdır1(String input) {
        String tersIn = "";
        for (int i = input.length(); i >0 ; i--) {
            tersIn += input.substring(i-1, i );

        }
        return tersIn;
    }
}


