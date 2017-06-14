package headfirst.command.undo;

public class LightCommand implements Command {
  Light light;
  int level;
  public LightCommand(Light light) {
    this.light=light;
  }
  public void execute() {
    level=light.getLevel();
    light.on();
  }
  public void undo() {
    light.dim(level);
  }
}