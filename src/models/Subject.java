package models;

public class Subject {
    private int id;
    private String name;
    private int fullMarks;
    private int passMarks;
    private int credit;
    private String teacher;

    public Subject(int id, String name, int fullMarks, String teacher, int passMarks, int credit) {
        this.id = id;
        this.name = name;
        this.fullMarks = fullMarks;
        this.teacher = teacher;
        this.passMarks = passMarks;
        this.credit = credit;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(int fullMarks) {
        this.fullMarks = fullMarks;
    }

    public int getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(int passMarks) {
        this.passMarks = passMarks;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}