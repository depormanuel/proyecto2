package proyectoED;


import java.io.PrintWriter;
/**
 * Esta es la clase circulo, extiende de la clase TwoDimensionalShape.
 * La clase circulo contiene radio y centro del circulo.
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 * @see TwoDimensionalShape
 */

public class Circle  extends TwoDimensionalShape{
    //Instanciamos las variables radius y center.
    private double  radius ;
    private Point center;

    /**
     * Constructor por defecto que toma el radio y el centro del circulo para
     * crear el objeto.
     * @param center Centro del circulo
     * @param radius Radio del circulo
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * Constructor para clonar el objeto. 
     * @param circle Parametro circulo
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    
    /**
     * Metodo que devuelve el radio del circulo.
     * @return radius
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Metodo para establecer el radio del circulo.
     * @param radius Radio del circulo
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
    * Metodo que devuelve el centro del circulo.
     * @return center
     */
    public Point getCenter() 
    {
        return center;
    }

    
    
    /**
     * Metodo para establecer el centro del circulo.
     * @param center Devuelve el centro.
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del circulo
     * en un archivo externo.
     * @param out Devuelve los parametros del circulo.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radius = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * Sobreescribe el metodo getArea.Devuelve el area del circulo.
     * @return area
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Sobreescribe el metodo getPerimeter.Devuelve el perimetro del circulo.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}

    

