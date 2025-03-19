package homework6;

// Текст для гитхаба

public class Test {
    public static void main(String[] args) {

        healthPlan plan1 = new healthPlan(1); // Хирургия
        healthPlan plan2 = new healthPlan(2); // Стоматология
        healthPlan plan3 = new healthPlan(3); // Терапия

        Patient patient1 = new Patient(plan1);
        Patient patient2 = new Patient(plan2);
        Patient patient3 = new Patient(plan3);

        Therapevt therapist = new Therapevt();

        System.out.print("Пациент 1: ");
        therapist.assignDoctor(patient1);

        System.out.print("Пациент 2: ");
        therapist.assignDoctor(patient2);

        System.out.print("Пациент 3: ");
        therapist.assignDoctor(patient3);
    }
}