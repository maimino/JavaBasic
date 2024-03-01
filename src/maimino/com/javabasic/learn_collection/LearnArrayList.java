package maimino.com.javabasic.learn_collection;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {

        //Khai bao ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        //Them phan tu vao ArrayList
        arrayList.add("Selenium");
        arrayList.add("TestNG Framework");
        arrayList.add("Selenium");
        arrayList.add(3, "Extent Report"); //Them vao voi vi tri chi dinh

        //Remove phan tu trong arraylist
        arrayList.remove("Selenium");
        arrayList.remove(2);


        //Duyet ArrayList - dung FOR co ban
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("============");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("One");
        arrayList2.add("Two");

        //Add All arraylist 2 vao arraylist
        arrayList.addAll(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("===========");

        //Tim kiem phan tu trong Arraylist
        System.out.println("Tim kiem phan tu: " + arrayList.contains("Selenium"));

        //Chuyen ArrayList ve dang Array
        Object[] mang = arrayList.toArray();
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }

    }

}
