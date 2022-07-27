package day32_StringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        String str="java";
        System.out.println(sb.equals(sb2));
        System.out.println(sb.equals(sb));
        System.out.println(sb.equals(str));
        System.out.println(sb.compareTo(sb2));
        StringBuilder sb3 = new StringBuilder("ja");
        System.out.println(sb.compareTo(sb3));
    }
}
