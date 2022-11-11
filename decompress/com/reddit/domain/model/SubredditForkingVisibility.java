// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.g7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/SubredditForkingVisibility;", "", "linkId", "", "bottomSheetShown", "", "hookModuleDismissed", "subredditForked", "(Ljava/lang/String;ZZZ)V", "getBottomSheetShown", "()Z", "getHookModuleDismissed", "getLinkId", "()Ljava/lang/String;", "getSubredditForked", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditForkingVisibility
{
    private final boolean bottomSheetShown;
    private final boolean hookModuleDismissed;
    private final String linkId;
    private final boolean subredditForked;
    
    public SubredditForkingVisibility(final String linkId, final boolean bottomSheetShown, final boolean hookModuleDismissed, final boolean subredditForked) {
        e.f((Object)linkId, "linkId");
        this.linkId = linkId;
        this.bottomSheetShown = bottomSheetShown;
        this.hookModuleDismissed = hookModuleDismissed;
        this.subredditForked = subredditForked;
    }
    
    public final String component1() {
        return this.linkId;
    }
    
    public final boolean component2() {
        return this.bottomSheetShown;
    }
    
    public final boolean component3() {
        return this.hookModuleDismissed;
    }
    
    public final boolean component4() {
        return this.subredditForked;
    }
    
    public final SubredditForkingVisibility copy(final String s, final boolean b, final boolean b2, final boolean b3) {
        e.f((Object)s, "linkId");
        return new SubredditForkingVisibility(s, b, b2, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditForkingVisibility)) {
            return false;
        }
        final SubredditForkingVisibility subredditForkingVisibility = (SubredditForkingVisibility)o;
        return e.a((Object)this.linkId, (Object)subredditForkingVisibility.linkId) && this.bottomSheetShown == subredditForkingVisibility.bottomSheetShown && this.hookModuleDismissed == subredditForkingVisibility.hookModuleDismissed && this.subredditForked == subredditForkingVisibility.subredditForked;
    }
    
    public final boolean getBottomSheetShown() {
        return this.bottomSheetShown;
    }
    
    public final boolean getHookModuleDismissed() {
        return this.hookModuleDismissed;
    }
    
    public final String getLinkId() {
        return this.linkId;
    }
    
    public final boolean getSubredditForked() {
        return this.subredditForked;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.linkId.hashCode();
        final int bottomSheetShown = this.bottomSheetShown ? 1 : 0;
        int n = 1;
        int n2 = bottomSheetShown;
        if (bottomSheetShown != 0) {
            n2 = 1;
        }
        int hookModuleDismissed;
        if ((hookModuleDismissed = (this.hookModuleDismissed ? 1 : 0)) != 0) {
            hookModuleDismissed = 1;
        }
        final int subredditForked = this.subredditForked ? 1 : 0;
        if (subredditForked == 0) {
            n = subredditForked;
        }
        return ((hashCode * 31 + n2) * 31 + hookModuleDismissed) * 31 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditForkingVisibility(linkId=");
        r.append(this.linkId);
        r.append(", bottomSheetShown=");
        r.append(this.bottomSheetShown);
        r.append(", hookModuleDismissed=");
        r.append(this.hookModuleDismissed);
        r.append(", subredditForked=");
        return g7.m(r, this.subredditForked, ')');
    }
}
