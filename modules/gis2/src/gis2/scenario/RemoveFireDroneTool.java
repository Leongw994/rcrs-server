package gis2.scenario;

import maps.gml.GMLShape;

import javax.swing.undo.AbstractUndoableEdit;

public class RemoveFireDroneTool extends ShapeTool {
    /**
     * Construct a RemoveDroneTool.
     *
     * @param editor The editor instance.
     */
    public RemoveFireDroneTool(ScenarioEditor editor) {
        super(editor);
    }

    @Override
    public String getName() {
        return "Remove fire drone";
    }

    @Override
    protected boolean shouldHighlight(GMLShape shape) {
        return true;
    }

    @Override
    protected void processClick(GMLShape shape) {
        editor.getScenario().removeFireDrone(shape.getID());
        editor.setChanged();
        editor.updateOverlays();
        editor.addEdit(new RemoveFireDroneEdit(shape.getID()));
    }

    private class RemoveFireDroneEdit extends AbstractUndoableEdit {
        private final int id;

        public RemoveFireDroneEdit(int id) {
            this.id = id;
        }

        @Override
        public void undo() {
            super.undo();
            editor.getScenario().addFireDrone(id);
            editor.updateOverlays();
        }

        @Override
        public void redo() {
            super.redo();
            editor.getScenario().removeFireDrone(id);
            editor.updateOverlays();
        }
    }
}
