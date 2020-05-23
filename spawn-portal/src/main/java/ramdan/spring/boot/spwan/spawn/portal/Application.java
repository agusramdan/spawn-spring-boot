package ramdan.spring.boot.spwan.spawn.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping( method = {RequestMethod.GET,RequestMethod.POST},path = {"","/","/index3.html"})
	public String index(Model model) {
		return "index3";
	}

	@GetMapping("/{html}.html")
	public String index3(@PathVariable("html") String html , Model model) {
		return html;
	}

	@GetMapping("/pages/{html}.html")
	public String pages(@PathVariable("html") String html ,Model model) {
		return "pages/"+html;
	}

	@GetMapping("/pages/{path}/{html}.html")
	public String pages_examples(@PathVariable("path") String path ,@PathVariable("html") String html , Model model) {
		return "pages/"+path+"/"+html;
	}


}
