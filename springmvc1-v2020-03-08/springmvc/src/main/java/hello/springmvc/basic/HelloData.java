package hello.springmvc.basic;

import lombok.Data;
//요청 파라미터를 받아서 필요한 객체를 만들고 그 객체에 값을 넣어주는 과정을 자동화 해주는 @ModelAttribute 실습용
@Data
public class HelloData {
    private String username;
    private int age;
}
