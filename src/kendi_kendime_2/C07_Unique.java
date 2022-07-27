package kendi_kendime_2;

import static java.lang.String.valueOf;

public class C07_Unique {
    public static void main(String[] args) {
        //Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
        int num=1234455;
        String nums=String.valueOf(num);

        String box="";


        int i=0;


        do{
            String c=nums.substring(i,i+1);
            if (nums.indexOf(c)==nums.lastIndexOf(c)) {
                box+=c;
            }
            i++;

        }while(i<nums.length());
        System.out.println(box);


        }
    }
