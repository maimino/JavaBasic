package maimino.com.javabasic.learn_collection;

import java.util.*;

public class KhaiBao_SuDung {
    public static void main(String[] args) {

        //List: co thu tu, luu trung duoc
        //Array List: cho phep luu trung
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playeright");

        for (int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Set: khong co thu tu, khong luu trung duoc, trung thi lay key tren cung
        Set<String> setDemo = new HashSet<String>();

        setDemo.add("Cypress");
        setDemo.add("Cypress"); // Set khong chap nhan 2 gia tri trung nhau -> Khi in chi in ra 1 gia tri
        setDemo.add("akaAT Studio");

        for (String str : setDemo){
            System.out.println(str);
        }

        //Map: luu dang key:value va khi trung thi lay key tren cung
        Map<String, String> mapDemo = new HashMap<>();
        mapDemo.put("Company", "FPT Software");
        mapDemo.put("Address", "Hanoi");
        mapDemo.put("Phone", "0978665432");

        System.out.println(mapDemo.get("Company"));
    }
}
