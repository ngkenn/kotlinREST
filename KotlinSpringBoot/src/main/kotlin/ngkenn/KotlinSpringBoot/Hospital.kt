package ngkenn.KotlinSpringBoot

import javax.persistence.GenerationType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Hospital(val name: String, val classification: Int, val nBeds: Int) {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var nFreeBeds: Int = this.nBeds



    fun patAdmission(nPatients: Int) {
        if (this.nFreeBeds >= nPatients) {
            this.nFreeBeds -= nPatients
        }
    }

    fun patDischarge(nPatients: Int){
        this.nFreeBeds += nPatients

    }
}