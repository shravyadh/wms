package com.wms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wms.entities.Role;
import com.wms.entities.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer> {
	
	@Query("select user from User user where user.username = :username and user.password = :password")
	public User validate(@Param("username") String username, @Param("password") String password);

//	select user from User user where user.username = :username and user.password = :password
}
//from Person person where person.id = (select user.person.id from User user where user.username = :username and user.password = :password 