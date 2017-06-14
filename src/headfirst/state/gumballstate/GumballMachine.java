package headfirst.state.gumballstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  
  State state=soldOutState;
  int count=0;
  
  public GumballMachine(int count) {
    soldOutState=new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState=new SoldState(this);
    this.count=count;
    if(count>0) {
      state=NoQuarterState;
    }
  }
  public void insertQuarter() {
    state.insertQuarter();
  }
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  void setState(State state) {
    this.state=state;
  }
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if(count !=0) {
      count=count-1;
    }
  }
  int getCount() {
    return count;
  }
  void refill(int count) {
    this.count=count;
    state=NoQuarterState;
  }
  public State getState() {
    return state;
  }
  public State getNoQuarterState() {
    return NoQuarterState;
  }
  public State getSoldOutState() {
    return SoldOutState;
  }
  public State getHasQuarterState() {
    return HasQuarterState() {
      
      