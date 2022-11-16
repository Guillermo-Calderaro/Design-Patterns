package BehavioralPatterns.Memento;

public class PlayerMemento {
    private int empId;
    private String playerName;
    private String empPhoneNo;
    private String empDesignation;
    public PlayerMemento(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.playerName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }
    public int getEmpId() {
        return empId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    public String getEmpPhoneNo() {
        return empPhoneNo;
    }
    @Override
    public String toString(){
        String str="Current Memento State" + this.empId +" , "+this.playerName +" , "+this.getEmpPhoneNo()+" , "+this.getEmpDesignation();
        return str;
    }
}
