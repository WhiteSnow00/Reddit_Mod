// 
// Decompiled by Procyon v0.6.0
// 

package x1;

import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNodeWrapper;
import a1.e;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import ah2.f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.focus.FocusModifier;
import zg2.l;
import c2.z;
import d2.c;
import d2.b;

public final class d implements b, c<d>, z
{
    public final l<b, Boolean> f;
    public final l<b, Boolean> g;
    public FocusModifier h;
    public d i;
    public LayoutNode j;
    
    public d(final l<? super b, Boolean> f, final l<? super b, Boolean> g) {
        this.f = (l<b, Boolean>)f;
        this.g = (l<b, Boolean>)g;
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        final FocusModifier h = this.h;
        if (h != null) {
            final e t = h.t;
            if (t != null) {
                t.l(this);
            }
        }
        final FocusModifier h2 = (FocusModifier)d.a(FocusModifierKt.a);
        if ((this.h = h2) != null) {
            final e t2 = h2.t;
            if (t2 != null) {
                t2.b(this);
            }
        }
        this.i = (d)d.a(KeyInputModifierKt.a);
    }
    
    @Override
    public final void R(final c2.l l) {
        ah2.f.f((Object)l, "coordinates");
        this.j = ((LayoutNodeWrapper)l).j;
    }
    
    public final boolean a(final KeyEvent keyEvent) {
        ah2.f.f((Object)keyEvent, "keyEvent");
        final l<b, Boolean> f = this.f;
        Boolean b;
        if (f != null) {
            b = (Boolean)f.invoke((Object)new b(keyEvent));
        }
        else {
            b = null;
        }
        if (ah2.f.a((Object)b, (Object)Boolean.TRUE)) {
            return b;
        }
        final d i = this.i;
        return i != null && i.a(keyEvent);
    }
    
    public final boolean b(final KeyEvent keyEvent) {
        ah2.f.f((Object)keyEvent, "keyEvent");
        final d i = this.i;
        Boolean value;
        if (i != null) {
            value = i.b(keyEvent);
        }
        else {
            value = null;
        }
        if (ah2.f.a((Object)value, (Object)Boolean.TRUE)) {
            return value;
        }
        final l<b, Boolean> g = this.g;
        return g != null && (boolean)g.invoke((Object)new b(keyEvent));
    }
    
    @Override
    public final d2.e<d> getKey() {
        return KeyInputModifierKt.a;
    }
    
    @Override
    public final Object getValue() {
        return this;
    }
}
