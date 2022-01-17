public class Circle {   
    double radius;   
       
    Circle() {   
        radius = 1;   
    }   
       
    Circle(double newRadius) {   
        radius = newRadius;   
    }   
       
    double getArea() {   
        return radius * radius *3.14159; //Math.PI;   
    }   
       
    double getPerimeter() {   
        return 2 * radius*3.14159; //* Math.PI;   
    }   
       
    void setRadius(double newRadius) {   
        radius = newRadius;   
    }
}  
