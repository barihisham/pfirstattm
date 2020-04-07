package com.pfirstattm.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YesNoQuestion {

    @Id
    private String question;
    private Boolean yesNo;

    protected YesNoQuestion(){

    }

    public Boolean getYesNo() {
        return yesNo;
    }

    public void setYesNo(Boolean yesNo) {
        this.yesNo = yesNo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "YesNoQuestion{" +
                "question='" + question + '\'' +
                ", yesNo=" + yesNo +
                '}';
    }
}
