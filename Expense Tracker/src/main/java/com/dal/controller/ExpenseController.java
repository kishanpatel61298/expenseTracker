package com.dal.controller;

import com.dal.service.ExpenseOperations;
import com.dal.service.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseOperations operation;

    @PostMapping("/create-new-expense")
    public void createExpense(@RequestBody Expense expense)
    {
        operation.createExpense(expense);
    }

}
