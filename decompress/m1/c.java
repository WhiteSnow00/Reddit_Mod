// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusEventModifierKt;
import d2.d;
import androidx.compose.ui.focus.FocusModifier;
import a1.e;
import hg2.j;
import rg2.l;
import d2.b;

public final class c implements d2.c<c>, b
{
    public final l<p, j> f;
    public c g;
    public final e<c> h;
    public final e<FocusModifier> i;
    
    public c(final l<? super p, j> f) {
        sg2.e.f((Object)f, "onFocusEvent");
        this.f = (l<p, j>)f;
        this.h = (e<c>)new e((Object[])new c[16]);
        this.i = (e<FocusModifier>)new e((Object[])new FocusModifier[16]);
    }
    
    public final void F0(final d d) {
        sg2.e.f((Object)d, "scope");
        final d2.e a = FocusEventModifierKt.a;
        final c g = (c)d.a(a);
        if (!sg2.e.a((Object)g, (Object)this.g)) {
            final c g2 = this.g;
            if (g2 != null) {
                g2.h.l((Object)this);
                g2.g(this.i);
            }
            if ((this.g = g) != null) {
                g.h.b((Object)this);
                g.b(this.i);
            }
        }
        this.g = (c)d.a(a);
    }
    
    public final void a(final FocusModifier focusModifier) {
        sg2.e.f((Object)focusModifier, "focusModifier");
        this.i.b((Object)focusModifier);
        final c g = this.g;
        if (g != null) {
            g.a(focusModifier);
        }
    }
    
    public final void b(final e<FocusModifier> e) {
        final e<FocusModifier> i = this.i;
        i.c(i.h, (e)e);
        final c g = this.g;
        if (g != null) {
            g.b(e);
        }
    }
    
    public final void d() {
        final e<FocusModifier> i = this.i;
        final int h = i.h;
        FocusStateImpl focusStateImpl;
        if (h != 0) {
            int n = 0;
            if (h != 1) {
                FocusModifier focusModifier = null;
                Boolean b = null;
                Boolean b3;
                if (h > 0) {
                    final Object[] f = i.f;
                    FocusModifier focusModifier2 = null;
                    int j;
                    FocusModifier focusModifier3;
                    Boolean b2 = null;
                    do {
                        focusModifier3 = (FocusModifier)f[n];
                        switch (a.a[((Enum)focusModifier3.i).ordinal()]) {
                            default: {
                                b2 = b;
                                focusModifier3 = focusModifier2;
                                break;
                            }
                            case 6: {
                                b2 = Boolean.FALSE;
                                focusModifier3 = focusModifier2;
                                break;
                            }
                            case 5: {
                                b2 = b;
                                focusModifier3 = focusModifier2;
                                if (b == null) {
                                    b2 = Boolean.TRUE;
                                    focusModifier3 = focusModifier2;
                                    break;
                                }
                                break;
                            }
                            case 1:
                            case 2:
                            case 3:
                            case 4: {
                                b2 = Boolean.FALSE;
                                break;
                            }
                        }
                        j = ++n;
                        b = b2;
                        focusModifier2 = focusModifier3;
                    } while (j < h);
                    final FocusModifier focusModifier4 = focusModifier3;
                    b3 = b2;
                    focusModifier = focusModifier4;
                }
                else {
                    b3 = null;
                }
                if (focusModifier == null || (focusStateImpl = focusModifier.i) == null) {
                    if (sg2.e.a((Object)b3, (Object)Boolean.TRUE)) {
                        focusStateImpl = FocusStateImpl.Deactivated;
                    }
                    else {
                        focusStateImpl = FocusStateImpl.Inactive;
                    }
                }
            }
            else {
                focusStateImpl = ((FocusModifier)i.f[0]).i;
            }
        }
        else {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        this.f.invoke((p)focusStateImpl);
        final c g = this.g;
        if (g != null) {
            g.d();
        }
    }
    
    public final void f(final FocusModifier focusModifier) {
        sg2.e.f((Object)focusModifier, "focusModifier");
        this.i.l((Object)focusModifier);
        final c g = this.g;
        if (g != null) {
            g.f(focusModifier);
        }
    }
    
    public final void g(final e<FocusModifier> e) {
        this.i.m((e)e);
        final c g = this.g;
        if (g != null) {
            g.g(e);
        }
    }
    
    public final d2.e<c> getKey() {
        return FocusEventModifierKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
}
