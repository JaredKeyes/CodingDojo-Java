class Project {
    private String name;
    private String description;

    public Project(){

    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String desc) {
        this.name = name;
        this.description = desc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return description;
    }
    public void setDesc(String desc) {
        this.description = desc;
    }
    public String elevatorPitch() {
        return name + " : " + description;
    }
}