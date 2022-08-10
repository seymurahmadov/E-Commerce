package ECommerce.entities.concretes;

import ECommerce.entities.abstracts.Entity;

public class User implements Entity {
    private String name;
    private String surName;
    private String eMail;
    private String passWord;

    public User() {

    }

    public User(String name, String surName, String eMail, String passWord) {
        this.setName(name);
        this.setSurName(surName);
        this.seteMail(eMail);
        this.setPassWord(passWord);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
