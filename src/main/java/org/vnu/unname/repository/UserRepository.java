package org.vnu.unname.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vnu.unname.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
