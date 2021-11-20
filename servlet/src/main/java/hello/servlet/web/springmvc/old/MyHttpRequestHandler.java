package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("/springmvc/request-handler") // BeanNameUrlHandlerMapping
public class MyHttpRequestHandler implements HttpRequestHandler {
    // 이 HttpRequestHandler 인터페이스의 인스턴스를 대상으로 하는 핸들러 어댑터가 있으므로
    // 핸들러를 실행하고 결과를 반환함.

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MyHttpRequestHandler.handleRequest");
    }
}
