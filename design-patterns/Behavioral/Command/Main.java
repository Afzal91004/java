abstract class Command {
    private WhiteBoardApp app;

    Command(WhiteBoardApp app) {
        this.app = app;
    }

    public abstract void execute(); 
} 

class WhiteBoardApp {
    public String activeColor;
    public String activeTool;
    public String textOnScreen;
    
    public void executeCommand(Command cmd) {
        cmd.execute();
    }
}

class ChangeToolColorCommand extends Command {
    private WhiteBoardApp app;

    ChangeToolColorCommand(WhiteBoardApp app) {
        super(app);
        this.app = app;
    }

    @Override
    public void execute(){
        this.app.activeColor = "Blue";
    }
}

class ChangeToolCommand extends Command {
    private WhiteBoardApp app;

    ChangeToolCommand(WhiteBoardApp app) {
        super(app);
        this.app = app;
    }

    @Override
    public void execute(){
        this.app.activeTool = "Pen";
    }
}

public class Main {
    public static void main(String[] args) {
        WhiteBoardApp app = new WhiteBoardApp();
        ChangeToolColorCommand changeToolColorCommand = new ChangeToolColorCommand(app);
        ChangeToolCommand changeToolCommand = new ChangeToolCommand(app);

        System.out.println("Active Color: "+app.activeColor);
        System.out.println("Active Tool: "+app.activeTool);

        app.executeCommand(changeToolCommand);
        app.executeCommand(changeToolColorCommand);

        System.out.println("Active Color: "+app.activeColor);
        System.out.println("Active Tool: "+app.activeTool);
    }
}