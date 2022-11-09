// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import d2.d;
import androidx.compose.ui.focus.FocusPropertiesKt;
import a80.a;
import ah2.f;
import androidx.compose.ui.platform.p0;
import d2.e;
import z0.l0;
import d2.c;
import d2.b;
import androidx.compose.ui.platform.q0;

public final class l extends q0 implements b, c<l>
{
    public final zg2.l<j, pg2.j> g;
    public final l0 h;
    public final e<l> i;
    
    public l(final zg2.l<? super j, pg2.j> g, final zg2.l<? super p0, pg2.j> l) {
        f.f((Object)g, "focusPropertiesScope");
        f.f((Object)l, "inspectorInfo");
        super((zg2.l)l);
        this.g = (zg2.l<j, pg2.j>)g;
        this.h = a.n0(null);
        this.i = FocusPropertiesKt.a;
    }
    
    public final void C0(final d2.d d) {
        f.f((Object)d, "scope");
        ((SnapshotMutableStateImpl<l>)this.h).setValue((l)d.a(FocusPropertiesKt.a));
    }
    
    public final void b(final k k) {
        f.f((Object)k, "focusProperties");
        this.g.invoke((Object)k);
        final l l = ((SnapshotMutableStateImpl<l>)this.h).getValue();
        if (l != null) {
            l.b(k);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof l && f.a((Object)this.g, (Object)((l)o).g);
    }
    
    public final e<l> getKey() {
        return this.i;
    }
    
    public final Object getValue() {
        return this;
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
}
