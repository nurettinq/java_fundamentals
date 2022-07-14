package day17_forloop;

public class C04_ForLoop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input="kader gayrete asiktir";
        tekrarsızınput(input);

    }

    private static void tekrarsızınput(String input) {

        String tekrarsiz="";
        String harf;
        String bosluksuz=input.replaceAll("\\W","");

        for (int i = 0; i <=bosluksuz.length()-1; i++)  {
            harf=bosluksuz.substring(i,i+1);
            if(!tekrarsiz.contains(harf)){
                System.out.print(harf+",");
                tekrarsiz+=harf;

            }

        }

    }
}
