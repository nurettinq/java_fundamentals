package day15_overloading_forloop;

public class C05_ForLoop {
    public static void main(String[] args) {
        String input="java gün geçtikçe güzelleşiyor";
        terstenYazdır(input);

    }

    public static void terstenYazdır(String input) {
        String tersInput="";

        for (int i = input.length()-1; i >= 0; i--){
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }


}



