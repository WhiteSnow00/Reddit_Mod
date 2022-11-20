// 
// Decompiled by Procyon v0.6.0
// 

package w92;

import p1.h;
import ng2.e;
import java.util.List;

public final class f
{
    public final List<a> a;
    
    public f(final List<a> a) {
        e.f((Object)a, "educationalItems");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f && e.a((Object)this.a, (Object)((f)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return h.d(a.t("LearnAboutCollectibleAvatarsViewState(educationalItems="), (List)this.a, ')');
    }
}
