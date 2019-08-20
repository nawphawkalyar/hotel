package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserProfile,Long> {
}
