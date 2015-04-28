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

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc364.OI;
import org.usfirst.frc364.Robot;

/**
 *
 */
public class  armControl extends Command {

    public armControl() {
    	requires(Robot.armSystem);
    }

    protected void initialize() {}

    protected void execute() {
    	
    	Value forward = DoubleSolenoid.Value.kForward;
    	Value reverse = DoubleSolenoid.Value.kReverse;
    	Value off = DoubleSolenoid.Value.kOff;
    	
    	if(Robot.oi.closeArms.get() == true) {
    		Robot.armSystem.armPiston.set(forward);
    	}
    	
    	if(Robot.oi.openArms.get() == true){
    		Robot.armSystem.armPiston.set(reverse);
    	}
    	
    	else{
    		Robot.armSystem.armPiston.set(off);
    	}
    	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	end();
    }
    
    protected void interrupted() {}
    
}
