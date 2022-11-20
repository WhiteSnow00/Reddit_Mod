// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ng2.e;

public final class t0<T>
{
    public final d a;
    
    public t0(final d a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final d a = this.a;
        final boolean b = o instanceof t0;
        boolean b2 = false;
        if (b) {
            if (e.a((Object)a, (Object)((t0)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final d a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SkippableUpdater(composer=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
