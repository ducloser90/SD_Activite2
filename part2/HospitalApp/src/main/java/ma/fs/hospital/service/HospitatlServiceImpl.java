package ma.fs.hospital.service;

import jakarta.transaction.Transactional;
import ma.fs.hospital.entities.Consultation;
import ma.fs.hospital.entities.Medecin;
import ma.fs.hospital.entities.Patient;
import ma.fs.hospital.entities.RendezVous;
import ma.fs.hospital.repositories.ConsultationRepository;
import ma.fs.hospital.repositories.MedecinRepository;
import ma.fs.hospital.repositories.PatientRepository;
import ma.fs.hospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitatlServiceImpl implements IHospitatlService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitatlServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        //Generateur de type UUID -> permet de générer un ID unique aléatoire selon la date système
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
