public class LinearEquation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

   public LinearEquation (double x1, double y1, double x2, double y2) {
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;



    }
    public Double Slope (double x1, double y1, double x2, double y2) {
       return (y2-y1)/(x2-x1);
    }
    public yintercept {


    }




    }
    public String EquationOfLine() {
       return "y= " + Slope(x1,y1,x2,y2) + "x " + yintercept;

    }
    public void LineInfo() {
       System.out.println("The two points are:  " + "(" + x1 + "," + y1 + ") " + "and" +  "(" + x1 + "," + y1 + ") ");
       System.out.println("The equation of the line between these points is: " )

    }
}
