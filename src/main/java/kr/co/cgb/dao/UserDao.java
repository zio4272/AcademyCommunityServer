package kr.co.cgb.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserDao {
	
//	Dao 파일은 DATA 파일과 같게 하는게 아니라 DB와 이름을 갖게 맞춰줘야 함.
	
	private int id;
	private String loginId;
	private String loginPw;
	private String userName;
	private String userPhoneNum;
	private int userGender;
	private String userProfileImg;
	private String userMyInfo;
	private int lectureId;
	private Calendar birthDay;
	private boolean userIsTeacher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPw() {
		return loginPw;
	}
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	public int getUserGender() {
		return userGender;
	}
	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}
	public String getUserProfileImg() {
		return userProfileImg;
	}
	public void setUserProfileImg(String userProfileImg) {
		this.userProfileImg = userProfileImg;
	}
	public String getUserMyInfo() {
		return userMyInfo;
	}
	public void setUserMyInfo(String userMyInfo) {
		this.userMyInfo = userMyInfo;
	}
	public int getLectureId() {
		return lectureId;
	}
	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}
	public Calendar getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Calendar birthDay) {
		this.birthDay = birthDay;
	}
	public boolean isUserIsTeacher() {
		return userIsTeacher;
	}
	public void setUserIsTeacher(boolean userIsTeacher) {
		this.userIsTeacher = userIsTeacher;
	}
	
	
	
	

}
