package ngkenn.KotlinSpringBoot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/hospitals")
class HospitalController(val hospitalRepo: HospitalRepo) {

    @GetMapping("/all")
    fun all(): MutableIterable<Hospital> = this.hospitalRepo.findAll()
       
    @GetMapping("/{name}")
    fun getByName(@PathVariable(value = "name") name: String): List<Hospital> {
        val hospitalsByName = this.hospitalRepo.findByName(name)
        return hospitalsByName
    }

    @PostMapping("/admission")
    fun admission(@RequestBody admissionRequest: admissionRequest){
        
    }

}