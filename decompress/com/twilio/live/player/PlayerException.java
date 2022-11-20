// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0016" }, d2 = { "Lcom/twilio/live/player/PlayerException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "message", "", "explanation", "throwable", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "getExplanation", "()Ljava/lang/String;", "getMessage", "equals", "", "other", "", "hashCode", "toString", "player_release" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public final class PlayerException extends Exception
{
    private final int code;
    private final String explanation;
    private final String message;
    
    public PlayerException(final int code, final String message, final String explanation, final Throwable t) {
        e.f((Object)message, "message");
        super(message, t);
        this.code = code;
        this.message = message;
        this.explanation = explanation;
    }
    
    public PlayerException(final int n, final String s, String s2, Throwable t, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x4) != 0x0) {
            s2 = null;
        }
        if ((n2 & 0x8) != 0x0) {
            t = null;
        }
        this(n, s, s2, t);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Object class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        if (!e.a((Object)PlayerException.class, class1)) {
            return false;
        }
        if (o != null) {
            final PlayerException ex = (PlayerException)o;
            return this.code == ex.code && e.a((Object)this.getMessage(), (Object)ex.getMessage()) && e.a((Object)this.explanation, (Object)ex.explanation);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.twilio.live.player.PlayerException");
    }
    
    public final int getCode() {
        return this.code;
    }
    
    public final String getExplanation() {
        return this.explanation;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
    @Override
    public int hashCode() {
        final int code = this.code;
        final int hashCode = this.getMessage().hashCode();
        final String explanation = this.explanation;
        int hashCode2;
        if (explanation == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = explanation.hashCode();
        }
        return (hashCode + code * 31) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PlayerException(code=");
        t.append(this.code);
        t.append(", message='");
        t.append(this.getMessage());
        t.append("', explanation=");
        t.append((Object)this.explanation);
        t.append(')');
        return t.toString();
    }
}
