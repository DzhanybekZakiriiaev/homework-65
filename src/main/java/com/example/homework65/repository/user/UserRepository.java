package com.example.homework65.repository.user;

import com.example.homework65.entity.User;
import com.example.homework65.repository.common.BaseRepository;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;

import javax.management.relation.Role;
import java.util.List;

public interface UserRepository extends BaseRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);

    @Query("SELECT DISTINCT r FROM User u JOIN u.roles r WHERE u.id = :userId")
    List<Role> findRolesByUserId(Long userId);

    @EntityGraph(attributePaths = "roles")
    User getById(Long id);
}

