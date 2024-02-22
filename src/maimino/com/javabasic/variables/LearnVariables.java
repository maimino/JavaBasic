package maimino.com.javabasic.variables;

public class LearnVariables {
    static int age = 22; //Bien toan cuc (instance)
    public void sayHello() {
        int n = 10;      // Đây là biến local(bien cuc bo)
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        System.out.println(age);

        //Cach goi ham: cach 1
        LearnVariables abc = new LearnVariables();
        abc.sayHello();

        //Cach 2: them static vao truoc void sayHello(): public static void sayHello()
        // sayHello();
    }
}
