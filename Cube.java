package proyectoED;

import java.io.PrintWriter;

/**
 * Esta es la clase cubo, extiende de la clase ThreeDimensionalShape.
 * La clase cubo contiene lado.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 * @see ThreeDimensionalShape
 */

public class Cube extends ThreeDimensionalShape{
    //Instancia la variable largo.
    double length;

    /**
     * Constructor por defecto que toma el lado del cubo para
     * crear el objeto.
     * @param length largo
     */
    public Cube(double length) 
    {
        this.length = length;
    }
     
     
    /**
     * Constructor para clonar el objeto.
     * @param cube cubo
     */
    public Cube(Cube cube)
    {
         this.length = cube.length;
    }

   
    /**
     * Metodo que devuelve el lado del cubo.
     * @return lado
     */
    public double getLength() 
    {
        return length;
    }

    
    /**
     * Metodo para establecer el lado del cubo.
     * @param length lado
     */
    public void setSideLength(double length) 
    {
        this.length = length;
    }

    
    
    /**
     * Sobreescribe el metodo getSurfaceArea.
     * Devuelve el area superficial del cubo.
     * @return area
     */
    @Override
    public double getSurfaceArea() 
    {
        return 6 * this.length * this.length;
    }

    
    
    /**
     * Sobreescribe el metodo getVolume.
     * Devuelve el volumen del cubo.
     * @return volumen
     */
    @Override
    public double getVolume() 
    {
        return this.length * this.length * this.length;
    }

    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del cubo
     * en un archivo externo.
     * @param out print
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Side  Length = " + this.getLength()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");;
        out.write("\n\n\n");
        
    }
     
     
}
