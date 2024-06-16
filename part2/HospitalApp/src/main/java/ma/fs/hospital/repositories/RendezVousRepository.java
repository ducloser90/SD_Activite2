package ma.fs.hospital.repositories;

import ma.fs.hospital.entities.Medecin;
import ma.fs.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
