package day21_arrays;

import java.util.Scanner;

public class C03_ContainsMetod {
    public static void main(String[] args) {
        //verilen arrray da istenen elemani içerip içermediğini bize veren bir metod yazın
        String[] isimler={"nuri","fatih","adem","nurettin","nurullah"};
        Scanner scan=new Scanner(System.in);
        System.out.println("arana ismi girniz");
        String aranaIsim=scan.nextLine();
        boolean sonuc=contains(isimler,aranaIsim);

        if(sonuc) System.out.println("girilen isim listede var");
        else System.out.println("girilen isim listede yok");

    }

    public static boolean contains(String[] isimler, String aranaIsim) {
        boolean sonuc=false;

        for (int i = 0; i <isimler.length; i++)  {
            if(isimler[i].equalsIgnoreCase(aranaIsim)){
                sonuc=true;


            }

        }

        return sonuc;
    }
}
