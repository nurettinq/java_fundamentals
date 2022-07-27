package day07_ifstatement;

import java.util.Scanner;

public class C03_BasitIfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String inputDay=scan.next().toLowerCase();
        if(inputDay.equals("pazar")||inputDay.equals("cumartesi")){
            System.out.println("input day is weekend day "+ inputDay);

        }
        if(inputDay.equals("pazartesi")||inputDay.equals("salı")||inputDay.equals("çarşamba")||inputDay.equals("perşembe")||inputDay.equals("cuma")){
            System.out.println("input day is weekday "+ inputDay);
        }
        if(!(inputDay.equals("pazartesi")||inputDay.equals("salı")||inputDay.equals("çarşamba")||inputDay.equals("perşembe")||inputDay.equals("cuma")||inputDay.equals("cumartesi")||inputDay.equals("pazar"))){
            System.out.println("lütfen geçerli birgün giriniz "+ inputDay);
        }


    }
}
