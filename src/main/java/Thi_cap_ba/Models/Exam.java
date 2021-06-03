package Thi_cap_ba.Models;

import java.util.Date;

public class Exam {
    private int examID;
    private int soLuong;
    private Date startTime;
    private Date endTime;
    private String status;
    private Date creat;
    private Date update;

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Exam() {
    }

    public Exam(int examID, int soLuong, Date startTime, Date endTime, String status, Date creat, Date update) {
        this.examID = examID;
        this.soLuong = soLuong;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.creat = creat;
        this.update = update;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", soLuong=" + soLuong +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", creat=" + creat +
                ", update=" + update +
                '}';
    }
}
