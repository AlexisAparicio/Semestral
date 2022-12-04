package com.hello;
import java.util.List;
import java.util.ArrayList;


public class pyramides {
    List<pyramide> pyramides = new ArrayList<pyramide>();

    public List<pyramide> getPyramides() {
        return pyramides;
    }

    public void setPyramides(String problem, String solution) {
        pyramide p = new pyramide();
        p.problem = problem;
        p.solution=solution;
        pyramides.add(p);
    }
    
}
