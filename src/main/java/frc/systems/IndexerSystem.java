package frc.systems;

import frc.input.InputMethod;
import frc.wpi.first.wpilibj.Spark;
import frc.robot.*;

/**
 * Indexer System
 */
public class IndexerSystem extends RobotSystem{
  protected InputMethod input;
  private Spark indexerMotor;

  /**
   * Creates a new RobotSystem
   * 
   * @param input the object that gives the controller input from the user
   */
  public IndexerSystem(InputMethod input) {
    super(input);
    
  }

  /**
   * Initializes the motors and other elements of the system. 
   * Separate from constructor to allow skipping during testing.
   */
  public void init();
  {
    indexerMotor = new Spark(RobotMap.INDEXER);
  }

  /**
   * Runs the system. Intended to be called periodically and rapidly
   */
  public void run()
  {
    if (input.shouldIntake())
    {
        setSpeed(1);
    }
    else
    {
        setSpeed(0);
    }
  }

  public void setSpeed(double speed)
  {
    indexerMotor.setSpeed(speed);
  }
}