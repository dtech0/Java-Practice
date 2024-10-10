public class box{
    double height, width, depth;

    box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol(){
        System.out.println("The volume of the box is: " + height * width * depth);
    }
}