package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.myuserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/write")
    public String write(){
        return "write_form";
    }

    @PostMapping("/write")
    public String write(@ModelAttribute myuserDTO dto){
        System.out.println("아이디 : "+dto.getId());
        System.out.println("이름 : "+dto.getName());

        return "write_form";
    }
}
