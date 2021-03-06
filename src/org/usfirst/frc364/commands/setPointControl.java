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

public class  setPointControl extends Command {
	
	
	public setPointControl() {
		requires(Robot.liftSystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	
    	if(Robot.oi.controller.getRawAxis(3) < 0.05 && Robot.oi.controller.getRawAxis(3) > -0.05) {
    		
    		if(Robot.oi.liftSetPoint.get() == true) {
    			Robot.liftSystem.setLiftSetpoint();
    		}
    		if(Robot.oi.dropSetPoint.get() == true) {
    			Robot.liftSystem.setDropSetpoint();
    		}
    		if(Robot.oi.transportSetPoint.get() == true) {
    			Robot.liftSystem.setTransportSetpoint();
    		}
    		if(Robot.oi.pickupATote.get() == true) {
    			Robot.liftSystem.pickupATote();
    		}
    	}
    	
    	else {
    		Robot.liftSystem.manualControl();
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
