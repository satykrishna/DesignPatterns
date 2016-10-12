package com.oops.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import example.pattern.FactoryPattern.Circle;
import example.pattern.FactoryPattern.Rectangle;
import example.pattern.FactoryPattern.Shape;
import example.pattern.FactoryPattern.ShapeFactory;
import example.pattern.FactoryPattern.Square;


public class TestFactoryPattern {
    
    
    private ShapeFactory factory;
    
    
    @Before
    
    public void initialize() {
        factory = new ShapeFactory();
    }
    
    
   @Test
   public void testSquare(){
       Shape shape = factory.getShape("Square");
       assertEquals(shape instanceof Square , true);
   }
   
   @Test
   public void testCircle() {
       Shape shape = factory.getShape("circle");
       assertEquals(shape instanceof Circle, true);
   }
   
   
   @Test 
   public void testRectangle() {
       Shape shape = factory.getShape("rectangle");
       assertEquals(shape instanceof Rectangle , true);
   }
   
   
   @Test
   public void testAnyOtherShape() {
       Shape shape = factory.getShape("Random");
       assertNull(shape);
   }
   
   @Test
   public void testNoType(){
       Shape shape = factory.getShape("");
       assertNull(shape);
   }
   
   @After
   public void destroy() {
       factory = null;
   }
    

}
