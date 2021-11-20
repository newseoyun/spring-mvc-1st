package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/springmvc/old-controller") // 핸들러 매핑 1순위는 RequestMapping, 2순위는 스프링 빈 이름. (BeanNameUrlHandlerMapping)
public class OldController implements Controller { // 핸들러 매핑 정보로 핸들러 어댑터를 찾음.
    // Controller 인터페이스의 인스턴스를 대상으로 하는 어댑터가 있으므로 어댑터 실행하고 반환함.

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}
