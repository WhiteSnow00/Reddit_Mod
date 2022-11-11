// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.ui.focus.FocusRequesterModifierKt;
import d2.d;
import androidx.compose.ui.focus.FocusModifier;
import a1.e;
import d2.c;
import d2.b;

public final class o implements b, c<o>
{
    public o f;
    public final e<FocusModifier> g;
    
    public o(final m m) {
        sg2.e.f((Object)m, "focusRequester");
        this.g = (e<FocusModifier>)new e((Object[])new FocusModifier[16]);
        m.a.b((Object)this);
    }
    
    public final void F0(final d d) {
        sg2.e.f((Object)d, "scope");
        final o f = (o)d.a(FocusRequesterModifierKt.a);
        if (!sg2.e.a((Object)f, (Object)this.f)) {
            final o f2 = this.f;
            if (f2 != null) {
                f2.f(this.g);
            }
            if (f != null) {
                f.b(this.g);
            }
            this.f = f;
        }
    }
    
    public final void a(final FocusModifier focusModifier) {
        sg2.e.f((Object)focusModifier, "focusModifier");
        this.g.b((Object)focusModifier);
        final o f = this.f;
        if (f != null) {
            f.a(focusModifier);
        }
    }
    
    public final void b(final e<FocusModifier> e) {
        sg2.e.f((Object)e, "newModifiers");
        final e<FocusModifier> g = this.g;
        g.c(g.h, (e)e);
        final o f = this.f;
        if (f != null) {
            f.b(e);
        }
    }
    
    public final void d(final FocusModifier focusModifier) {
        sg2.e.f((Object)focusModifier, "focusModifier");
        this.g.l((Object)focusModifier);
        final o f = this.f;
        if (f != null) {
            f.d(focusModifier);
        }
    }
    
    public final void f(final e<FocusModifier> e) {
        sg2.e.f((Object)e, "removedModifiers");
        this.g.m((e)e);
        final o f = this.f;
        if (f != null) {
            f.f(e);
        }
    }
    
    public final d2.e<o> getKey() {
        return FocusRequesterModifierKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
}
