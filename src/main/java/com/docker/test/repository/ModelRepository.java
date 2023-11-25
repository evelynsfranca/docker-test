package com.docker.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.test.model.User;

@Repository
public interface ModelRepository extends JpaRepository<User, String> {
}
