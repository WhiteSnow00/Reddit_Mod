// 
// Decompiled by Procyon v0.6.0
// 

package ii2;

import oi2.x;
import oi2.t;
import fh2.b;
import ch2.c;

public final class e implements f, h
{
    public final c a;
    public final c b;
    
    public e(final b b) {
        ng2.e.f((Object)b, "classDescriptor");
        this.a = (c)b;
        this.b = (c)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final c a = this.a;
        final boolean b = o instanceof e;
        Object a2 = null;
        e e;
        if (b) {
            e = (e)o;
        }
        else {
            e = null;
        }
        if (e != null) {
            a2 = e.a;
        }
        return ng2.e.a((Object)a, a2);
    }
    
    public final t getType() {
        final x r = this.a.r();
        ng2.e.e((Object)r, "classDescriptor.defaultType");
        return (t)r;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final c l() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Class{");
        final x r = this.a.r();
        ng2.e.e((Object)r, "classDescriptor.defaultType");
        t.append(r);
        t.append('}');
        return t.toString();
    }
}
