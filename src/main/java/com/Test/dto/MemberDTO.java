package com.Test.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemberDTO {
	private Long id;  //번호

	@NotEmpty(message = "올바른 형식의 이메일 주소여야 합니다")
	private String email; //이메일
	@NotEmpty(message = "비밀번호는 필수 항목입니다")
	private String passwd; //비밀번호
	@NotEmpty(message = "이름은 필수 항목입니다")
	private String name;  //이름
}
