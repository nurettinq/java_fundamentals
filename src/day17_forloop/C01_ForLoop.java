package day17_forloop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen inputa göre * lardan bir üçgen oluşyturun
        int input=4;
        for (int i = 0; i <=input ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

                }

            }
            System.out.println("");
        }
    }
