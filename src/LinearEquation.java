public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

   public LinearEquation (int x1, int y1, int x2, int y2) {
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;



    }

    public double getDistance() {
       return Math.sqrt((x2-x1)+(y2-y1));
    }
    public double getSlope()  {
       return((y2-y1)/(x2-x1));




    }
    public double getyintercept()  {
       return  (y1-(((y2-y1)/(x2-x1))*x1));
    }





    public String EquationOfLine() {
       return "y= " + getSlope() + "x " + getyintercept();

    }


    public void LineInfo() {
       System.out.println("The two points are:  " + "(" + x1 + "," + y1 + ") " + "and" +  "(" + x1 + "," + y1 + ") ");
       System.out.println("The equation of the line between these points is: " + EquationOfLine());
       System.out.println("The slope of this line is: " + getSlope());
       System.out.println("The y-intercept of the line is: " + getyintercept());


    }
}
