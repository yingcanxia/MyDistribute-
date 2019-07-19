package cn.shadow.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shadow.dao.UserMapper;
import cn.shadow.dto.SelectRequest;
import cn.shadow.dto.SelectResponse;
import cn.shadow.entity.User;
import cn.shadow.user.IUserService;

@Service("userService")
public class UserService implements IUserService{
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public SelectResponse select(SelectRequest request) {
		SelectResponse response=new SelectResponse();
		Map map=new HashMap();
		map.put("id", request.getId());
		User user=mapper.selectOne(map);
		response.setUser(user);
		return response;
	}
}
