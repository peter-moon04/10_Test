package com.Test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Test.dto.MemberDTO;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor  //생성자 주입
@Slf4j
@RequestMapping("/members")
@Controller
public class MemberController {

	//회원 가입 페이지
	@GetMapping("/signup")
	public String joinForm() {
		return "members/signup";
	}
	
	@GetMapping
	public String showForm(@ModelAttribute MemberDTO memberDTO) {
		return "members/signup";
	}

	@PostMapping
	public String submit(@Valid @ModelAttribute MemberDTO memberDTO, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return "members/signup";
		}
		return "redirect:/";
	}
	// //회원 가입 처리
	// @PostMapping("/signup")
	// public String join(@ModelAttribute MemberDTO memberDTO) {
	// 	log.info("member: " + memberDTO);
	// 	service.save(memberDTO);  //서비스에 있는 save() 호출
	// 	return "redirect:/";
	// }

	
}





