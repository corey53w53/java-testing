public class test {
    int x = 5;
    public static void main(String[] args) {
        test myObj = new test();
        System.out.println(myObj.x);

        Point p1 = new Point(-3,0);
        System.out.println(p1);
        p1.moveToOrigin();
        System.out.println(p1);
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

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}

// ================================