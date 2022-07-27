package practice19temmuz;

public class C05 {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String str="dfjalrşghfdsg sdgdfkh sdfgdfh";
        str=str.replaceAll(" ","");
        System.out.println("str :"+str);
        System.out.println("str length"+str.length());
        String [] harf=str.split("");
        System.out.println(harf.length);


        }
    }

