public class mp4player: advancemediaplayer
{
public void mp4 ()
 {
Console.WriteLine("run mp4 files");
} I
public void vlc ()
{
Console.WriteLine("run vlc files");

}
}

--------------------------------------------------------------------------

 public interface audioplayer
{
void play (string file);
} 

---------------------------------------------------------------------------

  public class audioplayermp3 : audioplayer
{
adapter myapdater;
public void play (string file)
{
if(file.EndsWith ("mp3")) {
Console.WriteLine("run mp3 files");
}
else
I
{
myapdater=new adapter (file);
myapdater.play (file);

----------------------------------------------------------------------------


  public class adapter: audioplayer
{
advancemediaplayer adv;
public adapter (string file)
{
if (file.EndsWith ("mp4"))
adv = new mp4player ();
else
adv new vlclpayer ();
}
public void play (string file)
{
if (file.EndsWith ("mp4"))
adv.mp4 ();
else
adv. vlc ();

-------------------------------------------------------------------------------


  {
static void Main(string[] args)
{
audioplayermp3 mp3= new audioplayermp3 ();
mp3.play("song.mp4");
Console.ReadKey();
}



 Res:https://youtu.be/0wdRaXpyzBs





 -------------------------------------------------------------------------------------------------------------------------------------------

  ANOTHER EXAMPLE:


 CoffeeMachineInterface.java

public interface CoffeeMachineInterface {
	public void chooseFirstSelection();
	public void chooseSecondSelection();
}


OldCoffeeMachine.java

public class OldCoffeeMachine {

	public void selectA() {
		System.out.println(“A - Selected”);
	}
	Public void selectB() {
		System.out.println(“B - Selected”);
	}
}






CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCofffeeMachine theMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		theMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		theMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		theMachine.selectB();
}
}

