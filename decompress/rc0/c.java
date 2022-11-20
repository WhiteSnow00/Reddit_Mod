// 
// Decompiled by Procyon v0.6.0
// 

package rc0;

import p1.h;
import ng2.e;
import java.util.List;

public final class c
{
    public final List<String> a;
    public final List<String> b;
    
    public c(final List<String> a, final List<String> b) {
        e.f((Object)a, "selectedTopicIds");
        e.f((Object)b, "rawSelectedTopicIds");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return e.a((Object)this.a, (Object)c.a) && e.a((Object)this.b, (Object)c.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TopicSelectionResult(selectedTopicIds=");
        t.append(this.a);
        t.append(", rawSelectedTopicIds=");
        return h.d(t, (List)this.b, ')');
    }
}
