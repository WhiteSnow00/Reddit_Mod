// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import ng2.e;
import com.reddit.domain.model.media.FbpMediaType;
import com.reddit.domain.model.media.VideoContext;

public final class m
{
    public final String a;
    public final VideoContext b;
    public final FbpMediaType c;
    
    public m(final String a, final VideoContext b, final FbpMediaType c) {
        e.f((Object)c, "fbpMediaType");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        return e.a((Object)this.a, (Object)m.a) && e.a((Object)this.b, (Object)m.b) && this.c == m.c;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final VideoContext b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return this.c.hashCode() + (hashCode2 * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("RecommendedMediaRequestKey(after=");
        t.append(this.a);
        t.append(", videoContext=");
        t.append(this.b);
        t.append(", fbpMediaType=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
