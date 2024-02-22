package maimino.com.javabasic.toantu;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        String s = (a % b == 0) ? "a chia het cho b" : "a khong chia het cho b";
        System.out.println(s);
    }
}
