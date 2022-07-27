package kendi_kendime_4;

public class C04_SstringManip {
    public static void main(String[] args) {

    String input="asde254df";
    String[]harf=input.split("");
    int sum=0;
        for (int i = 0; i <harf.length; i++) {
            if(Character.isDigit(harf[i].charAt(0))) {
                sum+=Integer.parseInt(harf[i]);
            }

        }
        System.out.println(sum);

        }
}
