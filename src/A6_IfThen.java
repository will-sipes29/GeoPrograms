public class A6_IfThen extends World {

    public int randNum;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 2 ;
        plane.teleport(350, 400);

        randNum = plane.random(0,4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        if (randNum ==3 ) {
            album();
        }
    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }//end of square

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }

    public void album(){
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



