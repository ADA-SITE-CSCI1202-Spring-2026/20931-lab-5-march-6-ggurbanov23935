class Circle implements Movable {

Point center;
int radius;

public Circle(Point c, int r){
center = c;
radius = r;
}

public void moveUp(){
center.moveUp();
}

public void moveDown(){
center.moveDown();
}

public void moveLeft(){
center.moveLeft();
}

public void moveRight(){
center.moveRight();
}

}