package com.zhengyj.produceruser.repository;

import com.zhengyj.produceruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @Author zhengyingjun
 * @Description ：
 * @Date 10:40 2019-06-12
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
