// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import android.os.Build$VERSION;
import u2.l;
import n1.c;
import pg2.j;
import m0.q;
import j1.d;

public final class AndroidOverscrollKt
{
    public static final AndroidOverscrollKt$a a;
    public static final d b;
    
    static {
        a = new q() {
            public boolean a;
            
            public final boolean a() {
                return false;
            }
            
            public final j b(final long n) {
                return j.a;
            }
            
            public final d c() {
                final int n2 = d.N2;
                return (d)d.a.f;
            }
            
            public final long d(final long n, final c c) {
                return c.b;
            }
            
            public final l e(final long n) {
                return new l(l.b);
            }
            
            public final void f(final long n, final long n2, final c c, final int n3) {
            }
            
            public final boolean isEnabled() {
                return this.a;
            }
            
            public final void setEnabled(final boolean a) {
                this.a = a;
            }
        };
        Object b2;
        if (Build$VERSION.SDK_INT >= 31) {
            final int n2 = d.N2;
            b2 = dg.d.y0(dg.d.y0((d)d.a.f, (zg2.q)AndroidOverscrollKt$StretchOverscrollNonClippingLayer.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.INSTANCE), (zg2.q)AndroidOverscrollKt$StretchOverscrollNonClippingLayer.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.INSTANCE);
        }
        else {
            final int n3 = d.N2;
            b2 = d.a.f;
        }
        b = (d)b2;
    }
}
