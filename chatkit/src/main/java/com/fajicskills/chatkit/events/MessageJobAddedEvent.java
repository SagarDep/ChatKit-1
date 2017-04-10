package com.fajicskills.chatkit.events;

import com.fajicskills.chatkit.MessageRecord;

/**
 * Created by angebagui on 09/04/2017.
 */

public class MessageJobAddedEvent implements MessageEvent {

   private MessageRecord messageRecord;

    public MessageJobAddedEvent(MessageRecord messageRecord) {
        this.messageRecord = messageRecord;
    }

    public MessageRecord getMessageRecord() {
        return messageRecord;
    }

    public void setMessageRecord(MessageRecord messageRecord) {
        this.messageRecord = messageRecord;
    }
}
