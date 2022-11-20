// 
// Decompiled by Procyon v0.6.0
// 

package da;

import q3.f;
import com.google.accompanist.insets.MutableWindowInsetsType;
import vl.a;
import ng2.e;
import a4.r1;
import android.view.View;
import a4.b0;

public final class i implements b0
{
    public final h f;
    public final boolean g;
    
    public i(final h f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    public final r1 a(final View view, r1 b) {
        final h f = this.f;
        final boolean g = this.g;
        e.f((Object)f, "$windowInsets");
        e.f((Object)view, "<anonymous parameter 0>");
        final MutableWindowInsetsType d = f.d;
        final g d2 = d.d;
        final f a = b.a(1);
        e.e((Object)a, "wic.getInsets(WindowInse\u2026Compat.Type.statusBars())");
        vl.a.w3(d2, a);
        d.k(b.h(1));
        final MutableWindowInsetsType c = f.c;
        final g d3 = c.d;
        final f a2 = b.a(2);
        e.e((Object)a2, "wic.getInsets(WindowInse\u2026at.Type.navigationBars())");
        vl.a.w3(d3, a2);
        c.k(b.h(2));
        final MutableWindowInsetsType b2 = f.b;
        final g d4 = b2.d;
        final f a3 = b.a(16);
        e.e((Object)a3, "wic.getInsets(WindowInse\u2026at.Type.systemGestures())");
        vl.a.w3(d4, a3);
        b2.k(b.h(16));
        final MutableWindowInsetsType e = f.e;
        final g d5 = e.d;
        final f a4 = b.a(8);
        ng2.e.e((Object)a4, "wic.getInsets(WindowInsetsCompat.Type.ime())");
        vl.a.w3(d5, a4);
        e.k(b.h(8));
        final MutableWindowInsetsType f2 = f.f;
        final g d6 = f2.d;
        final f a5 = b.a(128);
        ng2.e.e((Object)a5, "wic.getInsets(WindowInse\u2026pat.Type.displayCutout())");
        vl.a.w3(d6, a5);
        f2.k(b.h(128));
        if (g) {
            b = r1.b;
        }
        return b;
    }
}
