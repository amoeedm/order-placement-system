package com.crudrest.orderplacement.orderplacementsystem;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/*
Entity class for the single table in the database.
*/

@Entity
@Table(name="orders")

@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_phone")
    private Integer phoneNumber;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "address_moving_from")
    private String addressMovingFrom;

    @Column(name = "address_moving_to")
    private String addressMovingTo;

    @Column(name = "moving")
    private Boolean moving;

    @Column(name = "packing")
    private Boolean packing;

    @Column(name = "cleaning")
    private Boolean cleaning;

    @Column(name = "service_date")
    private Date serviceDate;

    @Column(name = "order_note")
    private String orderNote;

    /*
    Getters and setters below.
     */

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressMovingFrom() {
        return addressMovingFrom;
    }

    public void setAddressMovingFrom(String addressMovingFrom) {
        this.addressMovingFrom = addressMovingFrom;
    }

    public String getAddressMovingTo() {
        return addressMovingTo;
    }

    public void setAddressMovingTo(String addressMovingTo) {
        this.addressMovingTo = addressMovingTo;
    }

    public Boolean getMoving() {
        return moving;
    }

    public void setMoving(Boolean moving) {
        this.moving = moving;
    }

    public Boolean getPacking() {
        return packing;
    }

    public void setPacking(Boolean packing) {
        this.packing = packing;
    }

    public Boolean getCleaning() {
        return cleaning;
    }

    public void setCleaning(Boolean cleaning) {
        this.cleaning = cleaning;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }
}
