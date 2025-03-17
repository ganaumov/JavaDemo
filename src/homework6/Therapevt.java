package homework6;

class Therapevt extends Doctor {
    @Override
    void treat() {
        System.out.println("Терапевт проводит общее лечение");
    }

    void assignDoctor(Patient patient) {
        switch (patient.healthPlan.code) {
            case 1:
                patient.doctor = new Surgeon();
                break;
            case 2:
                patient.doctor = new Dantist();
                break;
            default:
                patient.doctor = new Therapevt();
                break;
        }
        patient.doctor.treat();
    }
}

