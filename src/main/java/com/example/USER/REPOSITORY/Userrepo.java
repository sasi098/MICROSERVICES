package com.example.USER.REPOSITORY;

import com.example.USER.ENTITY.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, Integer> {
}
