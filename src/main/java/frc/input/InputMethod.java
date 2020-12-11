package frc.input;

/**
 * Operator controls for the robot
 */
public abstract class InputMethod {
    public boolean indexerPower()
    {
        return false;
    }
    public double leftSidePower() 
    {
        return 0;
    }
    
    public double rightSidePower() 
    {
        return 0;
    }
    public boolean climbPower()
    { 
        return false;
    }
    public boolean controllerPower() 
    {
        return false;
    }
    public boolean shooterPower() 
    {
        return false;
    }
    // hello im here !!!
}