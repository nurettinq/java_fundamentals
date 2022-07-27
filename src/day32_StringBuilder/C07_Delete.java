package day32_StringBuilder;

public class C07_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java her zaman güzeldir");
        sb.delete(8,9);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        int son=sb.length();
        for (int i = 0; i <son; i++) {
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}
