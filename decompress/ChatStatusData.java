// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import androidx.appcompat.widget.s0;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/model/ChatStatusData;", "", "chat_disabled", "", "(Z)V", "getChat_disabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatStatusData
{
    private final boolean chat_disabled;
    
    public ChatStatusData(final boolean chat_disabled) {
        this.chat_disabled = chat_disabled;
    }
    
    public final boolean component1() {
        return this.chat_disabled;
    }
    
    public final ChatStatusData copy(final boolean b) {
        return new ChatStatusData(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ChatStatusData && this.chat_disabled == ((ChatStatusData)o).chat_disabled);
    }
    
    public final boolean getChat_disabled() {
        return this.chat_disabled;
    }
    
    @Override
    public int hashCode() {
        int chat_disabled;
        if ((chat_disabled = (this.chat_disabled ? 1 : 0)) != 0) {
            chat_disabled = 1;
        }
        return chat_disabled;
    }
    
    @Override
    public String toString() {
        return s0.o(a.k("ChatStatusData(chat_disabled="), this.chat_disabled, ')');
    }
}
