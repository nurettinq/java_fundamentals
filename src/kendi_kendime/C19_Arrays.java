package kendi_kendime;

public class C19_Arrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int toplamArr=0;
        for (int i = 0; i <arr.length ; i++) {
            toplamArr+=arr[i];

        }
        System.out.println("topşam arr: " + toplamArr);
    }
}
