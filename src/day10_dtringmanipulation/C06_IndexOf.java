package day10_dtringmanipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str="java ogrenmek cok güzel";
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf('t')); //bana integer döndürüyor
                                               // - (eksi) bir  olarak olmayan karakteri değerler
                                                // yani t harfi str da olmadığı için -1 olarak yazdırır
        String str2 = "fsdlggşhvcsmfsaifkgdfpkhojüa,,hmgdgmbm";
        if (str2.indexOf("p")==-1){
            System.out.println("str2 de p harfi yok");
        }else{
            System.out.println("str2 de p harfi var");
        }

    }
}
