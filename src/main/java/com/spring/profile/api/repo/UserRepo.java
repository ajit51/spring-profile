package com.spring.profile.api.repo;

import com.spring.profile.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
