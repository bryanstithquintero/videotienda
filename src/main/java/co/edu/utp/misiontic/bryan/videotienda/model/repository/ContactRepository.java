package co.edu.utp.misiontic.bryan.videotienda.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utp.misiontic.bryan.videotienda.model.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
