package com.kh.bookmaker.mypage.model.vo;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
	
	private static final long serialVersionUID = 1004L;

	
	private int memberNo;
	private String memberId;
	private String password;
	private String memberType;
	private String name;
	private String address;
	private int tel;
	private String email;
	private Date birth;
	private Date joinDate;
	private String status;
	private String point;
	private String emailIsok;
	private String gradeType;
}
