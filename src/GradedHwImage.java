public class GradedHwImage extends World{

    public void go() {

        plane.pausetime = 0;
        plane.trailWidth = 105;
        plane.hasTrail = true;
        for(int y=0;y<81;y=y+1){ // this loop creates multiple rows
            plane.teleport(0,y*10);
            for(int z=0;z<255;z=z+1){ // this one moves the plane and  changes the color to make a gradient
                plane.setTrailColor(z,0,3*y);
                plane.move(4);
            }
        }

        plane.hasTrail = false;
        for (int w=0;w<7;w=w+1){ // this repeats the arc method 6 times rotated differently to make a spiral
            plane.teleport(700,400);
            arc(12);
            plane.setAngle(60*w);
        }

        plane.teleport(700,400);
        plane.hasTrail = true;
        plane.trailWidth = 50;
        plane.circle(595); // this just makes a circle to enclose the arcs

        plane.hasTrail = false;
        plane.teleport(700,750); // teleporting to the bottom middle to start a circle
        for(int x=0;x<360;x=x+1){ //this loop tells the plane to make a circle then move forward and turn slightly
            if (x<181){
                plane.setTrailColor(75+x,0,75+x);// when the plane approaches the top of the circle the purple gets more vibrant
            }
            if (x>180) {
                plane.setTrailColor(360-x+75,0,360-x+75);// when the plane approaches the bottom of the circle the purple gets less vibrant
            }
            plane.fillCircle(100);// the plane inches forward and turns slightly with a different color each time to make a gradient
            plane.turnLeft(1);
            plane.move(5);
        }

    }// end of go

    public void arc(int p){
        for(int x=0;x<72;x=x+1){
            plane.setTrailColor(255,3*x,0);// increasing green to make gradient
            plane.fillCircle(2*p);// same circle > move > turn idea from last chunk
            plane.move(p);
            plane.turnLeft(2.5);
        }
    }

}// end file

