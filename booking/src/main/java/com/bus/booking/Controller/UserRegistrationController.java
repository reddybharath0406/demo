package com.bus.booking.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bus.booking.component.UserSignupDetails;
import com.bus.booking.service.UserService;

@Controller
public class UserRegistrationController {
	@Autowired
	UserSignupDetails userSignUpDetails;
	@Autowired
	UserService userService;
	@RequestMapping(value="usersignup",method=RequestMethod.GET)
	public String userSignUp(Model model) {
		model.addAttribute("UserSignupDetails",userSignUpDetails);
		return "bharathbus";
	}
	@RequestMapping(value="usersignup",method=RequestMethod.POST)
	public String userSignUp(@Valid @ModelAttribute("UserSignupDetails") UserSignupDetails userSignupDetails,BindingResult result,ModelMap map) {
		if(result.hasErrors()) {
			return "bharathbus";
		}else {
			//userService.save(userSignupDetails);
		map.put("success", userSignupDetails.getFirstname()+"Your Registration Successful");
		return "success";
	}
	}
	
	
	
	/*
	 * @RequestMapping(value="useredit/{userid}",method=RequestMethod.GET) public
	 * String userUpdate(Model model,@PathVariable("userid")int userid) {
	 * 
	 * model.addAttribute("UserSignupDetails",userService.getUser(userid)); return
	 * "userupdate"; }
	 * 
	 * @RequestMapping(value="userupdate",method=RequestMethod.PUT) public String
	 * userUpdate(@Valid @ModelAttribute("UserSignupDetails") UserSignupDetails
	 * userSignupDetails,BindingResult result,ModelMap map) { if(result.hasErrors())
	 * { return "userupdate"; }else { userService.save(userSignupDetails);
	 * map.put("success",
	 * userSignupDetails.getFirstname()+"Your Registration Update Successful");
	 * return "success"; } }
	 */
	@ModelAttribute("states")
	public List<String> initialzeStates(){
		List<String> list=new ArrayList<>();
		list.add("AndhraPradesh");list.add("Karnataka");list.add("Tamilanadu");list.add("kerala");
		return list;
	}
	@ModelAttribute("countries")
	public List<String> initializeCountries(){
		List<String> list=new ArrayList<>();
		list.add("India");list.add("America");list.add("Australia");list.add("Japan");
		return list;
	}

}
