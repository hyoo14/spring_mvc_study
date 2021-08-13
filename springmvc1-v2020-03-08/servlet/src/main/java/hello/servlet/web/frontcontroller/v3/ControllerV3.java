package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

//요청 파라미터 정보를 자바의 map으로 대신 넘기도록 하면 컨트롤러가 서블릿 기술을 알 필요 없음.
//즉 프런트컨트롤러에서 지저분한 일(서블릿 등)을 처리해 주는 것.

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
