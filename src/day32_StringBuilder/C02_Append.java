package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java daha ne yapsın");
        sb.append("?");
        System.out.println(sb);
        sb.insert(4," herşeyi düşünmüş");
        System.out.println(sb);
        sb.insert(22," size   ",1,6);
        System.out.println(sb);
    }
}
