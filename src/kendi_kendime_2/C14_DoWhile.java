package kendi_kendime_2;

public class C14_DoWhile {
    public static void main(String[] args) {
        //Type code to print unique characters in a String. For example; Hello ==> Heo
        String s = "Hello";
        int i = 0;
        do{
            String c = s.substring(i,i+1);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
            }
            i++;
        }while(i<s.length());

    }
}
