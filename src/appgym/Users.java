/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;

/**
 *
 * @author HP
 */
public class Users {
    private String username;
    private String fullname;
    private  String gender;
    private  String phonenumber;
    private  String address;
    private  String card;
//    private  String date;
    private  String trainer;
    private String room;

    public String getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public String getUsername() {
        return username;
    }

    public String getCard() {
        return card;
    }

//    public String getDate() {
//        return date;
//    }

    public String getFullname() {
        return fullname;
    }

    public String getGender() {
        return gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getRoom() {
        return room;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCard(String card) {
        this.card = card;
    }

//    public void setDate(String date) {
//        this.date = date;
//    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

   
}
