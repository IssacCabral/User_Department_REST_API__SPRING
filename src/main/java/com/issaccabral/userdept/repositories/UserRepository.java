package com.issaccabral.userdept.repositories;

import com.issaccabral.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
