package ro.uTech.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ro.uTech.security.model.domain.User;
import ro.uTech.security.model.domain.UserRole;

/**
 * Created by an on 20.04.2017.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    UserRole findByUser(@Param("user") User user);
}
