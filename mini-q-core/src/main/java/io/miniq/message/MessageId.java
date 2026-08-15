package io.miniq.message;

import java.util.UUID;

public final class MessageId{
    private final UUID uuid;
    private MessageId(UUID uuid){
        this.uuid = uuid;
    }
    
}