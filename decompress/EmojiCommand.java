// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import sg2.e;
import al0.b;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/EmojiCommand;", "", "id", "", "command", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "getId", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EmojiCommand
{
    private final String command;
    private final String id;
    private final String value;
    
    public EmojiCommand(final String id, final String command, final String value) {
        b.q(id, "id", command, "command", value, "value");
        this.id = id;
        this.command = command;
        this.value = value;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.command;
    }
    
    public final String component3() {
        return this.value;
    }
    
    public final EmojiCommand copy(final String s, final String s2, final String s3) {
        e.f((Object)s, "id");
        e.f((Object)s2, "command");
        e.f((Object)s3, "value");
        return new EmojiCommand(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmojiCommand)) {
            return false;
        }
        final EmojiCommand emojiCommand = (EmojiCommand)o;
        return e.a((Object)this.id, (Object)emojiCommand.id) && e.a((Object)this.command, (Object)emojiCommand.command) && e.a((Object)this.value, (Object)emojiCommand.value);
    }
    
    public final String getCommand() {
        return this.command;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getValue() {
        return this.value;
    }
    
    @Override
    public int hashCode() {
        return this.value.hashCode() + b.c(this.command, this.id.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("EmojiCommand(id=");
        r.append(this.id);
        r.append(", command=");
        r.append(this.command);
        r.append(", value=");
        return f0.n(r, this.value, ')');
    }
}
