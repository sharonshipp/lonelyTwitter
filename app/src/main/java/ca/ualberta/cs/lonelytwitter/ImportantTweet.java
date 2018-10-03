package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *   A special type of Tweet app
 */

public class ImportantTweet extends Tweet{

    ImportantTweet(){
        super();
    }

    ImportantTweet(String message){
        super(message);
    }
    
    @Override
    public Boolean isImportant(){
        return true;
    }
}
