package ngkenn.KotlinSpringBoot

import org.springframework.stereotype.Component
import org.springframework.boot.CommandLineRunner

@Component
class SeedDB(val hospitalRepo: HospitalRepo) : CommandLineRunner {

    override fun run(vararg p0: String?){

        this.hospitalRepo.deleteAll()

        val stvin = Hospital("St Vincent's", 4, 250)
        val macq = Hospital("Macquarie", 5, 300)

        val hospitals = mutableListOf<Hospital>{}
        hospitals.add(stvin)
        hospitals.add(macq)

        this.hospitalRepo.save(hospitals)
        println("db init complete")
    }
}