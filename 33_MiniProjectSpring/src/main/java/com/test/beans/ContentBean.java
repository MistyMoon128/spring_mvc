package com.test.beans;

import org.springframework.web.multipart.MultipartFile;


public class ContentBean {

	
	private Integer content_idx;
	private String content_subject;
	private String content_date;
	private Integer content_board_idx;
	private Integer content_writer_idx;
	private String content_file;
	private String content_text;
	private String content_writer_name;
	
	// 파일 데이터를 주입받을 변수'
	private MultipartFile upload_file;
	
	public Integer getContent_idx() {
		return content_idx;
	}
	public void setContent_idx(Integer content_idx) {
		this.content_idx = content_idx;
	}
	public String getContent_subject() {
		return content_subject;
	}
	public void setContent_subject(String content_subject) {
		this.content_subject = content_subject;
	}
	public String getContent_date() {
		return content_date;
	}
	public void setContent_date(String content_date) {
		this.content_date = content_date;
	}
	public Integer getContent_board_idx() {
		return content_board_idx;
	}
	public void setContent_board_idx(Integer content_board_idx) {
		this.content_board_idx = content_board_idx;
	}
	public Integer getContent_writer_idx() {
		return content_writer_idx;
	}
	public void setContent_writer_idx(Integer content_writer_idx) {
		this.content_writer_idx = content_writer_idx;
	}
	public String getContent_file() {
		return content_file;
	}
	public void setContent_file(String content_file) {
		this.content_file = content_file;
	}
	public String getContent_text() {
		return content_text;
	}
	public void setContent_text(String content_text) {
		this.content_text = content_text;
	}
	public MultipartFile getUpload_file() {
		return upload_file;
	}
	public void setUpload_file(MultipartFile upload_file) {
		this.upload_file = upload_file;
	}
	public String getContent_writer_name() {
		return content_writer_name;
	}
	public void setContent_writer_name(String content_writer_name) {
		this.content_writer_name = content_writer_name;
	}
	
	
	
	
}
