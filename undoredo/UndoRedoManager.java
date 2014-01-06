package undoredo;

import java.util.Stack;

public class UndoRedoManager {
    private Stack<Commandable> undo = new Stack<Commandable>();
    private Stack<Commandable> redo = new Stack<Commandable>();
    
    public void addCommand(Commandable command)
    {
        undo.push(command);
        redo.clear();
    }
    
    public void undo()
    {
        Commandable command = undo.pop();
        command.execute();
        redo.push(command);
    }
    
    public void redo()
    {
        Commandable command = redo.pop();
        command.execute();
        undo.push(command);
    }
    
    public boolean canUndo()
    {
        return !undo.empty();
    }
    
    public boolean canRedo()
    {
        return !redo.empty();
    }
}
