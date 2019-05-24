package model;

public class MiniProject {

    private String no;
    private String code;
    private String description;

    public MiniProject() {
    }

    public MiniProject(String no, String code, String description) {
        this.no = no;
        this.code = code;
        this.description = description;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
