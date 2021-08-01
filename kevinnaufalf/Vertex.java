/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinnaufalf;

public class Vertex {

    String label;
    double x;
    double y;

    public Vertex(String label, double x, double y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return label + " (" + x + " , " + y + ")";
    }
}
