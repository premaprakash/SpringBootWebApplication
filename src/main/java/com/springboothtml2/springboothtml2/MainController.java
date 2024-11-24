package com.springboothtml2.springboothtml2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
 /**
 * @return
 */
@RequestMapping("/")
  public String index() {
    System.out.println("Request reaching to the controller");
	  return "index";
  }
}
