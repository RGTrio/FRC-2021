package frc.input;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * The input from the XBox remote
 */
public class XBoxInput extends InputMethod {
  private XboxController controller;
  @Override
  public boolean indexerPower()
  {
      return controller.getAButton();
  }
  @Override
  public double leftSidePower() 
  {
      return controller.getY(Hand.kLeft);
  }
  @Override
  public double rightSidePower() 
  {
      return controller.getY(Hand.kRight);
  }
  @Override
  public double shooterPower() 
  {
  return controller.getLT();
  }
  @Override
  public boolean controllerPower() 
  {
  return controller.getBButton();
  }
  @Override
  public boolean climbPower()
  {
    return controller.getYButton();
  }
}