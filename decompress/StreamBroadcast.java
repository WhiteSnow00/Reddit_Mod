// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamBroadcast;", "", "result", "Lcom/reddit/domain/model/streaming/Status;", "status", "", "data", "Lcom/reddit/domain/model/streaming/StreamBroadcastData;", "networkErrorCode", "", "(Lcom/reddit/domain/model/streaming/Status;Ljava/lang/String;Lcom/reddit/domain/model/streaming/StreamBroadcastData;Ljava/lang/Integer;)V", "getData", "()Lcom/reddit/domain/model/streaming/StreamBroadcastData;", "getNetworkErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResult", "()Lcom/reddit/domain/model/streaming/Status;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Lcom/reddit/domain/model/streaming/Status;Ljava/lang/String;Lcom/reddit/domain/model/streaming/StreamBroadcastData;Ljava/lang/Integer;)Lcom/reddit/domain/model/streaming/StreamBroadcast;", "equals", "", "other", "hashCode", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamBroadcast
{
    private final StreamBroadcastData data;
    private final Integer networkErrorCode;
    private final Status result;
    private final String status;
    
    public StreamBroadcast() {
        this(null, null, null, null, 15, null);
    }
    
    public StreamBroadcast(final Status result, final String status, final StreamBroadcastData data, final Integer networkErrorCode) {
        f.f((Object)result, "result");
        f.f((Object)status, "status");
        this.result = result;
        this.status = status;
        this.data = data;
        this.networkErrorCode = networkErrorCode;
    }
    
    public final Status component1() {
        return this.result;
    }
    
    public final String component2() {
        return this.status;
    }
    
    public final StreamBroadcastData component3() {
        return this.data;
    }
    
    public final Integer component4() {
        return this.networkErrorCode;
    }
    
    public final StreamBroadcast copy(final Status status, final String s, final StreamBroadcastData streamBroadcastData, final Integer n) {
        f.f((Object)status, "result");
        f.f((Object)s, "status");
        return new StreamBroadcast(status, s, streamBroadcastData, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamBroadcast)) {
            return false;
        }
        final StreamBroadcast streamBroadcast = (StreamBroadcast)o;
        return this.result == streamBroadcast.result && f.a((Object)this.status, (Object)streamBroadcast.status) && f.a((Object)this.data, (Object)streamBroadcast.data) && f.a((Object)this.networkErrorCode, (Object)streamBroadcast.networkErrorCode);
    }
    
    public final StreamBroadcastData getData() {
        return this.data;
    }
    
    public final Integer getNetworkErrorCode() {
        return this.networkErrorCode;
    }
    
    public final Status getResult() {
        return this.result;
    }
    
    public final String getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.status, this.result.hashCode() * 31, 31);
        final StreamBroadcastData data = this.data;
        int hashCode = 0;
        int hashCode2;
        if (data == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = data.hashCode();
        }
        final Integer networkErrorCode = this.networkErrorCode;
        if (networkErrorCode != null) {
            hashCode = networkErrorCode.hashCode();
        }
        return (f + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamBroadcast(result=");
        k.append(this.result);
        k.append(", status=");
        k.append(this.status);
        k.append(", data=");
        k.append(this.data);
        k.append(", networkErrorCode=");
        return s0.m(k, this.networkErrorCode, ')');
    }
}
