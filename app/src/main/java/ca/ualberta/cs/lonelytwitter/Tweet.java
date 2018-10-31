package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class SimpleTweet {
    public static final int MAX_CHARS = 140;
    public String message;
    private Date date;

    public SimpleTweet(String message) throws TweetTooLongException{
        this.setMessage(message);
        this.setDate(new Date());
    }

    public SimpleTweet(String message, Date date) throws TweetTooLongException{
        this.setMessage(message);
        this.setDate(date);
    }

    @Override
    public String toString(){
        return message;
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > MAX_CHARS){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
