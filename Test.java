public class test {
    int x = 5;
    public static void main(String[] args) {
        test myObj = new test();
        System.out.println(myObj.x);
        Person havish = new Person();
        havish.incrementAge();
        System.out.println(havish.age);
        System.out.println(havish);

        Point p1 = new Point(3,4);

        System.out.println(p1);

    }
}

class Person {
    int age =15;
    public Person(){
        System.out.println("I am " + age + " years old.");
    }
    public void incrementAge(){
        this.age+=1;
    }

    @Override
    public String toString(){
        return "I am " + this.age + " years old";
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
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}

// ================================