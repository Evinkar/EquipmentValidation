package ru.Equipment.Validation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Equipment {
    @Id
    private int id;
    private String registrationCardNumber;
    private String name;
    private String serialNumber;
    private String inventoryNumber;
    private String verificationCertificationNumber;
    private LocalDate validationLastDate;
    private LocalDate validationNextDate;

    public Equipment(String registrationCardNumber, String name, String serialNumber, String inventoryNumber,
                     String verificationCertificationNumber, LocalDate validationLastDate, LocalDate validationNextDate) {

        this.registrationCardNumber = registrationCardNumber;
        this.name = name;
        this.serialNumber = serialNumber;
        this.inventoryNumber = inventoryNumber;
        this.verificationCertificationNumber = verificationCertificationNumber;
        this.validationLastDate = validationLastDate;
        this.validationNextDate = validationNextDate;
    }

    public Equipment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationCardNumber() {
        return registrationCardNumber;
    }

    public void setRegistrationCardNumber(String registrationCardNumber) {
        this.registrationCardNumber = registrationCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getVerificationCertificationNumber() {
        return verificationCertificationNumber;
    }

    public void setVerificationCertificationNumber(String verificationCertificationNumber) {
        this.verificationCertificationNumber = verificationCertificationNumber;
    }

    public LocalDate getValidationLastDate() {
        return validationLastDate;
    }

    public void setValidationLastDate(LocalDate validationLastDate) {
        this.validationLastDate = validationLastDate;
    }

    public LocalDate getValidationNextDate() {
        return validationNextDate;
    }

    public void setValidationNextDate(LocalDate validationNextDate) {
        this.validationNextDate = validationNextDate;
    }
}
