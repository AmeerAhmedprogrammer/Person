//Ameer Ahmed

class Student_Worker extends Person {

    //instance variables
    private String ta_id;
    private String year;
    private int salary;
    private int num_vacation;
    private String course_taught;

    //no-arg
    Student_Worker() { 
    }

    //fully loaded
    public Student_Worker(String name, int age, String ssn,String ta_id, String year, int salary,int num_vacation,String course_taught) { 
        super(name,age,ssn);
        this.ta_id = ta_id;
        this.year = year;
        this.salary = salary;
        this.num_vacation = num_vacation;
        this.course_taught = course_taught;
    }

    //setters
    void setta_id(String ta_id) { 
        this.ta_id = ta_id;
    }

    void setyear(String year) { 
        this.year = year;
    }

    void setsalary(int salary) { 
        this.salary = salary;
    }

    void setnum_vacation(int num_vacation) { 
        this.num_vacation = num_vacation;
    }

    void setcourse_taught(String course_taught) { 
        this.course_taught = course_taught;
    }

    //getters
    String getta_id() { 
        return this.ta_id;
    }

    String getyear() { 
        return this.year;
    }

    int getsalary() { 
        return this.salary;
    }

    int getnum_vacation() { 
        return this.num_vacation;
    }

    String getcourse_taught() { 
        return this.course_taught;
    }

    public void getPaid() { 
        String StudentWorkerPay = "Hourly";
        System.out.println(StudentWorkerPay);
    }

    public void getVacation() { 
        String StudentWorkerVacation = "Weekend";
        System.out.println(StudentWorkerVacation);
    }

    //toString method
    public String toString() { 
        String output = "";
        output += "The Student Worker's Information is: \n" + super.toString() + '\n';
        output += "The Teaching Assistant ID is: " + this.ta_id + '\n';
        output += "The year is: " + this.year + '\n';
        output += "The salary is: " + this.salary + '\n';
        output += "The number of vacation days are: " + this.num_vacation + '\n';
        output += "The course taught is: " + this.course_taught + '\n';
        return output;
    }
}