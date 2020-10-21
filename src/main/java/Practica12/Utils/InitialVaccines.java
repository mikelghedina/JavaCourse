package Practica12.Utils;

import Practica12.Model.Date;
import Practica12.Model.Vaccine;

import java.util.ArrayList;

public class InitialVaccines {

    public static ArrayList<Vaccine> dogVaccinesList(){
        ArrayList<Vaccine> dogVaccineList = new ArrayList<>();

        dogVaccineList.add(new Vaccine("Canine Core Vaccines", true, new Date(20,10,2011)));
        dogVaccineList.add(new Vaccine("Canine Parvovirus", false, new Date(15,6,2015)));
        dogVaccineList.add(new Vaccine("Canine Rabies Virus Vaccines", true, new Date(12,12,2011)));
        return dogVaccineList;
    }
    public static ArrayList<Vaccine> catVaccinesList(){
        ArrayList<Vaccine> catVaccinesList = new ArrayList<>();

        catVaccinesList.add(new Vaccine("Feline Core Vaccines", true, new Date(20,10,2011)));
        catVaccinesList.add(new Vaccine("Feline Rabies Virus Vaccines", true, new Date(15,6,2015)));
        catVaccinesList.add(new Vaccine("Feline Bordetella bronchiseptica Vaccine", false, new Date(12,12,2011)));
        return catVaccinesList;
    }
}
