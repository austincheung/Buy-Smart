/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuySmart;


/**
 *
 * @author Austin
 */

public class Customer {
public static String name;
public Customer(){ this.name="admin";}
public Customer (String name){ this.name=name; }
public String getCustomer(){ return name;}
public void setCustomer(String name){this.name = name;}  
}
