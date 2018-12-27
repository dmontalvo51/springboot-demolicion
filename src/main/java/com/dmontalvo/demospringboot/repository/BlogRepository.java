package com.dmontalvo.demospringboot.repository;

import com.dmontalvo.demospringboot.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
