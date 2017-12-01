package kr.co.cgb.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgb.dao.PostDao;
import kr.co.cgb.dao.UserDao;
import kr.co.cgb.mappers.AcademyMapper;

@Service("kr.co.cgb.service.AcademyServiceImpl")
public class AcademyServiceImpl implements AcademyService {

	@Autowired
	private AcademyMapper mMapper;

	@Override
	public void get_signup_user(Map<String, Object> map) {
		// TODO Auto-generated method stub

		mMapper.signup_user(map);

	}

	@Override
	public UserDao userLogin(Map<String, Object> map) {
		// TODO Auto-generated method stub

		UserDao user = mMapper.user_login(map);

		return user;
	}

	@Override
	public UserDao userIdCheck(Map<String, Object> map) {
		// TODO Auto-generated method stub

		UserDao user = mMapper.user_id_check(map);

		return user;
	}

	@Override
	public void writePost(Map<String, Object> map) {
		// TODO Auto-generated method stub

		mMapper.write_post(map);

	}

	@Override
	public List<Map<String,Object>> getPost(Map<String, Object> map) {
		// TODO Auto-generated method stub

		return mMapper.get_post(map);
	}

	@Override
	public Map<String, Object> getLecture(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mMapper.get_lecture(map);
	}

}
