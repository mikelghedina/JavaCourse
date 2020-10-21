package Practica12.Model;

public class Vaccine {
    private String vaccineName;
    private boolean isVaccinated;
    private Date vaccineDate;


    public Vaccine(String vaccineName, boolean isVaccinated, Date vaccineDate) {
        this.vaccineName = vaccineName;
        this.isVaccinated = isVaccinated;
        this.vaccineDate = vaccineDate;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Date getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(Date vaccineDate) {
        this.vaccineDate = vaccineDate;
    }
}
