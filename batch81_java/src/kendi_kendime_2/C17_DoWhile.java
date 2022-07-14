package kendi_kendime_2;

import java.sql.SQLOutput;

public class C17_DoWhile {
    public static void main(String[] args) {
        //Type code to print repeated characters in a String. For example; accessories ⇒ ces
        String a="accessories";
        int i=0;

            String box="";
            do{
            String b=a.substring(i,i+1);
            if(a.indexOf(b)!=a.lastIndexOf(b)){
                if(!box.contains(b)){

                box+=b;
            }
        }i++;
    }while(i<a.length());
        System.out.println(box);
}}
