package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") //이름 패턴 중복 x
public class HelloServlet extends HttpServlet {

    @Override //ctrl + o -> 서비스 orverride
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);
        //application.properties에 debug 추가할 수 있음. 하지만 debugger는 개발중일 때만 사용 권장. 실서비스에서는 로드가 커지기 때문

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8"); //문자인코딩은 대부분 utf-8!
        response.getWriter().write("hello " + username);

    }
}
