// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/UpdateSubredditTitleSafetyDto;", "", "subredditId", "", "isTitleSafe", "", "(Ljava/lang/String;Z)V", "()Z", "getSubredditId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UpdateSubredditTitleSafetyDto
{
    private final boolean isTitleSafe;
    private final String subredditId;
    
    public UpdateSubredditTitleSafetyDto(final String subredditId, final boolean isTitleSafe) {
        f.f((Object)subredditId, "subredditId");
        this.subredditId = subredditId;
        this.isTitleSafe = isTitleSafe;
    }
    
    public final String component1() {
        return this.subredditId;
    }
    
    public final boolean component2() {
        return this.isTitleSafe;
    }
    
    public final UpdateSubredditTitleSafetyDto copy(final String s, final boolean b) {
        f.f((Object)s, "subredditId");
        return new UpdateSubredditTitleSafetyDto(s, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubredditTitleSafetyDto)) {
            return false;
        }
        final UpdateSubredditTitleSafetyDto updateSubredditTitleSafetyDto = (UpdateSubredditTitleSafetyDto)o;
        return f.a((Object)this.subredditId, (Object)updateSubredditTitleSafetyDto.subredditId) && this.isTitleSafe == updateSubredditTitleSafetyDto.isTitleSafe;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subredditId.hashCode();
        int isTitleSafe;
        if ((isTitleSafe = (this.isTitleSafe ? 1 : 0)) != 0) {
            isTitleSafe = 1;
        }
        return hashCode * 31 + isTitleSafe;
    }
    
    public final boolean isTitleSafe() {
        return this.isTitleSafe;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UpdateSubredditTitleSafetyDto(subredditId=");
        k.append(this.subredditId);
        k.append(", isTitleSafe=");
        return s0.o(k, this.isTitleSafe, ')');
    }
}
