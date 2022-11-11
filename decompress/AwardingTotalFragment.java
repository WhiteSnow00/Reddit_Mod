// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import androidx.viewpager.widget.c;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/data/model/AwardingTotalFragment;", "", "award", "Lcom/reddit/data/model/AwardFragment;", "total", "", "(Lcom/reddit/data/model/AwardFragment;J)V", "getAward", "()Lcom/reddit/data/model/AwardFragment;", "getTotal", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AwardingTotalFragment
{
    private final AwardFragment award;
    private final long total;
    
    public AwardingTotalFragment(final AwardFragment award, final long total) {
        f.f((Object)award, "award");
        this.award = award;
        this.total = total;
    }
    
    public final AwardFragment component1() {
        return this.award;
    }
    
    public final long component2() {
        return this.total;
    }
    
    public final AwardingTotalFragment copy(final AwardFragment awardFragment, final long n) {
        f.f((Object)awardFragment, "award");
        return new AwardingTotalFragment(awardFragment, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwardingTotalFragment)) {
            return false;
        }
        final AwardingTotalFragment awardingTotalFragment = (AwardingTotalFragment)o;
        return f.a((Object)this.award, (Object)awardingTotalFragment.award) && this.total == awardingTotalFragment.total;
    }
    
    public final AwardFragment getAward() {
        return this.award;
    }
    
    public final long getTotal() {
        return this.total;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.total) + this.award.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AwardingTotalFragment(award=");
        k.append(this.award);
        k.append(", total=");
        return c.k(k, this.total, ')');
    }
}
