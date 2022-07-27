package day04_dataCasting;

public class C01_DataCAsting {
    public static void main(String[] args) {
        char harf='a';
       // char yeniharf=harf+1; //kod bu durumda önce sağ tarafı yapar
                              //yeniharf=97+1
                             //char bir variable 98 olamadığı için java hata verir
        char yeniHarf=(char)(harf+1);
    }
}
