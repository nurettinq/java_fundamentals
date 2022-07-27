package day24_foreachlopp;

import java.util.ArrayList;
import java.util.List;

public class C08_ForEachLoop {
    public static void main(String[] args) {
        String[]arr1={"ali","veli","ayse"};
        String[]arr2={"ali","hasan","ayse","enes"};
        List<String> ortakİsimler=new ArrayList<>();
        for(String each:arr1){
            for(String each2:arr2){
                if(each.equalsIgnoreCase(each2)){
                    ortakİsimler.add(each);
                }
            }
        }
        if(ortakİsimler.isEmpty()){
            System.out.println("hiç ortak eleman yook ");
        }else{

        }
        System.out.println("her iki arrayda ortak isimler"+ortakİsimler);

    }
}
