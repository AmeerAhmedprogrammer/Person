//Ameer Ahmed

class Secretary extends Person {

    //instance variables
    private String fac_id;
    private int num_service;
    private int salary;
    private int num_vacation;

    //no-arg
    Secretary() { 
    }

    //fully loaded 
    public Secretary(String name, int age, String ssn, String fac_id, int num_service, int salary, int num_vacation) { 
        super(name,age,ssn);
        this.fac_id = fac_id;
        this.num_service = num_service;
        this.salary = salary;
        this.num_vacation = num_vacation;
    }

    //setters
    void setfac_id(String fac_id) {
        this.fac_id = fac_id;
    }

    void setnum_service(int num_service) { 
        this.num_service = num_service;
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

    int getnum_service() { 
        return this.num_service;
    }

    int getsalary() { 
        return this.salary;
    }

    int getnum_vacation() { 
        return this.num_vacation;
    } 

    public void getPaid() { 
        String SecretaryPay = "Bi-Weekly";
        System.out.println(SecretaryPay);
    }

    public void getVacation() { 
        String SecretaryVacation = "1 Month" + '\n';
        System.out.println(SecretaryVacation);
    }

    //toString method
    public String toString() { 
        String output = "";
        output += "The Secretary's Information is: \n" + super.toString() + '\n';
        output += "The faculty ID is: " + this.fac_id + '\n';
        output += "The number of service is: " + this.num_service + '\n';
        output += "The salary is: " + this.salary + '\n';
        output += "The number of vacation days are: " + this.num_vacation + '\n';
        return output;
    }
}