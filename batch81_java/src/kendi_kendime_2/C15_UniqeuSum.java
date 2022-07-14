package kendi_kendime_2;

public class C15_UniqeuSum {
    public static void main(String[] args) {
      //  Type code to find the sum of the unique digits of an integer
      //  Example: 12133455 Ş 2+4=6
        int a=124541232;
        String b=String.valueOf(a);
        int toplam=0;
        int i=0;
        do{

            String d=b.substring(i,i+1);
            if (b.indexOf(d)==b.lastIndexOf(d)){
                toplam+=Integer.parseInt(b.substring(i,i+1));

            }

            i++;
        }while(i<b.length());
        System.out.println("toplam "+toplam);
    }
}
