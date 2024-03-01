package maimino.com.javabasic.dieukien;

public class DieuKienIfElseIf {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        String name = "Mino";

        if(number1 > 30){
            System.out.println("Thoa man dieu kien 1");
        } else if (number1 >= 20){
            System.out.println("Thoa man dieu kien 2");
        } else if (number1 >= 10) {
            System.out.println("Thoa man dieu kien 3");
        } else {
            System.out.println("Khong thoa man dieu kien nao");
        }
    }
}
