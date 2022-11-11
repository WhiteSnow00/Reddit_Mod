// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/streaming/StatusResponse;", "", "status", "", "statusMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getStatusMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StatusResponse
{
    private final String status;
    private final String statusMessage;
    
    public StatusResponse(final String status, final String statusMessage) {
        f.f((Object)status, "status");
        this.status = status;
        this.statusMessage = statusMessage;
    }
    
    public final String component1() {
        return this.status;
    }
    
    public final String component2() {
        return this.statusMessage;
    }
    
    public final StatusResponse copy(final String s, final String s2) {
        f.f((Object)s, "status");
        return new StatusResponse(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatusResponse)) {
            return false;
        }
        final StatusResponse statusResponse = (StatusResponse)o;
        return f.a((Object)this.status, (Object)statusResponse.status) && f.a((Object)this.statusMessage, (Object)statusResponse.statusMessage);
    }
    
    public final String getStatus() {
        return this.status;
    }
    
    public final String getStatusMessage() {
        return this.statusMessage;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.status.hashCode();
        final String statusMessage = this.statusMessage;
        int hashCode2;
        if (statusMessage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = statusMessage.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StatusResponse(status=");
        k.append(this.status);
        k.append(", statusMessage=");
        return b.k(k, this.statusMessage, ')');
    }
}
