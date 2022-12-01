package com.serverprogramming.birthdayapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.serverprogramming.birthdayapp.model.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long>{

}
