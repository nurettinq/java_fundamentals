package kendi_kendime_4;

public class C03_CallCostructor {
    int x=3;
    int y=5;
    C03_CallCostructor() {
        x += 1;
        System.out.println("-x" + x);
        }
        C03_CallCostructor(int i) {
            this();
            this.y = i;
            x += y;
            System.out.println("-x" + x);
          }
          C03_CallCostructor(int i,int i2) {
        this(3);
        this.x-=4;
              System.out.println("-x" + x);
          }

    public static void main(String[] args) {
        C03_CallCostructor mc1=new C03_CallCostructor(4,3);
    }

}
