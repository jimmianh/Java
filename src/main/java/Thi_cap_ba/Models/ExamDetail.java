package Thi_cap_ba.Models;

import java.util.Date;

public class ExamDetail {
    private int examID;
    private int quesID;
    private Date creat;
    private Date update;

    public ExamDetail(int examID, int quesID, Date creat, Date update) {
        this.examID = examID;
        this.quesID = quesID;
        this.creat = creat;
        this.update = update;
    }

    public ExamDetail() {
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public int getQuesID() {
        return quesID;
    }

    public void setQuesID(int quesID) {
        this.quesID = quesID;
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

    @Override
    public String toString() {
        return "ExamDetail{" +
                "examID=" + examID +
                ", quesID=" + quesID +
                ", creat=" + creat +
                ", update=" + update +
                '}';
    }
}
