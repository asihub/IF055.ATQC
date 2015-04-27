package ita.softserve.iilntc;

public class TypeOfWorkerStudy extends WorkerStudy {
    public TypeOfWorkerStudy(int id, String name, String surname, double payment, String typeOfWorker){
        super(id, name, surname);

        if (typeOfWorker.equals("fd")) {
            super.payment = payment;

        }else if(typeOfWorker.equals("hr")) {
                double hours = 8.0;
                double averageDays = 20.8;
                super.payment = payment * hours * averageDays;

        }else{
            System.out.println("Type of worker can be fd or hr. Please, use mentioned types.");

        }
    }
}
