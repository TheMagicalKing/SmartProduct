package Watch;

public class Main {
    public static void main(String[] args) {
        System.out.println("IT WORKS!!!!");
        Watch nWatch = new Watch();
        Watch aWatch = new Watch();

        nWatch.time = 1000;
        nWatch.playingMusic = false;
        nWatch.msgReceived = true;
        nWatch.heartBeat = 104;
        nWatch.musicBar = 0;

        System.out.println(nWatch.time + " Seconds");
        System.out.println("Is the user listening to music? " + nWatch.isPlayingMusic());
        System.out.println("Has the user received a msg?" + nWatch.isMsgReceived());
        System.out.println("How far into the song is the user? " + nWatch.musicBar + " Seconds");
        System.out.println("What is the users heartbeat? " + nWatch.heartBeat + " beats per minute");

        aWatch.time = 20000;
        aWatch.playingMusic = true;
        aWatch.msgReceived = false;
        aWatch.heartBeat = 90;
        aWatch.musicBar = 120;

        System.out.println(aWatch.time + " Seconds");
        System.out.println("Is the user listening to music? " + aWatch.isPlayingMusic());
        System.out.println("Has the user received a msg? " + aWatch.isMsgReceived());
        System.out.println("How far into the song is the user? " + aWatch.musicBar + " Seconds");
        System.out.println("What is the users heartbeat? " + aWatch.heartBeat + " beats per minute");

    }
}
