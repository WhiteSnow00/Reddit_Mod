// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/chat/model/DurationOption;", "", "durationTitle", "", "durationSec", "", "(Ljava/lang/String;I)V", "getDurationSec", "()I", "getDurationTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DurationOption
{
    private final int durationSec;
    private final String durationTitle;
    
    public DurationOption(final String durationTitle, final int durationSec) {
        e.f((Object)durationTitle, "durationTitle");
        this.durationTitle = durationTitle;
        this.durationSec = durationSec;
    }
    
    public final String component1() {
        return this.durationTitle;
    }
    
    public final int component2() {
        return this.durationSec;
    }
    
    public final DurationOption copy(final String s, final int n) {
        e.f((Object)s, "durationTitle");
        return new DurationOption(s, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DurationOption)) {
            return false;
        }
        final DurationOption durationOption = (DurationOption)o;
        return e.a((Object)this.durationTitle, (Object)durationOption.durationTitle) && this.durationSec == durationOption.durationSec;
    }
    
    public final int getDurationSec() {
        return this.durationSec;
    }
    
    public final String getDurationTitle() {
        return this.durationTitle;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.durationSec) + this.durationTitle.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("DurationOption(durationTitle=");
        r.append(this.durationTitle);
        r.append(", durationSec=");
        return d.l(r, this.durationSec, ')');
    }
}
