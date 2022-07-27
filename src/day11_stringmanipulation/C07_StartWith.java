package day11_stringmanipulation;

public class C07_StartWith {
    public static void main(String[] args) {
        String input="java gün geçtikçe güzelleşiyor";
        System.out.println(input.startsWith("java"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gün",5));

    }
}
