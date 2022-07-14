package kendi_kendime_3;

import java.util.Scanner;

public class C02_SesliHarf {
    public static void main(String[] args) {


        /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String str = scan.next();
        if (str.length() > 1) {
            System.out.println("Fazla karakter girdiniz");
        } else {
            char harf = str.charAt(0);
            for (char i = 0; i < 255; i++) {
                if (harf>='a'&& harf<='z') {
                    if (harf == 'a' || harf == 'e' || harf == 'u' || harf == 'i' ||
                            harf == 'o') {
                        System.out.println("Girdiginiz harf sesli harftir");
                        i = 256;

                    } else System.out.println("Girdiginiz harf sessiz bir harftir");
                    i = 256;
                } else System.out.println("Yanlis karakter girdiniz");
                break;
            }


        }
    }}*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String str=scan.next();
        char harf=str.charAt(0);
        int harf1=0;

        for ( char i = 97; i<255; i++) {


            System.out.println(harf1);
            if (!(harf<=122 && harf>=97) || str.length()>1){
                System.out.println("yanlıs karakter girdiniz");


            }else if (harf=='a'||harf=='e'||harf=='u'||harf=='o'|| harf=='i'){
                System.out.println("sesli");
            }else
                System.out.println("sessiz");
            break;
        }
    }}
