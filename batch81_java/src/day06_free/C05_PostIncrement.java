package day06_free;

public class C05_PostIncrement {
    public static void main(String[] args) {
        int num1=9;
        int num2=num1++;
        if(num2<10){
            System.out.println(num2+"HelloWorld");
        }
        else {
            System.out.println(num1+"helloUniversal");
        }
    }
}
