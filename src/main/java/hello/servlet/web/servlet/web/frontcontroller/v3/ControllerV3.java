package hello.servlet.web.servlet.web.frontcontroller.v3;

import hello.servlet.web.servlet.web.frontcontroller.ModelView;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String > paramMap);
}
