/**
 * 
 */
package com.st.springvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author st
 *
 */
@Controller
public class TestControllor {
	
	@RequestMapping("/send")
	public String Test(Model model){
		
		model.addAttribute("message", "it is ok!!");
		
		return "test";
		
		
	}
}
