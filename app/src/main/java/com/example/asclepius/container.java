package com.example.asclepius;

public class container {

    String Problem , Email;

    public container(String problem,String email) {
        Problem = problem;
        Email = email;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String problem) {
        Problem = problem;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
