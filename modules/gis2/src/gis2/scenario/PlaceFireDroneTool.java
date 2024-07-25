package gis2.scenario;

import maps.gml.GMLShape;

import javax.swing.undo.AbstractUndoableEdit;
import java.awt.*;

public class PlaceFireDroneTool extends ShapeTool {
    /**
     * Construct a PlaceDroneTool.
     *
     * @param editor The editor instance.
     */
    public PlaceFireDroneTool(ScenarioEditor editor) {
        super(editor);
    }

    @Override
    public String getName() {
        return "Place fire drone";
    }

    @Override
    protected boolean shouldHighlight(GMLShape shape) {
        return true;
    }

    @Override
    protected void processClick(GMLShape shape) {
        editor.getScenario().addFireDrone(shape.getID());
        editor.setChanged();
        editor.updateOverlays();
        editor.addEdit(new AddFireDroneEdit(shape.getID()));
    }

    private class AddFireDroneEdit extends AbstractUndoableEdit {
        private final int id;

        public AddFireDroneEdit(int id) {
            this.id = id;
        }

        @Override
        public void undo() {
            super.undo();
            editor.getScenario().removeFireDrone(id);
            editor.updateOverlays();
        }

        @Override
        public void redo() {
            super.redo();
            editor.getScenario().addDrone(id);
            editor.updateOverlays();
        }
    }
}
