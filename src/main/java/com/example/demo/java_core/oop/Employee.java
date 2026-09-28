package com.example.demo.java_core.oop;

public abstract class Employee {
    private Long id;
    protected String name;
    protected double salary;

    public Employee (
        Long id,
        String name,
        double salary
    ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    };

    // abstract
    public abstract void work();
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer (
        Long id,
        String name,
        double salary,
        String programmingLanguage
    ) {
        super(id,name,salary);
    }

    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override()
    public void work() {
        System.out.println("Developer is coding");
    }
}