package kendi_kendime_3;

import java.util.ArrayList;
import java.util.List;

public class C17_ArrayListeCevirme {
    public static void main(String[] args) {
        /*Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
        Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]*/
        String[]yazilim={ "python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String>yazilimList=new ArrayList<String>();
        for (int i = 0; i < yazilim.length  ; i++) {
            yazilimList.add(yazilim[i]);

        }
        System.out.println(yazilimList);
    }
}
