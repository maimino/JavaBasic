package maimino.com.javabasic.variables;

public class StaticVariables {
    // biến static 'ten'
    public static String ten = "Võ Thái An";

    // biến static 'tuoi'
    public static int tuoi = 21;

    public static void main(String args[]) {
        // Sử dụng biến static bằng cách gọi trực tiếp
        System.out.println("Tên: " + ten);

        // Sử dụng biến static bằng cách gọi thông qua tên class
        System.out.println("Tuổi: " + StaticVariables.tuoi);
    }
}

//Bien static: mang gia tri suot qua trinh chay code, co the goi truc tiep vao ham main hoac mot ham co trang thai "static"
//Bien cuc bo: nam trong ham, chi su dung trong chinh ham do
//Bien toan cuc: nam ngoai ham, duoc su dung o nhieu ham khac nhau nhung ko goi duoc trong ham main