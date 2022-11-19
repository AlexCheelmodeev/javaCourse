package lesson_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBook {

    //1.Поля
    public Contact[] contacts = new Contact[10];

    //2.Коструктор

    //3.Методы

    public void addContact(Contact contact){
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] == null){
            contacts[i] = contact;
            break;}}
    }
}