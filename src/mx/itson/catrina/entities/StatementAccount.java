/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;


import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class StatementAccount {
    private String account= new String();
    private String clabe= new String();
    private String currency= new String();
    private Costumer customer= new Costumer();
    private List<Transacctions> transactions = new ArrayList();
    
    public StatementAccount deserealize(String json){
        StatementAccount statementAccount= new StatementAccount();
        try{
         statementAccount = new Gson().fromJson(json, StatementAccount.class);
        }catch(Exception ex){
            System.out.println("Ocurrio un error: "+ ex.getMessage());
        }
        return statementAccount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Costumer getCostumer() {
        return customer;
    }

    public void setCostumer(Costumer costumer) {
        this.customer = customer;
    }

    public List<Transacctions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transacctions> transactions) {
        this.transactions = transactions;
    }

    public Costumer getCustomer() {
        return customer;
    }

    public void setCustomer(Costumer customer) {
        this.customer = customer;
    }

   
    
}
