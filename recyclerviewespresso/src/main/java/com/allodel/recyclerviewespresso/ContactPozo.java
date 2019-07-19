package com.allodel.recyclerviewespresso;

import java.util.ArrayList;
import java.util.List;

public class ContactPozo {

   private String name;
   private String phone;

    public ContactPozo(String name, String phone) {
        this.name =name;
        this.phone = phone;
    }

    public ContactPozo() {

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContactPozo> getContacts(){
        List<ContactPozo> contacts = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            contacts.add(new ContactPozo("Youbaraj"+ Integer.toString(i),"9849496627"+Integer.toString(i)));
        }

        return  contacts;
    }
}
