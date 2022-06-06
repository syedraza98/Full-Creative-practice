package polymorphism;

public class car extends vehicle{
 int numdoors;
  int maxSpeed;
  public car(int a) {
	  
  }
 public void maxspeed(int maxspeed) {
	  this.maxSpeed=maxspeed;
	  System.out.print("carspeed"+maxSpeed);
  }
  int numdoorscar(int numdoors) {
	  this.numdoors=numdoors;
	  return numdoors;
  }
}
