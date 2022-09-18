package co.edu.utp.misiontic.bryan.videotienda.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utp.misiontic.bryan.videotienda.model.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsernameAndPasswordAndActiveIsTrue(String username, String password);

    Optional<User> findByEmail(String email);
}
