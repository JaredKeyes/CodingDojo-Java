class ProjectTest {
    public static void main(String[] args) {
        Project basic = new Project("Default", "Default description");
        String defaultElevatorPitch = basic.elevatorPitch();
        System.out.println(defaultElevatorPitch);
    }
}