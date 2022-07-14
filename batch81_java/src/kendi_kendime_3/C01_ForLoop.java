package kendi_kendime_3;

public class C01_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(" ");
            }
            for (char c='A'; c<'A'+2*i+1; c++) {
                System.out.print(c);}

            System.out.println("");

        }
        for (int i = 3; i >=0 ; i--) {
            for (int j = i; j <=5 ; j++) {
                System.out.print(" ");

            }
            for (char j ='A'; j <='A'+2*i; j++) {
                System.out.print(j);

            }
            System.out.println("");

        }

    }
}

