package designpatterns.behavioural.State;




/*--
Need to be improved

by marking as Baby,basic, final evolutions wiyh level inteface and then use a variable called name
This should be the expected values
*/

public class Pokemon {

    Level level = new Pichu();

    public void nextState()
    {
        level.nextState(this);
    }

    public void previousState()
    {
        level.previousState(this);
    }


}
