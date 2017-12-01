package kr.co.cgb.mappers;

import java.util.List;
import java.util.Map;

import kr.co.cgb.dao.UserDao;

public interface AcademyMapper {

	public void signup_user(Map<String, Object> map);

	public UserDao user_login(Map<String, Object> map);

	public UserDao user_id_check(Map<String, Object> map);

	public void write_post(Map<String, Object> map);

	public List<Map<String, Object>> get_post(Map<String, Object> map);

	public Map<String, Object> get_lecture(Map<String, Object> map);
}
