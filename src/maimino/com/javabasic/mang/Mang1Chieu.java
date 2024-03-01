package maimino.com.javabasic.mang;

public class Mang1Chieu {
    public static void main(String[] args) {
        //Khai bao mang
        int a[] = new int[3];

        //Them gia tri vao mang thu cong cho tung vi tri
        //Mang bat dau tu vi tri 0
        a[0] = 11;
        a[1] = 23;
        a[2] = 35;

        //Dung lai voi gia tri be hon do dai cua mang vi no bat dau tu 0
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Do dai mang: " + a.length);

        //Them gia tri vao mang thong qua vong lap for
        for (int i = 0; i<a.length; i++){
            if (i%2==0){
                a[i] =4;
            }
        }

        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
