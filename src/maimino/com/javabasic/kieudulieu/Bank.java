package maimino.com.javabasic.kieudulieu;

public class Bank {
    static int VAT = 2000;
    static String BANKNAME = "Viettin Bank";
    static String PHONE = "094338282";
    static String ADDRESS = "Nam Dinh";
    static float INTEREST_RATE = 6.5f;
    static float num2 = 2f;

    public static void getBankInfo(){
        System.out.println("Vat: " + VAT);
        System.out.println("Bank Name :" + BANKNAME);
        System.out.println("Phone :" + PHONE);
        System.out.println("Address :" + ADDRESS);
        System.out.println("Interest rate :" + INTEREST_RATE);
    }

    public static float getInterestRate(){
        return INTEREST_RATE;
    }
}
