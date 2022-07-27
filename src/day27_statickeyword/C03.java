package day27_statickeyword;

public class C03 {
    //static olamsına dikkat !!! eger instance olsaydı sonuç farklı olurdu.+
   static int count=0;
    public void increment(){
        count++;

    }

    public static void main(String[] args) {
        C03 obje1=new C03();
        C03 obje2=new C03();
        obje1.increment();
        obje2.increment();
        System.out.println("obje1 :count is " +obje1.count);
        System.out.println("obje2 :count is " + obje2.count);

    }
}
