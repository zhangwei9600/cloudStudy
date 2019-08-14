package com.cloud.study.repository;

import com.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/8/14.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
