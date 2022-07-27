package day32_StringBuilder;

public class C04_SubSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("nurettin");
        sb.substring(0,3);
        // bu metot String dondurdugu için
        // stringbuilder in eski halini degiştiremez
        System.out.println(sb);
        sb.subSequence(0,3);
        System.out.println(sb);
    }
}
