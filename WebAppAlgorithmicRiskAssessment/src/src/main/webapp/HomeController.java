package src.main.webapp;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping({"/", "/homepage"})
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home";
	}

}
