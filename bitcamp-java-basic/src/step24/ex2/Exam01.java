package step24.ex2;

public class Exam01 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println("실행 흐름명 = " + t.getName());
    }
}
