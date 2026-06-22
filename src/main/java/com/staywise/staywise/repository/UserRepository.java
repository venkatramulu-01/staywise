package com.staywise.staywise.repository;

import com.staywise.staywise.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}