package com.aki.designPattern.creation.prototype;

// 1. Ease of Expansion ( Reach Open/Closed Principle )
// 2. Resource of Creating Various Object Efficiency
public class PrototypeTest {

    public static Robot makeRobotPlus(Robot robot) {

        robot.upgrade() ;

        return robot;
    }

    public static void main(String[] args) {

        Robot robot = new Robot();

        Robot basicRobot = robot.clone();

        Robot advancedRobot = makeRobotPlus(basicRobot);
        System.out.println(advancedRobot);
    }
}
