package day32_StringBuilder;

public class C05_LastIndexOf {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("pay attention please");
        System.out.println(sb.indexOf("e"));
        System.out.println(sb.indexOf("e",8));
        System.out.println(sb.lastIndexOf("e"));
        System.out.println(sb.lastIndexOf("e",8));
    }
}
