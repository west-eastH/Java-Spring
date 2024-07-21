package jpabook.jpashop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Slf4j
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		log.info("home controller");
		return "home";
	}
}
