//Ameer Ahmed 

class Person {

    //instance variables
    String name;
    private int age;
    private String ssn; 

    //no-arg
    Person() { 
    }

    //fully loaded
    public Person(String name, int age, String ssn) { 
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    //setters
    void setage(int age) { 
        this.age = age;
    } 

    void setssn(String ssn) { 
        this.ssn = ssn;
    }

    //getters
    int getage() { 
        return this.age;
    }

    String getssn() { 
        return this.ssn;
    }

    //toString method
    public String toString() { 
        String output = "";
        output += "The name is: " + this.name + '\n';
        output += "The age is: " + this.age + '\n';
        output += "The ssn is: " + this.ssn + '\n';
        return output;
    }
}