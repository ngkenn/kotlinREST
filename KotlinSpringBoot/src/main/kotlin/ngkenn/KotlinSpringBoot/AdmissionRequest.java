package ngkenn.KotlinSpringBoot;

public class AdmissionRequest {
    private String hospitalName;
    private int nPatients;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getNPatients() {
        return nPatients;
    }

    public void setNPatients(int nPatients) {
        this.nPatients = nPatients;
    }
}