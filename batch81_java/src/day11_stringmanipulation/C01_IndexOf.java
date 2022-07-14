package day11_stringmanipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        String str="java ogrenmek cok guzel";
                            //verilen bir  String de herhangi bir string veya char ın ilk kullanıldıgı indexof verir
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("mek"));
        System.out.println(str.indexOf("g",6+1));
        int ilk_e=str.indexOf("e");
        int ikinci_e=str.indexOf("e",ilk_e+1);

                                    //ikinci e olup olmadığını ögrenmek için if else yapıyoruz

        if (ikinci_e==-1){
            System.out.println("verilen str da ikinci e yoktur");
        }else {
            System.out.println("ikinci_e:"+(ikinci_e+1));

            int ucuncu_e = str.indexOf("e", ikinci_e + 1);


            if (ucuncu_e == -1) {
                System.out.println(" verilen sr da ucuncu_e yoktur");
            } else {
                System.out.println("verilen str da ucuncu_e:" + ucuncu_e);
            }

        }



    }

}
