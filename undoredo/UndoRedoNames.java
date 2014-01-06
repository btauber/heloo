package undoredo;

import java.util.Stack;

public class UndoRedoNames extends UndoRedoManager{
    private Stack<Commandable> undo = new Stack<Commandable>();
    private Stack<Commandable> redo = new Stack<Commandable>();
    
}
