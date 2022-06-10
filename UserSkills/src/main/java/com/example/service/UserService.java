package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.User;

public interface UserService {

	List<User> fetchUserList();

	List<User> insertListUser(List<User> user);

	User updateUser(User user, int id);

	Optional<User> findById(int id);

	List<User> findAllByskillId(int id);

}
