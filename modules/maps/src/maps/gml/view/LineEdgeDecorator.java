package maps.gml.view;

import maps.gml.GMLEdge;
import rescuecore2.misc.gui.ScreenTransform;
import java.awt.Graphics2D;
import java.awt.Color;

/**
   An EdgeDecorator that draws a line for each edge.
*/
public class LineEdgeDecorator implements EdgeDecorator {
    private Color colour;

    /**
       Construct a LineEdgeDecorator.
       @param colour The colour to draw the line.
    */
    public LineEdgeDecorator(Color colour) {
        this.colour = colour;
    }

    @Override
    public void decorate(GMLEdge edge, Graphics2D g, ScreenTransform transform) {
        int x1 = transform.xToScreen(edge.getStart().getX());
        int y1 = transform.yToScreen(edge.getStart().getY());
        int x2 = transform.xToScreen(edge.getEnd().getX());
        int y2 = transform.yToScreen(edge.getEnd().getY());
        g.setColor(colour);
        g.drawLine(x1, y1, x2, y2);
    }
}