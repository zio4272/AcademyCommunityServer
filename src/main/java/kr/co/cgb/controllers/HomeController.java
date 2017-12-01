package kr.co.cgb.controllers;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.cgb.dao.PostDao;
import kr.co.cgb.dao.UserDao;
import kr.co.cgb.service.AcademyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Resource(name = "kr.co.cgb.service.AcademyServiceImpl")
	private AcademyService mService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/get_signup_user")
	@ResponseBody
	public Map<String, Object> getSignupUsers(@RequestParam(value = "") Map<String, Object> map) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "가입완료");
		mService.get_signup_user(map);
		return resultMap;
	}

	@RequestMapping(value = "/login_user")
	@ResponseBody
	public Map<String, Object> userLogin(@RequestParam Map<String, Object> map) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		// resultMap.put("result", "로그인한 회원");

		// Map<String, Object> params = new HashMap<String, Object>();

		UserDao users = mService.userLogin(map);

		if (users != null) {
			resultMap.put("result", users);

		} else {
			resultMap.put("result", "로그인실패");
		}

		return resultMap;

	}

	@RequestMapping(value = "/user_id_check")
	@ResponseBody
	public Map<String, Object> userIdCheck(@RequestParam Map<String, Object> map) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		mService.userIdCheck(map);
		
		if (mService.userIdCheck(map) != null) {
			resultMap.put("result", "중복입니다");
		} else {
			resultMap.put("result", "사용가능합니다.");
		}

		return resultMap;
	}
	
	@RequestMapping(value = "/write_post")
	@ResponseBody
	public Map<String, Object> writePost(@RequestParam(value = "") Map<String, Object> map) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "글작성완료");
		mService.writePost(map);
		return resultMap;
	}
	
	@RequestMapping(value = "/get_post")
	@ResponseBody
	public Map<String, Object> getPost(@RequestParam Map<String, Object> map) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		// resultMap.put("result", "로그인한 회원");

		// Map<String, Object> params = new HashMap<String, Object>();

		List<Map<String,Object>> post = mService.getPost(map);
		resultMap.put("result", post);

		return resultMap;

	}
	
	@RequestMapping(value = "/get_lecture")
	@ResponseBody
	public Map<String, Object> getLecture(@RequestParam Map<String, Object> map) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
				
	
		resultMap.put("result", mService.getLecture(map));

		return resultMap;

	}


}
