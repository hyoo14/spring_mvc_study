package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") //서블릿 name, urlPatterns 은 중복이 있으면 안됨
public class HelloServlet extends HttpServlet {

    //서블릿이 호출되면 아래의 서비스 메서드가 호출됨
    //클라이언트에서 http 요청이오면 WAS의 서블릿 컨테이너가 request, response 객체를 생성해서 서블릿에 넘겨줌
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);

    }
}
