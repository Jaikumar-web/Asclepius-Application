package com.example.asclepius;

public class dataholder {
    String mail,phone,problem;

    public dataholder(String mail,String phone,String problem) {
        this.mail=mail;
        this.phone=phone;
        this.problem=problem;
    }



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
