package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello", name = "helloServlet")
public class HelloServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/plain");
    resp.setCharacterEncoding("utf-8");
    System.out.println("HelloServlet.service");
    PrintWriter out = resp.getWriter();
    System.out.println("req = " + req);
    System.out.println("resp = " + resp);

    String name = req.getParameter("name");

    String age = req.getParameter("age");
    System.out.println("name = " + name);
    System.out.println("age = " + age);
    out.printf("name : %s\n", name);
    out.printf("age : %s", age);
  }

}
