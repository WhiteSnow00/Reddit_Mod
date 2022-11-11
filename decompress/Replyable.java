// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import java.io.Serializable;

public interface Replyable extends Serializable
{
    Listing<ReplyableWrapper> getReplies();
    
    void setReplies(final Listing<ReplyableWrapper> p0);
}
