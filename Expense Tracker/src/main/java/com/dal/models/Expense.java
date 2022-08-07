package com.dal.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.persistence.Id;
import java.util.Date;

@Document("expense")
public class Expense {

    @Id
    int expenseId;

    int personId;
    int caregoryId;
    String name;
    int amount;
    Date date;
    String description;

    public Expense(int expenseId, int personId, int caregoryId, String name, int amount, Date date, String description) {
        this.expenseId = expenseId;
        this.personId = personId;
        this.caregoryId = caregoryId;
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
