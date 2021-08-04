package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
//Json을 파싱하기 위해 만든 객체이고 Json 라이브러리가 getter, setter를 호출해서 데이터를 가져 오거나 바이딩함
public class HelloData {

    private String username;
    private int age;

}
