package com.example.gagan.designpatternexample.structural_design_pattern.composite_pattern;

import com.example.gagan.designpatternexample.structural_design_pattern.CompositeDesignPattern;

/**
 * Created by Gagan on 3/6/2018.
 */

public class Circle extends Shape {
    @Override
    void draw(String color) {
        CompositeDesignPattern.display("Drawing Circle with color: " + color);
    }
}
