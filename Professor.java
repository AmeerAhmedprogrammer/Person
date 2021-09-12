//Ameer Ahmed

class Professor extends Person {

    //instance variables 
    private String fac_id;
    private String research_area;
    private int salary;
    private int num_vacation;

    //no-arg
    Professor() { 
    }

    //fully loaded
    public Professor(String name, int age, String ssn, String fac_id, String research_area, int salary, int num_vacation) {  

        //super statement inheritance
        super(name,age,ssn);
        this.fac_id = fac_id;
        this.research_area = research_area;
        this.salary = salary;
        this.num_vacation = num_vacation;
    }

    //setters
    void setfac_id(String fac_id) { 
        this.fac_id = fac_id;
    }

    void setresearch_area(String research_area) { 
        this.research_area = research_area; 
    }

    void setsalary(int salary) {
        this.salary = salary;
    }

    void setnum_vacation(int num_vacation) { 
        this.num_vacation = num_vacation;
    }

    //getters
    String getfac_id() { 
        return this.fac_id;
    }

    String getresearch_area() { 
        return this.research_area;
    }

    int getsalary() { 
        return this.salary;
    }

    int getnum_vacation() { 
        return this.num_vacation;
    }

    public void getPaid() { 
        String ProfessorPay = "Monthly";
        System.out.println(ProfessorPay);
    }

    public void getVacation() { 
        String ProfessorVacation = "3 Months" + '\n';
        System.out.println(ProfessorVacation);
    }

    //toString method
    public String toString() { 
        String output = "";
        output += "The Professor's Information is: \n" + super.toString() + '\n';
        output += "The faculty ID is: " + this.fac_id + '\n';
        output += "The research area is: " + this.research_area + '\n';
        output += "The salary is: " + this.salary + '\n';
        output += "The number of vacation days is: " + this.num_vacation + '\n';
        return output;
    }
}