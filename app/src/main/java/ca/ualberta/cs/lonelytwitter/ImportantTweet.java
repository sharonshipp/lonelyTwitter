package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message) throws TweetTooLongException{
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }



}
