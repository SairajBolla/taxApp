package com.abc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.abc.dao.UserDto;
import com.abc.entity.UserEntity;
import com.abc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;

	UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDto createUser(UserDto userDto) {

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		userEntity.set_id(generateId());
		userEntity = userRepository.save(userEntity);
		BeanUtils.copyProperties(userEntity, userDto);
		return userDto;
	}

	@Override
	public boolean login(String username, String password) {

		return true;
	}

	@Override
	public boolean isUserIdExists(Long _id) {
		if (userRepository.findBy_id(_id) != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public UserEntity fetchUserDetails(Long _id) throws Exception {
		UserEntity userEntity = userRepository.findBy_id(_id);
		if (null == userEntity) {
			throw new Exception("User Not Found");
		}
		return userEntity;

	}
}
