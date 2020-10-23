package Practica14;

public class Dog extends Animal {

    private boolean isVaccinated;

    public Dog(int age, double weight, double height, boolean isVaccinated) {
        super(age, weight, height);
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isVaccinated=" + isVaccinated +
                '}';
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
