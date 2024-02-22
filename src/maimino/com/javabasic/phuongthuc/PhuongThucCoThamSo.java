package maimino.com.javabasic.phuongthuc;

public class PhuongThucCoThamSo {
    static float INTEREST_RATE = 73f;

    public static double tinhLai(long soTienGui) {
        return ((soTienGui * INTEREST_RATE) / 100);
    }

    public static int cong2so(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println("Tien lai sau 12 thang la: " + tinhLai(5000000));
        System.out.println("Cong 2 so nguyen: " + cong2so(2, 5));
    }
}
