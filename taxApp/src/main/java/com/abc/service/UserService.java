package com.abc.service;

import java.util.Random;

import com.abc.dao.UserDto;
import com.abc.entity.UserEntity;

public interface UserService {

	UserDto createUser(final UserDto userDto);

	boolean login(String username, String password);

	boolean isUserIdExists(Long _id);

	UserEntity fetchUserDetails(Long _id) throws Exception;

	default Long generateId() {
		Random random = new Random();
		Long id = Math.abs(random.nextLong());
		return id;
	}
}
