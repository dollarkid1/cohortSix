/*package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen turtlePen) {
        pen = turtlePen;
        currentDirection=EAST;
        currentPosition=new Position(0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);

    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {

        switch (currentDirection){
            case EAST -> changeCurrentDirectionTo(SOUTH);
            case WEST -> changeCurrentDirectionTo(NORTH);
            case SOUTH -> changeCurrentDirectionTo(WEST);
            case NORTH -> changeCurrentDirectionTo(EAST);
        }

    }
    private void changeCurrentDirectionTo(Direction newDirection){
        currentDirection=newDirection;
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps = numberOfSteps - 1;
        switch (currentDirection){
            case EAST -> currentPosition.increaseColumnPositionBy(5);


        }
    }


    public Position getCurrentPosition() {
        return currentPosition;
    }


    public void turnLeft(){
    switch (currentDirection){
        case EAST: changeCurrentDirectionTo(NORTH);
        case WEST : changeCurrentDirectionTo(SOUTH);
        case SOUTH: changeCurrentDirectionTo(EAST);
        case NORTH: changeCurrentDirectionTo(WEST);
    }
    }
    public void writeOn(SketchPad sketchPad, int numberOfSteps){
        if (!isPenUp()){
            switch (currentDirection){
                case EAST ->
                        int counter = 0;
                        while (counter<numberOfSteps){
                            var floor = sketchPad.getFloor();
                            int rowPosition = currentPosition.getRowPosition();
                            int columnPosition = currentPosition.getColumnPosition();
                            floor[rowPosition][columnPosition+counter]=1;
                            counter++;
                        }
                        break;*/
/*
            }
        }
    }



}
*/
