public class test {
    public static void main(String[] args) {
        Point p1 = new Point(-3,0);
        Point p2 = new Point(0,2);
        Point p3 = p1.add(p2);
        System.out.println(p3);
    }
}
class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("init");
    }

    public void moveToOrigin(){
        if (this.x<0){
            this.x+=1;
        } else if (this.x>0){
            this.x-=1;
        }
        if (this.y<0){
            this.y+=1;
        } else if (this.y>0){
            this.y-=1;
        }
    }
    public Point add(Point p2){
        int new_x = this.x+p2.x;
        int new_y = this.y+p2.y;
        return new Point(new_x,new_y);
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

}