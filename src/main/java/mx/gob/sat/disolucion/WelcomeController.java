package mx.gob.sat.disolucion;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

//	@RequestMapping("/")
//	@ResponseBody
	public String welcome() {
		return "welcome";
	}

}
