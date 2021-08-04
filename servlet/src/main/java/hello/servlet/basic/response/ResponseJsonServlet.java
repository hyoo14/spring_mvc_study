package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: application/json
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        //객체에 데이터 매핑
        HelloData helloData = new HelloData();
        helloData.setUsername("kim");
        helloData.setAge(20);

        //Json 생성성
       //{"username":"kim", "age":20}
        String result = objectMapper.writeValueAsString(helloData);
        //getWriter()를 사용하면 추가 파라미터를 동적으로 추가함. 만약에 이게 싫으면 getOutputStream() 을 사용하면 됨
        response.getWriter().write(result);
    }
}
