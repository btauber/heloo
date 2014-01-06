package undoredo;

import java.util.Stack;

public class UndoRedoAddress {
    private Stack<Commandable> undoAdd = new Stack<Commandable>();
    private Stack<Commandable> redoAdd = new Stack<Commandable>();
    
    public void addCommand(Commandable command)
    {
        undoAdd.push(command);
        redoAdd.clear();
    }
    
    public void undo()
    {
        Commandable command = undoAdd.pop();
        command.execute();
        redoAdd.push(command);
    }
    
    public void redo()
    {
        Commandable command = redoAdd.pop();
        command.execute();
        undoAdd.push(command);
    }
    
    public boolean canUndo()
    {
        return !undoAdd.empty();
    }
    
    public boolean canRedo()
    {
        return !redoAdd.empty();
    }
}

