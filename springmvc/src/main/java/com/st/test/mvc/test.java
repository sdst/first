/**
 * 
 */
package com.st.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author st
 *
 */
@Controller
@RequestMapping("my")
public class test {
	
	@RequestMapping("/welcome")
	public String send(Model model){
		
		model.addAttribute("msg", "Ìø×ª³É¹¦");
		return "welcome";
		
	}
}
