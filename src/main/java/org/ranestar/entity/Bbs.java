package org.ranestar.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="td_bbs")
public class Bbs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bbs_id;
	private String user_id;
	private String title;
	private String contents;
	private int view_cnt;
	private int reply_cnt;
	private Date reg_date;
	
	@OneToMany
	private List<BbsReply> bbsReplyList;
	
	public Bbs(){}

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getView_cnt() {
		return view_cnt;
	}

	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}

	public int getReply_cnt() {
		return reply_cnt;
	}

	public void setReply_cnt(int reply_cnt) {
		this.reply_cnt = reply_cnt;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public List<BbsReply> getBbsReplyList() {
		return bbsReplyList;
	}

	public void setBbsReplyList(List<BbsReply> bbsReplyList) {
		this.bbsReplyList = bbsReplyList;
	}

	@Override
	public String toString() {
		return "Bbs [bbs_id=" + bbs_id + ", user_id=" + user_id + ", title="
				+ title + ", contents=" + contents + ", view_cnt=" + view_cnt
				+ ", reply_cnt=" + reply_cnt + ", reg_date=" + reg_date
				+ ", bbsReplyList=" + bbsReplyList + "]";
	}

}
