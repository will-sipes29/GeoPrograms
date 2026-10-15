public class A5_Square extends World {

    public int randomBlu;
    public int randomRed;
    public int randomGrn;

    public int randx1;
    public int randy1;
    public int randx2;
    public int randy2;
    public int randx3;
    public int randy3;

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 3;

        randomBlu = plane.random(0,255);
        randomRed = plane.random(0,255);
        randomGrn = plane.random(0,255);

        randx1 = plane.random(200,500);
        randy1 = plane.random(200,500);
        randx2 = plane.random(200,500);
        randy2 = plane.random(200,500);
        randx3 = plane.random(200,500);
        randy3 = plane.random(200,500);

        randomalbum();
        randomhouse();
        randompyramid(50);

    }

    //parameter is a variable made in parentheses of a method
    //only usable in the method
    public void square(int size) {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(size-12);
        plane.turnLeft(90);
        plane.move(size-12);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        // notice the direction your plane is facing at this point
    }

    public void bigsquare() {
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
    }

    public void randomalbum(){
        plane.teleport(randx1,randy1);
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

    public void randompyramid(int size){
        plane.teleport(randx3,randy3);
        plane.setTrailColor(randomRed, randomGrn, randomBlu);
        plane.setAngle(90);
        square(size);
        square(size+20);
        square(size+40);
        square(size+60);
        square(size+80);
        square(size+100);
        square(size+120);

    }

    public void randomhouse(){
        plane.teleport(randx2,randy2);
        plane.setAngle(0);
        plane.hasTrail = true;
        plane.setTrailColor(randomBlu,randomRed,randomGrn);
        plane.trailWidth = 10;
        plane.move(500);
        plane.turnLeft(90);
        plane.move(350);
        plane.turnLeft(45);
        plane.move(250);
        plane.turnLeft(90);
        plane.move(260);
        plane.turnLeft(45);
        plane.move(335);
        plane.turnLeft(180);
        plane.move(100);
        plane.turnLeft(270);
        plane.move(80);
        plane.turnLeft(270);
        plane.move(100);
        plane.turnLeft(270);
        plane.move(80);
    }

}//end of file


