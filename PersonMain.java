//Ameer Ahmed

class PersonMain {

    public static void main (String [] args) {

        //Professor Object
        Professor P1 = new Professor("Saitama", 20, "123-45-6789","HGT45", "Biology", 100000, 30);
        System.out.println(P1.toString());
        
        //Secretary Object
        Secretary S1 = new Secretary("Ms.Tatsumaki", 16, "456-78-3452", "VC6789", 3, 70000, 17);
        System.out.println(S1.toString());
        
        //Student_Worker Object
        Student_Worker SW1 = new Student_Worker("Bobby", 20, "436-90-8561", "HHA56", "Senior",40000,5,"Physics");
        System.out.println(SW1.toString());
        
        //Overriding the getPaid() and getVacation() methods 
        System.out.println("The Professor's salary and vacation:");
        P1.getPaid();
        P1.getVacation();

        System.out.println("The Secretary's salary and vacation:");
        S1.getPaid();
        S1.getVacation();

        System.out.println("The Student Worker's salary and vacation: ");
        SW1.getPaid();
        SW1.getVacation();
    }
}