package ngkenn.KotlinSpringBoot

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hospitals")
class HospitalController(val hospitalRepo: HospitalRepo) {

    @GetMapping("/all")
    fun all(): MutableIterable<Hospital> = this.hospitalRepo.findAll()
       
    @GetMapping("/{name}")
    fun getByName(@PathVariable(value = "name") name: String): List<Hospital> {
        val hospitalsByName = this.hospitalRepo.findHospital(name)
        return hospitalsByName
    }

    @PostMapping("/admission")
    fun admission(@RequestBody admissionRequest: AdmissionRequest){
        val hosp = this.hospitalRepo.findHospital(admissionRequest.hospitalName).get(0)
        hosp.patAdmission(admissionRequest.nPatients)
        this.hospitalRepo.save(hosp)
    }
    }

}