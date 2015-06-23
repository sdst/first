package org.all.user.action;

import javax.annotation.Resource;

import org.all.user.domain.User;
import org.all.user.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
@Controller
@Scope("prototype")
@Namespace("/user")
public class UserAction {
	@Resource
	private UserService userService;

	@Action("saveUser")
	public String saveuser(){
		User user = new User();
		user.setuId("1111");
		user.setuAge(12);
		userService.saveUser(user);
		return null;
	}
}
