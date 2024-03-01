package maimino.com.javabasic.dieukien;

public class DieuKienIfElse {
    public static void main(String[] args) {
        int age = 20;
        String name = "Mai";
        String message = "Them thanh cong";
        if (age > 18 && (name.equals("Mai") || message.contains("thanh cong"))) {
            System.out.println("Tuổi lớn hơn 18 va ten la Mai");
        }
        else {
            System.out.println("Tuoi nho hon 18 va ten khac Mai");
        }

        int number = 13;
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }
    }
}
