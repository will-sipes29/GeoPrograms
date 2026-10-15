public class A3_Color extends World {

    //variables
    public int randomRed;
    public int randomBlu;
    public int randomGrn;
    public int randomAngle;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        randomRed = plane.random(0,255);
        randomGrn = plane.random(0,255);
        randomBlu = plane.random(0,255);
        album();

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
        plane.setTrailColor(randomRed, randomGrn, randomBlu);
        plane.setAngle(5);
        plane.move(200);
        plane.setAngle(185);
        plane.move(200);
        plane.setTrailColor(randomBlu, randomGrn, randomRed);
        plane.setAngle(10);
        plane.move(200);
        plane.setAngle(190);
        plane.move(200);
        plane.setTrailColor(randomGrn, randomBlu, randomRed);
        plane.setAngle(15);
        plane.move(200);
        plane.setAngle(195);
        plane.move(200);
        plane.setTrailColor(randomRed, randomBlu, randomGrn);
        plane.setAngle(20);
        plane.move(200);
        plane.setAngle(200);
        plane.move(200);
        plane.setTrailColor(randomGrn, randomRed, randomBlu);
        plane.setAngle(25);
        plane.move(200);
        plane.setAngle(205);
        plane.move(200);
        plane.setTrailColor(randomBlu, randomRed, randomGrn);
        plane.setAngle(30);
        plane.move(200);
    }

}
