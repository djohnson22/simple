
package com.eonsahead.fractalset;

/**
 * Emulate a complex number.
 * 
 */
public class Complex {
    private final double real;
    private final double imag;
    
    /**
    * The Complex constructor. emulate a complex number.
    * @param real the real component of the complex number
    * @param imag the imaginary portion of the complex number
    */
    
    public Complex( double real, double imag ) {
        this.real = real;
        this.imag = imag;
    } // Complex()
    
    /**
     * Add complex numbers.
     * @param z the second complex number to be added
     * @return the sum of the complex numbers 
     */
    public Complex add( Complex z ) {
        double r = this.real + z.real;
        double i = this.imag + z.imag;
        return new Complex( r, i );
    } // add( Complex )
    
    /**
     * Multiply complex numbers.
     * @param z the second complex number to be multiplied
     * @return the product of the complex numbers
     */
    public Complex multiply( Complex z ) {
        // u = (a + bi)
        // v = (c + di)
        // u * v = (a + bi)(c + di)
        //       = ac + bi * di + adi + cbi
        //       = (ac - bd) + (ad + cb)i
        
        double r = this.real * z.real - this.imag * z.imag;
        double i = this.real * z.imag + this.imag * z.real;
        
        return new Complex( r, i);
    } // multiply( Complex )
    
    /**
     * Square complex numbers.
     * @return the squared complex number
     */
    public double magnitudeSquared() {
        double rSquared = this.real * this.real;
        double iSquared = this.imag * this.imag;
        
        return rSquared + iSquared;
    } // magnitudeSquared()
    
} // Complex
