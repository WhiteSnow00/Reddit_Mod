// 
// Decompiled by Procyon v0.6.0
// 

package j2;

import android.os.Build$VERSION;
import android.text.StaticLayout$Builder;
import sg2.e;
import android.text.StaticLayout;

public final class c implements f
{
    public StaticLayout a(final g g) {
        e.f((Object)g, "params");
        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(g.a, g.b, g.c, g.d, g.e);
        obtain.setTextDirection(g.f);
        obtain.setAlignment(g.g);
        obtain.setMaxLines(g.h);
        obtain.setEllipsize(g.i);
        obtain.setEllipsizedWidth(g.j);
        obtain.setLineSpacing(g.l, g.k);
        obtain.setIncludePad(g.n);
        obtain.setBreakStrategy(g.p);
        obtain.setHyphenationFrequency(g.q);
        obtain.setIndents(g.r, g.s);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            d.a.a(obtain, g.m);
        }
        if (sdk_INT >= 28) {
            j2.e.a.a(obtain, g.o);
        }
        final StaticLayout build = obtain.build();
        e.e((Object)build, "obtain(params.text, para\u2026  }\n            }.build()");
        return build;
    }
}
