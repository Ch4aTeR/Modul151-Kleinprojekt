package ch.bbw.m151.kleinprojekt;

import javax.persistence.*;

@Entity
public class Person {
    public Person(int id, String customerName, String contactEmail, String address, String city, String postalCode, String country) {
        this.id = id;
        this.customerName = customerName;
        this.contactEmail = contactEmail;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Id
    @GeneratedValue()
    private int id;
    @Column
    private String customerName;
    @Column
    private String contactEmail;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String country;
    public Person() {

    }
}
