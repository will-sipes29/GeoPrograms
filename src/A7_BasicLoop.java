public class A7_BasicLoop extends World {

    public int randx;
    public int randy;
    public int randred;
    public int randgrn;
    public int randblu;

    public void go() {

        plane.hasTrail = true;
        plane.trailWidth = 30;
        plane.pausetime = 0;
//
        for(int x=0;x<12;x=x+1) { //int declaration;conditional;increment

//            randx = plane.random(100,1300);
//            randy = plane.random(100,700);
//
//            randred = plane.random(0,255);
//            randgrn = plane.random(0,255);
//            randblu = plane.random(0,255);

//            plane.teleport(randx,randy);
//            plane.setTrailColor(randred,randgrn,randblu);

            plane.teleport(100*x, 100);
            plane.setTrailColor(0,0,100+12*x);
            square();
//
//          for(int y=0;y<36;y=y+1){
//                plane.hasTrail = false;
//                plane.move(10);
//                plane.hasTrail = true;
//                plane.circle(100);
//                plane.turnLeft(10);
//            }
        }

        for(int x=0;x<12;x=x+1) {
            plane.teleport(100*x, 200);
            plane.setTrailColor(40,0,100+12*x);
            square();
        }

        for(int x=0;x<12;x=x+1) {
            plane.teleport(100*x, 300);
            plane.setTrailColor(80,0,100+12*x);
            square();
        }

        for(int x=0;x<12;x=x+1) {
            plane.teleport(100*x, 400);
            plane.setTrailColor(120,0,100+12*x);
            square();
        }

        for(int x=0;x<12;x=x+1) {
            plane.teleport(100*x, 500);
            plane.setTrailColor(160,0,100+12*x);
            square();
        }
        for(int x=0;x<12;x=x+1) {
            plane.teleport(100*x, 600);
            plane.setTrailColor(200,0,100+12*x);
            square();
        }
        for(int x=0;x<12;x=x+1) {
            plane.teleport(100*x, 700);
            plane.setTrailColor(240,0,100+12*x);
            square();
        }


    } // end go

    public void square() {
        for(int z=0;z<4;z=z+1){
            plane.move(100);
            plane.turnLeft(90);
        }
    }// end square

}// end file