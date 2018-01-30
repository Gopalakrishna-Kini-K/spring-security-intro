package com.strugglingCoder.springsecurityintro;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Kini on 31-Jan-18.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
}
