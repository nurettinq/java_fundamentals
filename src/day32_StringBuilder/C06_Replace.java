package day32_StringBuilder;

public class C06_Replace {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("calm down");
        sb.replace(5,10,"up");
        System.out.println(sb);
        sb.replace(4,5,"-----");
        System.out.println(sb);
    }
}
