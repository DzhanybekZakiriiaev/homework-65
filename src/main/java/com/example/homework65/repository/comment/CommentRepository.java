package com.example.homework65.repository.comment;

import com.example.homework65.entity.Comment;
import com.example.homework65.repository.common.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends BaseRepository<Comment, Long> {

    @Query("SELECT c FROM Comment c WHERE c.user.id = :userId AND c.product.id = :productId")
    List<Comment> findByUserIdAndProductId(@Param("userId") Long userId, @Param("productId") Integer productId);

    @Query("SELECT c FROM Comment c WHERE c.product.id = :productId")
    Page<Comment> findByProductId(@Param("productId") Integer productId, Pageable pageable);
}