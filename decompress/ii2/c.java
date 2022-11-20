// 
// Decompiled by Procyon v0.6.0
// 

package ii2;

import ng2.e;
import oi2.t;

public final class c extends a
{
    public final kotlin.reflect.jvm.internal.impl.descriptors.a c;
    
    public c(final kotlin.reflect.jvm.internal.impl.descriptors.a c, final t t, final f f) {
        e.f((Object)t, "receiverType");
        super(t, f);
        this.c = c;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("Cxt { ");
        t.append(this.c);
        t.append(" }");
        return t.toString();
    }
}
