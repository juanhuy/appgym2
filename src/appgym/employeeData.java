/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;

/**
 *
 * @author HP
 */

import java.sql.Date;




public class employeeData {
    
    private Integer id;            // ID thành viên
    private String name;           // Tên thành viên
    private String gender;         // Giới tính
    private String phoneNum;       // Số điện thoại
    private String trainer;        // Huấn luyện viên
    private Date membershipDate;   // Thời gian mua khóa tập
    private String gymCard;        // Thẻ tập
    private String gymLocation;    // Phòng tập
    
    public employeeData(Integer id, String name, String gender, String phoneNum, String trainer, Date membershipDate, String gymCard, String gymLocation) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.trainer = trainer;
        this.membershipDate = membershipDate;
        this.gymCard = gymCard;
        this.gymLocation = gymLocation;
    }
    
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getTrainer() {
        return trainer;
    }
    public Date getMembershipDate() {
        return membershipDate;
    }
    public String getGymCard() {
        return gymCard;
    }
    public String getGymLocation() {
        return gymLocation;
    }
    
    // Các phương thức setter
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }
    public void setGymCard(String gymCard) {
        this.gymCard = gymCard;
    }
    public void setGymLocation(String gymLocation) {
        this.gymLocation = gymLocation;
    }
}