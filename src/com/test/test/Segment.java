package com.test.test;
public class Segment
{
    public static Areas areas(double r, double a) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static class Areas {
        public final double inside, outside;

        public Areas(double inside, double outside) {         
            this.inside = inside;
            this.outside = outside;
        }
    }
    
    public static void main(String[] args) {
        Areas areas = Segment.areas(10, 90);
        System.out.println("Areas: " + areas.inside + ", " + areas.outside);  
    }
}