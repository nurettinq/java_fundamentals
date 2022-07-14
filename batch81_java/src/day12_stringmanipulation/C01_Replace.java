package day12_stringmanipulation;

public class C01_Replace {
    public static void main(String[] args) {
        String str="Bu gun ha va cok guz el";
        System.out.println(str.replace(" ",""));
        System.out.println(str.replace("h","j").replace(" ",""));
        System.out.println(str.replace("guz el","harika"));
        System.out.println(str.replace("Bu gun","bugün")
                .replace("ha va","JAVA")
                .replace("guz el", "güzel"));

    }
}
