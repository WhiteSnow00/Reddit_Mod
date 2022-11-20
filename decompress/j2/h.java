// 
// Decompiled by Procyon v0.6.0
// 

package j2;

import android.os.Build$VERSION;
import android.text.StaticLayout$Builder;
import ng2.e;
import android.text.StaticLayout;

public final class h implements l
{
    public StaticLayout a(final m m) {
        e.f((Object)m, "params");
        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(m.a, m.b, m.c, m.d, m.e);
        obtain.setTextDirection(m.f);
        obtain.setAlignment(m.g);
        obtain.setMaxLines(m.h);
        obtain.setEllipsize(m.i);
        obtain.setEllipsizedWidth(m.j);
        obtain.setLineSpacing(m.l, m.k);
        obtain.setIncludePad(m.n);
        obtain.setBreakStrategy(m.p);
        obtain.setHyphenationFrequency(m.s);
        obtain.setIndents(m.t, m.u);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            i.a(obtain, m.m);
        }
        if (sdk_INT >= 28) {
            j.a(obtain, m.o);
        }
        if (sdk_INT >= 33) {
            k.b(obtain, m.q, m.r);
        }
        final StaticLayout build = obtain.build();
        e.e((Object)build, "obtain(params.text, para\u2026  }\n            }.build()");
        return build;
    }
}
