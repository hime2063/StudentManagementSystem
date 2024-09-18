package models;

public class Classroom {
    private int classroomId;
    private String classroomName;
    private int desk;
    private boolean hasAC;
    private boolean hasTV;
    private String classTeacher;

    public Classroom(int classroomId, String classroomName, int desk, boolean hasAC, boolean hasTV, String classTeacher) {
        this.classroomId = classroomId;
        this.classroomName = classroomName;
        this.desk = desk;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
        this.classTeacher = classTeacher;
    }

    // Getters and setters
    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public int getDesk() {
        return desk;
    }

    public void setDesk(int desk) {
        this.desk = desk;
    }

    public boolean hasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean hasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }
}
