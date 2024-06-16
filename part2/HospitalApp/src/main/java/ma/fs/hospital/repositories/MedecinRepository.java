package ma.fs.hospital.repositories;

import ma.fs.hospital.entities.Medecin;
import ma.fs.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom) ;
}
