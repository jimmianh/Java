package Thi_cap_ba.Models;

import java.util.Date;

public class Question  {
    private int quesID;
    private String title;
    private String a;
    private String b;
    private String c;
    private String d;
    private String coQues;
    private int point;
    private Date creat;
    private Date update;

    public int getQuesID() {
        return quesID;
    }

    public void setQuesID(int quesID) {
        this.quesID = quesID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getCoQues() {
        return coQues;
    }

    public void setCoQues(String coQues) {
        this.coQues = coQues;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getCreat() {
        return creat;
    }

    public void setCreat(Date creat) {
        this.creat = creat;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Question(int quesID, String title, String a, String b, String c, String d, String coQues, int point, Date creat, Date update) {
        this.quesID = quesID;
        this.title = title;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.coQues = coQues;
        this.point = point;
        this.creat = creat;
        this.update = update;
    }

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "quesID=" + quesID +
                ", title='" + title + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", coQues='" + coQues + '\'' +
                ", point=" + point +
                ", creat=" + creat +
                ", update=" + update +
                '}';
    }
}
