package day18_whileloop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //9 ile 190 arasındaki 7 ye bölünenleri yazdırın
        int bas=9;
        int bit=190;
        int temp=bas;

        while(temp>7){
            if(temp%7==0){
                System.out.println(temp+" ");
                temp++;
            }

            System.out.println("");
        }


        }
    }

