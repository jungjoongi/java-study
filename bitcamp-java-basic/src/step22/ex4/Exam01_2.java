// 객체읽기 - 파일이 데이터를 읽어 인스턴스로 만들기
package step22.ex4;

import java.io.FileInputStream;

public class Exam01_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test4.data");
        
        Member member = null;
        
        member = new Member();
        
        //1) 이름읽기
        byte[] buf = new byte[100];
        int size = in.read();
        in.read(buf, 0, size);
        member.name = new String(buf, 0, size, "UTF-8");
        
        //2) 나이읽기
        member.age = in.read() << 24;
        member.age += in.read() << 16;
        member.age += in.read() << 8;
        member.age += in.read();
        
        //3)
        if (in.read() == 1)
            member.gender = true;
        else
            member.gender = false;

        
        
        in.close();
        
        System.out.printf("%s\n", in.read());
    }
}






