package kendi_kendime_3;

public class C09_Task_3 {
    public static void main(String[] args) {

        for (int i = 0; i <8 ; i++) {
            for (int j = 1+i*(i+1)/2; j <=i+1+i*(i+1)/2; j++) {
                System.out.print(j);
            }
            System.out.println("");

        }
    }
}
