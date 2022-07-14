package kendi_kendime_3;

public class C04_TersCumle {
    //  Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    //
    //
    //
    //    Test Data:
    //
    //    sentence -> "Java is fun"
    //
    //    reversed -> "fun is Java
    public static void main(String[] args) {

        String sentence = "java is fun but hard";
        sentence=" "+sentence;
        String box="";

        for (int i = sentence.length()-1; i >=0 ; i--) {
            String s="";
            if(sentence.charAt(i) == ' '){
                s=sentence.substring(i);
                sentence = sentence.substring(0,i);
                box+=s;
                }
        }
        System.out.println(box);



        }


    }
