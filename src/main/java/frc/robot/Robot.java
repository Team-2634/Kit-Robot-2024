

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class Robot extends TimedRobot {

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    

  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    final XboxController xboxController = new XboxController(0);
    final PWMSparkMax leftSideMotors = new PWMSparkMax(0);
    final PWMSparkMax rightSideMotors = new PWMSparkMax(1); //Note change id's once we know what they are on the kitbot
    final DifferentialDrive robotDrive = new DifferentialDrive(leftSideMotors::set,rightSideMotors::set);

    rightSideMotors.setInverted(true); //Change to left side if kitbot motors is inverted on the left side

    robotDrive.arcadeDrive(xboxController.getLeftY(),xboxController.getRightX());

  }

  @Override
  public void disabledInit() {}


  @Override
  public void disabledPeriodic() {}


  @Override
  public void testInit() {}


  @Override
  public void testPeriodic() {}


  @Override
  public void simulationInit() {}


  @Override
  public void simulationPeriodic() {}
}
