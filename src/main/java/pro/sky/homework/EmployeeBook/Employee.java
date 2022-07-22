package pro.sky.homework.EmployeeBook;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;

    public Employee(String name, String surname)
    {   this.name = name;
        this.surname = surname;
    }
    public  String getName() {return name;}
    public  String getSurname() {return surname;}

    @Override
    public String toString(){
        return (name + " " + surname);
    }
    @Override
    public boolean equals(Object tocompare){
        if (this.getClass()!= tocompare.getClass()){
            return false;
        }
        Employee e = (Employee) tocompare;
        return (name.equals(e.name)&&surname.equals(e.surname));
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, surname);
    }

}
