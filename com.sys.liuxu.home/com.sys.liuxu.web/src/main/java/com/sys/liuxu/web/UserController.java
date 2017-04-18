package com.sys.liuxu.web;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.com.sys.liuxu.iservice.IUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.liuxu.entity.UserInfoVo;





@Controller
public class UserController {

	/*private static Log runLog = LogFactory.getLog("runLogger");// ������־
	private static Log interfaceLog = LogFactory.getLog("interfaceLogger");// �ӿ���־

	// slf4j
	private Logger logtest = LoggerFactory.getLogger(UserController.class);
*/
	@Autowired
	private IUserInfoService userInfoService;

	@RequestMapping("/index")
	public String login(ModelMap modelMap) {

		//logtest.info("slf4j gogogogo");
		//logtest.error("slf4j errorslf4j errorslf4j errorslf4j errorslf4j error");

		UserInfoVo u = new UserInfoVo();
		u = userInfoService.login(u);

		modelMap.addAttribute("msg", u.getName() + "||" + u.getId() + "||" + u.getPassword());

		System.out.println("dddddddddddddddddd");

		List<UserInfoVo> list = userInfoService.GetUserList();

		UserInfoVo mo = userInfoService.selectByPrimaryKey("2");
		return "test";
	}

}
