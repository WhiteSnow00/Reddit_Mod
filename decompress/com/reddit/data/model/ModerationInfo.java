// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f" }, d2 = { "Lcom/reddit/data/model/ModerationInfo;", "", "reportCount", "", "verdict", "", "isReportingIgnored", "", "verdictBy", "Lcom/reddit/data/model/Redditor;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Lcom/reddit/data/model/Redditor;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReportCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVerdict", "()Ljava/lang/String;", "getVerdictBy", "()Lcom/reddit/data/model/Redditor;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Lcom/reddit/data/model/Redditor;)Lcom/reddit/data/model/ModerationInfo;", "equals", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ModerationInfo
{
    private final Boolean isReportingIgnored;
    private final Long reportCount;
    private final String verdict;
    private final Redditor verdictBy;
    
    public ModerationInfo(final Long reportCount, final String verdict, final Boolean isReportingIgnored, final Redditor verdictBy) {
        this.reportCount = reportCount;
        this.verdict = verdict;
        this.isReportingIgnored = isReportingIgnored;
        this.verdictBy = verdictBy;
    }
    
    public final Long component1() {
        return this.reportCount;
    }
    
    public final String component2() {
        return this.verdict;
    }
    
    public final Boolean component3() {
        return this.isReportingIgnored;
    }
    
    public final Redditor component4() {
        return this.verdictBy;
    }
    
    public final ModerationInfo copy(final Long n, final String s, final Boolean b, final Redditor redditor) {
        return new ModerationInfo(n, s, b, redditor);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModerationInfo)) {
            return false;
        }
        final ModerationInfo moderationInfo = (ModerationInfo)o;
        return f.a((Object)this.reportCount, (Object)moderationInfo.reportCount) && f.a((Object)this.verdict, (Object)moderationInfo.verdict) && f.a((Object)this.isReportingIgnored, (Object)moderationInfo.isReportingIgnored) && f.a((Object)this.verdictBy, (Object)moderationInfo.verdictBy);
    }
    
    public final Long getReportCount() {
        return this.reportCount;
    }
    
    public final String getVerdict() {
        return this.verdict;
    }
    
    public final Redditor getVerdictBy() {
        return this.verdictBy;
    }
    
    @Override
    public int hashCode() {
        final Long reportCount = this.reportCount;
        int hashCode = 0;
        int hashCode2;
        if (reportCount == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = reportCount.hashCode();
        }
        final String verdict = this.verdict;
        int hashCode3;
        if (verdict == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = verdict.hashCode();
        }
        final Boolean isReportingIgnored = this.isReportingIgnored;
        int hashCode4;
        if (isReportingIgnored == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isReportingIgnored.hashCode();
        }
        final Redditor verdictBy = this.verdictBy;
        if (verdictBy != null) {
            hashCode = verdictBy.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    public final Boolean isReportingIgnored() {
        return this.isReportingIgnored;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ModerationInfo(reportCount=");
        k.append(this.reportCount);
        k.append(", verdict=");
        k.append(this.verdict);
        k.append(", isReportingIgnored=");
        k.append(this.isReportingIgnored);
        k.append(", verdictBy=");
        k.append(this.verdictBy);
        k.append(')');
        return k.toString();
    }
}
