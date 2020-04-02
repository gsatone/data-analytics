package main.java.config;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import src.main.webapp.HomeController;
public class HomeControllerTest{

	@Test
	  public void testHomePage() throws Exception {
	    HomeController controller = new HomeController();
	    MockMvc mocMvc = standaloneSetup(controller).build();
	    mocMvc.perform(get("/")).andExpect(view().name("home"));
	}
}
