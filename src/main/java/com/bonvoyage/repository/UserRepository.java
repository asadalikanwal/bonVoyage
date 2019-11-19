package com.bonvoyage.repository;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    String NON_APPROVED_USERS = "select u from User u where u.userRole = :role";

    @Query(value = NON_APPROVED_USERS)
    List<User> findUsersByRole(@Param("role") UserRole userRole);
}
