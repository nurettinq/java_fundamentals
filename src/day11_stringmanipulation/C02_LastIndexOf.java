package day11_stringmanipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String cumle="java cok kolay java ogrenmek cok guzel";
        String kelime="guzel";
                     // verilen kelime cümlede kullanılmamış
                     // verilen kelime cümlede bir kez kullanılmış
                    // verilen kelime cümlede birden fazla kullanılmış
        int kelimeIndexOf=cumle.indexOf(kelime);

        int kelimeLastIndex=cumle.lastIndexOf(kelime);
        if (kelimeIndexOf==-1){
            System.out.println("kelime cümlede yok");
        }else if(kelimeIndexOf==kelimeLastIndex){
            System.out.println("kelime cümlede birkez kullanılmış");
        }else{
            System.out.println("kelime cümlede birden fazla kullanılmıştır");
        }
    }
}
