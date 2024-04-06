package ma.enset.patientmvc.repositories;
import ma.enset.patientmvc.entities.Patient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
   Page<Patient> findByNomContains(String kw, PageRequest pageable);
}
