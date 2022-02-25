package com.abc.repository;

import com.abc.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	UserEntity findBy_id(Long _id);

}
