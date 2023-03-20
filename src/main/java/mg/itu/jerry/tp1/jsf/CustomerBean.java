/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.jerry.tp1.jsf;

import mg.itu.jerry.tp1.ejb.CustomerManager;
import mg.itu.jerry.tp1.entities.Customer;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jerry
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    @EJB
    private CustomerManager customerManager; 
    private List<Customer> customerList; 
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }
    
}
