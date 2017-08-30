/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author Ataz
 */
public class MainThread {
    public static void main(String[] args) {
        Customer cus1=new Customer("1","A","AA@gmail.com","19/11/1993",1,"AAA.jpg",2);
        System.out.println(cus1.toString());
        cus1.selectProduct("AAAA");
        cus1.checkOut();
    }
}
