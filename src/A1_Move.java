public class A1_Move extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.setAngle(60);
        plane.hasTrail = true;
        plane.move(200);
        plane.setAngle(180);
        plane.move(200);
        plane.setAngle(-60);
        plane.move(200);
        plane.hasTrail = false;
        plane.setAngle(120);
        plane.move(100);
        plane.hasTrail = true;
        plane.setAngle(160);
        plane.move(200);
        plane.hasTrail = false;
        plane.setAngle(-20);
        plane.move(200);
        plane.setAngle(0);
        plane.move(100);
        plane.hasTrail = true;
        plane.setTrailColor(255,0,0);
        plane.setAngle(5);
        plane.move(200);
        plane.setAngle(185);
        plane.move(200);
        plane.setTrailColor(255,165,0);
        plane.setAngle(10);
        plane.move(200);
        plane.setAngle(190);
        plane.move(200);
        plane.setTrailColor(255,255,0);
        plane.setAngle(15);
        plane.move(200);
        plane.setAngle(195);
        plane.move(200);
        plane.setTrailColor(0,255,0);
        plane.setAngle(20);
        plane.move(200);
        plane.setAngle(200);
        plane.move(200);
        plane.setTrailColor(0,0,255);
        plane.setAngle(25);
        plane.move(200);
        plane.setAngle(205);
        plane.move(200);
        plane.setTrailColor(255,0,255);
        plane.setAngle(30);
        plane.move(200);
        
    }

}

