package com.sha.springbootdeviceseller.repository;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying
    @Query(value = "UPDATE users SET role = :#{#role.name()} WHERE username = :username", nativeQuery = true)
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
