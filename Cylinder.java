package proyectoED;

import java.io.PrintWriter;

/**
 * Esta es la clase cilindro, extiende de la clase ThreeDimensionalShape.
 * La clase cilindro contiene radio y altura.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 * @see ThreeDimensionalShape
 */

public class Cylinder extends ThreeDimensionalShape{
    //Instancia las variables radio y altura.
    double radius , height;

    /**
     * Constructor vacio
     */
    public Cylinder() {
    }

    
    /**
     * Constructor por defecto que toma el radio y la altura del cilindro para
     * crear el objeto. 
     * @param radius radio
     * @param height altura
     */
    public Cylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }

    
   
    /**
     * Constructor para clonar el objeto.
     * @param cyl cilindro
     */
    public Cylinder(Cylinder cyl)
    {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    
    /**
     * Metodo que devuelve el radio del cilindro.
     * @return radio
     */
    public double getRadius() 
    {
        return radius;
    }

    
    /**
     * Metodo para establecer el radio del cilindro.
     * @param radius radio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Metodo que devuelve la altura del cilindro.
     * @return altura
     */
    public double getHeight() 
    {
        return height;
    }

    
    /**
     * Metodo para establecer la altura del cilindro.
     * @param height altura
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Sobreescribe el metodo getSurfaceArea.
     * Devuelve el area superficial del cilindro.
     * @return area
     */
    @Override
    public double getSurfaceArea() 
    {
        return 2 * Math.PI * this.radius * this.height;
    }

    
    
    
    /**
     * Sobreescribe el metodo getVolume.
     * Devuelve el volumen del cilindro.
     * @return volumen
     */
    @Override
    public double getVolume() 
    {
        return  Math.PI * this.radius * this.radius * this.height;
    }

    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del cilindro
     * en un archivo externo.
     * @param out print
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
    
    
}
