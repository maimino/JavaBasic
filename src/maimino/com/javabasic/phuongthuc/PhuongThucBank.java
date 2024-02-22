package maimino.com.javabasic.phuongthuc;

import maimino.com.javabasic.kieudulieu.Bank;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        double tongTien = Bank.getInterestRate() *1000;
        System.out.println("Tong tien lai: " + tongTien);
    }
}
