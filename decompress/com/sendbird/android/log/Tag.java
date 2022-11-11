// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.log;

import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t" }, d2 = { "Lcom/sendbird/android/log/Tag;", "", "tag", "", "(Ljava/lang/String;ILjava/lang/String;)V", "DEFAULT", "CONNECTION", "PINGER", "DB", "sendbird_release" }, k = 1, mv = { 1, 4, 2 })
public enum Tag
{
    CONNECTION("CONNECTION"), 
    DB("DB"), 
    DEFAULT("SendBird"), 
    PINGER("PINGER");
    
    private final String tag;
    
    private Tag(final String tag) {
        this.tag = tag;
    }
    
    public final String tag() {
        return this.tag;
    }
}
