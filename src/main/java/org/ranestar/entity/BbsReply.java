package org.ranestar.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="td_bbsreply")
public class BbsReply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reply_id;
	private int bbs_id;
	private String user_id;
	private String contents;
	private Date reg_date;
	
	public BbsReply() {}

	public int getReply_id() {
		return reply_id;
	}

	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}

	public int getBbs_id() {
		return bbs_id;
	}

	public void setBbs_id(int bbs_id) {
		this.bbs_id = bbs_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "BbsReply [reply_id=" + reply_id + ", bbs_id=" + bbs_id
				+ ", user_id=" + user_id + ", contents=" + contents
				+ ", reg_date=" + reg_date + "]";
	}

}
