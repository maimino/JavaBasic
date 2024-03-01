package maimino.com.javabasic.mang;

public class BTLuuSoChan {
    public static void main(String[] args) {
        int a[] = new int[26]; //co 26 so chan tu 0 den 50

        //Tao vong lap for de in va luu so chan
        int index = 0;
        for (int i = 0; i<=50; i+=2){
            System.out.println(i); //in ra cac so chan tu 0 den 50
            a[index] = i; //luu so chan vao mang
            index++;
        }

        //Duyet mang de in ra ket qua
        System.out.println("Cac so chan trong mang: ");
        for (int number : a){
            System.out.println(number);
        }
    }
}
