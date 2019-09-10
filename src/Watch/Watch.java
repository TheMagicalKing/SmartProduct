package Watch;

public class Watch {

    //Variables

    int time; //measured in seconds, calculated to HH|MM later
    short heartBeat; //Measuring the users heartbeat through heartbeat reading technology
    boolean playingMusic;//if true allow screen for music user is listening too, else skip the screen
    boolean msgReceived;//If true change the screen so the user can read the msg
    int musicBar;//measured in seconds calculated to HH|MM|SS to display how long into the song/pod cast the user is listening too.

    //Methods
    boolean isPlayingMusic(){
        System.out.println("User is listening to music display music screen");
        //@TODO setup the method to check if the user is listening to music
        //@TODO change the screen if the user is listening to music
        return playingMusic;
    }
    Boolean isMsgReceived(){
        System.out.println("User has received a message change the screen to display the message!");
        //@TODO check if the user has received a message
        //@TODO if the user has received a message change the screen to display said message
        return msgReceived;
    }

}
