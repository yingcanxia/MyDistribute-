package cn.shadow.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.shadow.dto.SelectRequest;
import cn.shadow.dto.SelectResponse;
import cn.shadow.entity.User;
import cn.shadow.user.IUserService;
import cn.shadow.util.PageData;

@Controller
@RequestMapping(value = "/test")
public class UserController {
	@Autowired
	private IUserService userService;
	@ResponseBody
	@RequestMapping("/aas")
	public User  selectUser(HttpServletRequest request) {
		PageData pd=new PageData(request);
		SelectRequest request2=new SelectRequest();
		request2.setId("1");
		SelectResponse response=userService.select(request2);
		User user=response.getUser();
		return user;
	}
}
