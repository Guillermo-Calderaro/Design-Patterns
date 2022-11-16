package BehavioralPatterns.Memento;

public class App {
    public static void main(String[] args) {
        EmpOriginator empOriginator= new EmpOriginator(306,"Mark Ferguson", "131011789610","Sales Manager");
        PlayerMemento playerMemento =empOriginator.saveToMemento();
        PlayerCaretaker playerCaretaker =new PlayerCaretaker();
        playerCaretaker.addMemento(playerMemento);
        System.out.println("\n Original EmpOriginator");
        empOriginator.printInfo();
        System.out.println("\n EmpOriginator after updating phone number");
        empOriginator.setEmpPhoneNo("131011888886");
        playerMemento =empOriginator.saveToMemento();
        playerCaretaker.addMemento(playerMemento);
        empOriginator.printInfo();
        System.out.println("\n EmpOriginator after updating designation");
        empOriginator.setEmpDesignation("Senior Sales Manager");
        playerMemento =empOriginator.saveToMemento();
        playerCaretaker.addMemento(playerMemento);
        empOriginator.printInfo();
        System.out.println("\n EmpOriginator after undoing designation update");
        playerMemento = playerCaretaker.getMemento();
        empOriginator.undoFromMemento(playerMemento);
        playerMemento = playerCaretaker.getMemento();
        empOriginator.undoFromMemento(playerMemento);
        empOriginator.printInfo();
        System.out.println("\n Original EmpOriginator after undoing phone number update");
        playerMemento = playerCaretaker.getMemento();
        empOriginator.undoFromMemento(playerMemento);
        empOriginator.printInfo();
    }
}
