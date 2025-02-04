package com.spingsecurityhandwritten.repository;

import com.spingsecurityhandwritten.model.AppRole;
import com.spingsecurityhandwritten.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}
