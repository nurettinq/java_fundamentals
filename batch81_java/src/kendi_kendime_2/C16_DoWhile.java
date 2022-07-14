package kendi_kendime_2;

public class C16_DoWhile {
    public static void main(String[] args) {
        //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers
        int i=120;
        do{
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }i--;
        }while(i>11);
    }
}
