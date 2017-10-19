public class MyPointOpg_10_4 {
    public static void main(String[] args) {
        //Laver et nyt punkt som object, kunne have undladet at skrive parameter, pga. del 2.
        MyPointOpg_10_4 test = new MyPointOpg_10_4(0,0);
        //Printer distancen og laver punkt 2.
        System.out.println("The Distance is: "+test.distance(10,30.5));
    }



    //Del 1. lav datafields
    double x;
    double y;




    //Del 2. Constructor der tillader bruger at lave et punkt, på 0,0.
    MyPointOpg_10_4(){
        this.x = 0;
        this.y = 0;
    }

    //Del 3. Constructor der tillader bruger at lave et punkt med værdier.
    MyPointOpg_10_4(int x, int y){
        this.x=x;
        this.y=y;
    }

    //Del 4. Method der viser distance mellem 1,1 og punktet.
    public double distance(){
        return Math.sqrt( ( (x-1)*(x-1) )+( (y-1)*(y-1) ) ); // Math.sqrt=kvadratrod og 1 tallerne er fra punktet.
    }

    //Del 5. Constructor der viser distance mellem punkt og et nyt punkt.
    public double distance(double x1, double y1){
        return Math.sqrt( ( (x-x1)*(x-x1) )+( (y-y1)*(y-y1) ) ); // Math.sqrt=kvadratrod

    }



    //Del 1. Gettere og Settere til variabler x og y
    public void setX(int x) { this.x = x;
    }
    public void setY(int y) { this.y = y;
    }
    public double getX() { return x;
    }
    public double getY() { return y;
    }
}
