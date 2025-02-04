package com.spingsecurityhandwritten.repository;

import com.spingsecurityhandwritten.model.AppRole;
import com.spingsecurityhandwritten.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppRole, Long> {
    AppUser findByUserName(String name);
}
