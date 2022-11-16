package BehavioralPatterns.Mediator;

public class TankUnit extends ArmedUnit{
    public TankUnit(Commander commander){
        super(commander);
    }
    @Override
    public void  attack()
    {
        if(commander.canAttack())
        {
            System.out.println("TankUnit: Attacking.....");
            commander.setAttackStatus(false);
        }
        else{
            System.out.println("TankUnit: Cannot attack now. Other units attacking....");
        }
    }
    @Override
    public void  stopAttack(){
        System.out.println("TankUnit: Stopped attacking.....");
        commander.setAttackStatus(true);
    }
}
