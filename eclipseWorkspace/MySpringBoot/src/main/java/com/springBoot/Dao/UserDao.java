package com.springBoot.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.entity.User;
/**
 * 接口会自动实现查询的功能
 * @author 10412
 *
 */
@Repository
public interface UserDao extends JpaRepository<User, String>{

    
}
