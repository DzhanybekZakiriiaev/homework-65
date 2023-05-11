package com.example.homework65.repository.user;

import com.example.homework65.entity.User;
import com.example.homework65.repository.common.BaseRepository;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User, Long> {
    User findByName(String name);
    User findByEmail(String email);
    boolean existsByEmail(String email);

    @Query("SELECT DISTINCT r FROM User u JOIN u.role r WHERE u.id = :userId")
    List<Role> findRolesByUserId(Long userId);

    @EntityGraph(attributePaths = "roles")
    User getById(Long id);

}

