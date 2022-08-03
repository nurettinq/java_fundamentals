package day36_inheritancedatatypekullanimi;

public class APersonel {
    protected String isim="isim belirtilmedi";
    protected String soyisim="soyisim belirtilmedi";
    protected String departmant="departman  belirtilmedi";
    protected void maas(){
        System.out.println("tüm personelimiz maas alır");
    }
    protected void sigorta(){
        System.out.println("tüm personelimiz sigortalıdır");
    }
}
