package hello.servlet.web.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.servlet.web.frontcontroller.v3.ControllerV3;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");

    }
}