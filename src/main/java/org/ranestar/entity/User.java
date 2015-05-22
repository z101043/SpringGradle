package org.ranestar.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "td_user")
public class User {
	
	@Id
	private String user_id;
	private String user_pw;
	private String user_nm;
	private String user_tel;
	private String email;
	private String pw_question;
	private String pw_answer;
	private String reg_id;
	private Date reg_date;

	public User(){}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw_question() {
		return pw_question;
	}

	public void setPw_question(String pw_question) {
		this.pw_question = pw_question;
	}

	public String getPw_answer() {
		return pw_answer;
	}

	public void setPw_answer(String pw_answer) {
		this.pw_answer = pw_answer;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pw=" + user_pw
				+ ", user_nm=" + user_nm + ", user_tel=" + user_tel
				+ ", email=" + email + ", pw_question=" + pw_question
				+ ", pw_answer=" + pw_answer + ", reg_id=" + reg_id
				+ ", reg_date=" + reg_date + "]";
	}
	
}
