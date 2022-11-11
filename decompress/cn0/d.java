// 
// Decompiled by Procyon v0.6.0
// 

package cn0;

import wu.a;
import sg2.e;
import w81.c;

public final class d
{
    public c a;
    
    public d() {
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        d.getClass();
        return e.a((Object)this.a, (Object)d.a) && e.a((Object)null, (Object)null) && e.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PostActionBarState(voteDirection=");
        sb.append((Object)null);
        sb.append(", voteEnabled=");
        sb.append(false);
        sb.append(", discussionType=");
        sb.append((Object)null);
        sb.append(", voteStyled=");
        sb.append(this.a);
        sb.append(", tooltips=");
        sb.append((Object)null);
        sb.append(", showAwardAction=");
        sb.append(false);
        sb.append(", showStatsButton=");
        sb.append(false);
        sb.append(", showStatsBar=");
        sb.append(false);
        sb.append(", showModButton=");
        sb.append(false);
        sb.append(", animatedContent=");
        return wu.a.b(sb, (Object)null, ')');
    }
}
