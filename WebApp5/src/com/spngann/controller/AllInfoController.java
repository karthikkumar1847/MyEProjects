package com.spngann.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spngann.bo.AllInfoBO;
import com.spngann.validation.AddingInfoValidationException;
import com.spngann.vo.AllInfoVO;

@Controller
@SessionAttributes("AllForm")
public class AllInfoController {

	@Autowired
	private AllInfoBO allInfoBO = null;
	
	public AllInfoController() {
		
	}

	@RequestMapping(value = "/pageEntry.do")
	public String displayPersonalPage(Model model){  // AllInfoVO allInfoVo)
		AllInfoVO allInfoVo = new AllInfoVO();
		model.addAttribute("AllForm",allInfoVo);
		return "PersonalInfoPage";
	}
	@RequestMapping(value = "/personalInfo1.do")
	public ModelAndView displayContactPage(@ModelAttribute("AllForm") AllInfoVO allInfoVo,BindingResult result){
		String errors = "";
		try {
			allInfoBO.addRecordPersonal(allInfoVo);
		}catch (AddingInfoValidationException e) {
			errors = e.getErrorMsg();
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(!errors.equals("") || result.hasErrors()){
			ModelAndView mv = new ModelAndView("PersonalInfoPage");
			mv.addObject("errors",errors);
			return mv;
		}
		ModelAndView mv = new ModelAndView("ContactInfoPage");
		return mv;
	
	
	}
	@RequestMapping(value = "/contactInfo.do")
	public ModelAndView displayBankPage(@ModelAttribute("AllForm") AllInfoVO allInfoVo,BindingResult result){
		String errors = "";
		try {
			allInfoBO.addRecordContact(allInfoVo);
		}catch (AddingInfoValidationException e) {
			errors = e.getErrorMsg();
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(!errors.equals("") || result.hasErrors()){
			ModelAndView mv = new ModelAndView("ContactInfoPage");
			mv.addObject("errors",errors);
			mv.addObject("result",result);
			return mv;
		}
		ModelAndView mv = new ModelAndView("BankInfoPage");
		return mv;
	}
	@RequestMapping(value = "/bankInfo.do")
	public ModelAndView displayOutputPage(@ModelAttribute("AllForm") AllInfoVO allInfoVo,BindingResult result){
		
		System.out.println("Starting of AllInfoController: displayOutputPage()");
		String errors = "";
		System.out.println(allInfoVo.getAccountNumber());
		try {
			allInfoBO.addRecordBank(allInfoVo);
		}catch (AddingInfoValidationException e) {
			errors = e.getErrorMsg();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Completed AllInfoController: displayOutputPage()");
		
		if(!errors.equals("") || result.hasErrors()){
			ModelAndView mv = new ModelAndView("BankInfoPage");
			mv.addObject("errors",errors);
			return mv;
		}
		ModelAndView mv = new ModelAndView("OutputPage");
		return mv;
	}
	
}
