package kr.co.cgb.service;

import java.util.List;
import java.util.Map;

import kr.co.cgb.dao.PostDao;
import kr.co.cgb.dao.UserDao;

public interface AcademyService {

	public void get_signup_user(Map<String, Object> map);

	public UserDao userLogin(Map<String, Object> map);

	public UserDao userIdCheck(Map<String, Object> map);

	public void writePost(Map<String, Object> map);

	public List<Map<String, Object>> getPost(Map<String, Object> map);

	public Map<String, Object> getLecture(Map<String, Object> map);

}
