package ornek_sorular;

public class C03_soru_5 {
    /*-Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
            *
            ***
            *****
            *******
            *********
            ***********
            *************
            ***********
            *********
            *******
            *****
            ***
            *

     */
    public static void main(String[] args) {
        for (int i = 0; i <8 ; i++) {
            for (int j =0; j <2*i-1 ; j+=2) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}
