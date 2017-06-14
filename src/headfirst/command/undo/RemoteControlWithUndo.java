package headfirst.command.undo;

public class RemoteControlWithUndo {
  Command[] slots;
  public SimpleRemoteControl() {
    slots=new Command[7];
    //Null Obeject Pattern
    Command noCommand=new NoCommand();
    for(int i=0;i<7;i++) {
      slots[i]=noCommand;
    }
  }
  public void setCommand(int i, Command command) {
    slots[i]=command;
  }
  public void buttonWasPressed(int i) {
    slots[i].execute();
  }
}