package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//모든 컨트롤러에서 뷰로 이동하는 부분에 중복이 있어 깔끔하지 않은 부분을 해결한 V2
//컨트롤러가 MyView 호출/반환하게 구현
public interface ControllerV2 {

    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
