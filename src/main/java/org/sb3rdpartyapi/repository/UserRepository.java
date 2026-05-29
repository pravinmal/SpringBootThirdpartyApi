package org.sb3rdpartyapi.repository;


import org.sb3rdpartyapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
