package ngkenn.KotlinSpringBoot

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HospitalRepo : CrudRepository<Hospital, Long> {
    fun findHospital(name: String): List<Hospital>
    
}