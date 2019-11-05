import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//过滤器的生命周期   从服务器启动到服务器关闭
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("访问之前");
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        HttpSession hs = ((HttpServletRequest) servletRequest).getSession();
     //   if (hs.getAttribute("user")==null){
       //     ((HttpServletResponse)servletResponse).sendRedirect("/index.jsp");
      //  }else {
            filterChain.doFilter(servletRequest,servletResponse);

     //   }

        System.out.println("访问之后");
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");//在服务器关闭的时候执行
    }
}
