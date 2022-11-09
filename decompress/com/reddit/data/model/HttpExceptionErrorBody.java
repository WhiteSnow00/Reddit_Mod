// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c" }, d2 = { "Lcom/reddit/data/model/HttpExceptionErrorBody;", "", "reason", "", "message", "error", "", "interstitialWarningMessage", "quarantineMessage", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getError", "()I", "getInterstitialWarningMessage", "()Ljava/lang/String;", "getMessage", "getQuarantineMessage", "getReason", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "remote_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class HttpExceptionErrorBody
{
    private final int error;
    private final String interstitialWarningMessage;
    private final String message;
    private final String quarantineMessage;
    private final String reason;
    
    public HttpExceptionErrorBody(final String reason, final String message, final int error, @n(name = "interstitial_warning_message_html") final String interstitialWarningMessage, @n(name = "quarantine_message_html") final String quarantineMessage) {
        f.f((Object)reason, "reason");
        f.f((Object)message, "message");
        this.reason = reason;
        this.message = message;
        this.error = error;
        this.interstitialWarningMessage = interstitialWarningMessage;
        this.quarantineMessage = quarantineMessage;
    }
    
    public final String component1() {
        return this.reason;
    }
    
    public final String component2() {
        return this.message;
    }
    
    public final int component3() {
        return this.error;
    }
    
    public final String component4() {
        return this.interstitialWarningMessage;
    }
    
    public final String component5() {
        return this.quarantineMessage;
    }
    
    public final HttpExceptionErrorBody copy(final String s, final String s2, final int n, @n(name = "interstitial_warning_message_html") final String s3, @n(name = "quarantine_message_html") final String s4) {
        f.f((Object)s, "reason");
        f.f((Object)s2, "message");
        return new HttpExceptionErrorBody(s, s2, n, s3, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpExceptionErrorBody)) {
            return false;
        }
        final HttpExceptionErrorBody httpExceptionErrorBody = (HttpExceptionErrorBody)o;
        return f.a((Object)this.reason, (Object)httpExceptionErrorBody.reason) && f.a((Object)this.message, (Object)httpExceptionErrorBody.message) && this.error == httpExceptionErrorBody.error && f.a((Object)this.interstitialWarningMessage, (Object)httpExceptionErrorBody.interstitialWarningMessage) && f.a((Object)this.quarantineMessage, (Object)httpExceptionErrorBody.quarantineMessage);
    }
    
    public final int getError() {
        return this.error;
    }
    
    public final String getInterstitialWarningMessage() {
        return this.interstitialWarningMessage;
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    public final String getQuarantineMessage() {
        return this.quarantineMessage;
    }
    
    public final String getReason() {
        return this.reason;
    }
    
    @Override
    public int hashCode() {
        final int e = s0.e(this.error, a.f(this.message, this.reason.hashCode() * 31, 31), 31);
        final String interstitialWarningMessage = this.interstitialWarningMessage;
        int hashCode = 0;
        int hashCode2;
        if (interstitialWarningMessage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = interstitialWarningMessage.hashCode();
        }
        final String quarantineMessage = this.quarantineMessage;
        if (quarantineMessage != null) {
            hashCode = quarantineMessage.hashCode();
        }
        return (e + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("HttpExceptionErrorBody(reason=");
        k.append(this.reason);
        k.append(", message=");
        k.append(this.message);
        k.append(", error=");
        k.append(this.error);
        k.append(", interstitialWarningMessage=");
        k.append(this.interstitialWarningMessage);
        k.append(", quarantineMessage=");
        return b.k(k, this.quarantineMessage, ')');
    }
}
