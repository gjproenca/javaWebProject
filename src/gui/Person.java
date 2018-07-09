/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author osao
 */
public class Person implements Serializable {

    //constructor
    //atributos
    public Person(String name, String phone, String email, String address, String notes, Icon image) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.image = image;
        this.notes = notes;
    }

    String name;
    String phone;
    String email;
    String address;
    Icon image;
    String notes;

    //getters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Icon getImage() {
        return image;
    }

    public String getNotes() {
        return notes;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
