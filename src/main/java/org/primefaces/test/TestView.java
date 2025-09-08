package org.primefaces.test;


import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private String string;

    private LocalDate localDate;
    private TestObject item;
    private List<TestObject> list;
    private TestObject selectedTestObject;

    public LocalDate getLocalDate() {
        try {
            //simulate Calculations
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        try {
            //simulate Calculations
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.localDate = localDate;
    }

    @PostConstruct
    public void init() {
        string = "Welcome to PrimeFaces!!!";
        list = new ArrayList<>(Arrays.asList(
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("The Dark Side of the Moon", "Pink Floyd", 1973)
        ));
    }
}
