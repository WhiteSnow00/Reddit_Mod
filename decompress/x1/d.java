// 
// Decompiled by Procyon v0.6.0
// 

package x1;

import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import sg2.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.focus.FocusModifier;
import rg2.l;
import c2.z;
import d2.c;
import d2.b;

public final class d implements d2.b, c<d>, z
{
    public final l<x1.b, Boolean> f;
    public final l<x1.b, Boolean> g;
    public FocusModifier h;
    public d i;
    public LayoutNode j;
    
    public d(final l<? super x1.b, Boolean> f, final l<? super x1.b, Boolean> g) {
        this.f = (l<x1.b, Boolean>)f;
        this.g = (l<x1.b, Boolean>)g;
    }
    
    public final void F0(final d2.d d) {
        e.f((Object)d, "scope");
        final FocusModifier h = this.h;
        if (h != null) {
            final a1.e t = h.t;
            if (t != null) {
                t.l((Object)this);
            }
        }
        final FocusModifier h2 = (FocusModifier)d.a(FocusModifierKt.a);
        if ((this.h = h2) != null) {
            final a1.e t2 = h2.t;
            if (t2 != null) {
                t2.b((Object)this);
            }
        }
        this.i = (d)d.a(KeyInputModifierKt.a);
    }
    
    public final void S(final c2.l l) {
        e.f((Object)l, "coordinates");
        this.j = ((LayoutNodeWrapper)l).j;
    }
    
    public final boolean a(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "keyEvent");
        final l<x1.b, Boolean> f = this.f;
        Boolean b;
        if (f != null) {
            b = f.invoke(new x1.b(keyEvent));
        }
        else {
            b = null;
        }
        if (e.a((Object)b, (Object)Boolean.TRUE)) {
            return b;
        }
        final d i = this.i;
        return i != null && i.a(keyEvent);
    }
    
    public final boolean b(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "keyEvent");
        final d i = this.i;
        Boolean value;
        if (i != null) {
            value = i.b(keyEvent);
        }
        else {
            value = null;
        }
        if (e.a((Object)value, (Object)Boolean.TRUE)) {
            return value;
        }
        final l<x1.b, Boolean> g = this.g;
        return g != null && g.invoke(new x1.b(keyEvent));
    }
    
    public final d2.e<d> getKey() {
        return KeyInputModifierKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
}
