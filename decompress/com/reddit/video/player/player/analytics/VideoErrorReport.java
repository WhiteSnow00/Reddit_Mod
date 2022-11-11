// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player.analytics;

import al0.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a" }, d2 = { "Lcom/reddit/video/player/player/analytics/VideoErrorReport;", "", "errorCode", "", "errorMessage", "", "mimeType", "networkType", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getMimeType", "getNetworkType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Code", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class VideoErrorReport
{
    private final int errorCode;
    private final String errorMessage;
    private final String mimeType;
    private final String networkType;
    
    public VideoErrorReport(final int errorCode, final String errorMessage, final String mimeType, final String networkType) {
        e.f((Object)errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.mimeType = mimeType;
        this.networkType = networkType;
    }
    
    public final int component1() {
        return this.errorCode;
    }
    
    public final String component2() {
        return this.errorMessage;
    }
    
    public final String component3() {
        return this.mimeType;
    }
    
    public final String component4() {
        return this.networkType;
    }
    
    public final VideoErrorReport copy(final int n, final String s, final String s2, final String s3) {
        e.f((Object)s, "errorMessage");
        return new VideoErrorReport(n, s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoErrorReport)) {
            return false;
        }
        final VideoErrorReport videoErrorReport = (VideoErrorReport)o;
        return this.errorCode == videoErrorReport.errorCode && e.a((Object)this.errorMessage, (Object)videoErrorReport.errorMessage) && e.a((Object)this.mimeType, (Object)videoErrorReport.mimeType) && e.a((Object)this.networkType, (Object)videoErrorReport.networkType);
    }
    
    public final int getErrorCode() {
        return this.errorCode;
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    public final String getMimeType() {
        return this.mimeType;
    }
    
    public final String getNetworkType() {
        return this.networkType;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.errorMessage, Integer.hashCode(this.errorCode) * 31, 31);
        final String mimeType = this.mimeType;
        int hashCode = 0;
        int hashCode2;
        if (mimeType == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = mimeType.hashCode();
        }
        final String networkType = this.networkType;
        if (networkType != null) {
            hashCode = networkType.hashCode();
        }
        return (c + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("VideoErrorReport(errorCode=");
        r.append(this.errorCode);
        r.append(", errorMessage=");
        r.append(this.errorMessage);
        r.append(", mimeType=");
        r.append(this.mimeType);
        r.append(", networkType=");
        return f0.n(r, this.networkType, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/player/analytics/VideoErrorReport$Code;", "", "numericValue", "", "(Ljava/lang/String;II)V", "getNumericValue", "()I", "LOAD_ERROR", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Code
    {
        LOAD_ERROR(-1);
        
        private final int numericValue;
        
        private Code(final int numericValue) {
            this.numericValue = numericValue;
        }
        
        public final int getNumericValue() {
            return this.numericValue;
        }
    }
}
