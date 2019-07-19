package cn.shadow.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.shadow.entity.User;
@Repository
public interface UserMapper {

	public User selectOne(Map map);
}
