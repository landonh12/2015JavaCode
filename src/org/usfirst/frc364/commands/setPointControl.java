// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc364.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc364.Robot;

/**
 *
 */
public class  setPointControl extends Command {
	
	
	public setPointControl() {
    }

    protected void initialize() {
    }

    protected void execute() {
    	
    	double keepsetpoint = 0;
    	
    	if(Robot.oi.liftSetPoint.get() == true){
    		Robot.liftSystem.setSetpoint(1.0);
    		keepsetpoint = 1.0;
    	}
    	if(Robot.oi.dropSetPoint.get() == true){
    		Robot.liftSystem.setSetpoint(1.0);
    		keepsetpoint = 1.0;
    	}
    	if(Robot.oi.transportSetPoint.get() == true){
    		Robot.liftSystem.setSetpoint(1.0);
    		keepsetpoint = 1.0;
    	}
    	else{
    		Robot.liftSystem.setSetpoint(keepsetpoint);
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	end();
    }
    
    protected void interrupted() {
    }
}
