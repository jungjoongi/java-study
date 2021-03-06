package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_2 {

    static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2)
            throw new SQLException();
        else
            throw new IOException();
    }


    public static void main(String[] args) throws Exception {
        //예외를  처리하고 싶지 않다면 이전 호출자에게 책임을 떠 넘겨라
        // -> main() 호출자는 JVM이고,
        //    JVM은 main() 예외를 던지는 순간 즉시 실행을 멈춘다
        //    그래서 main()의 호출자에게 책임을 떠넘기는것은 바람직하지 않다.
        //    즉 main()은 예외처리의 마지막 보루이다.
        m(1);
    }
}
