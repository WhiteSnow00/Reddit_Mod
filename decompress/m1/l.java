// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.focus.FocusPropertiesKt;
import bg.d;
import androidx.compose.ui.platform.n0;
import d2.e;
import z0.l0;
import d2.c;
import d2.b;
import androidx.compose.ui.platform.o0;

public final class l extends o0 implements b, c<l>
{
    public final rg2.l<j, hg2.j> g;
    public final l0 h;
    public final e<l> i;
    
    public l(final rg2.l<? super j, hg2.j> g, final rg2.l<? super n0, hg2.j> l) {
        sg2.e.f((Object)g, "focusPropertiesScope");
        sg2.e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (rg2.l<j, hg2.j>)g;
        this.h = d.t0((Object)null);
        this.i = FocusPropertiesKt.a;
    }
    
    public final void F0(final d2.d d) {
        sg2.e.f((Object)d, "scope");
        ((SnapshotMutableStateImpl)this.h).setValue((Object)d.a(FocusPropertiesKt.a));
    }
    
    public final void b(final k k) {
        sg2.e.f((Object)k, "focusProperties");
        this.g.invoke((j)k);
        final l l = (l)((SnapshotMutableStateImpl)this.h).getValue();
        if (l != null) {
            l.b(k);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof l && sg2.e.a((Object)this.g, (Object)((l)o).g);
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
