package frc.systems;

import frc.input.InputMethod;
import frc.wpi.first.wpilibj.Spark;

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
    indexerMotor = new Spark(RobotMap.INDEXER);
  }

  /**
   * Initializes the motors and other elements of the system. 
   * Separate from constructor to allow skipping during testing.
   */
  public void init();

  /**
   * Runs the system. Intended to be called periodically and rapidly
   */
  public void run();
}