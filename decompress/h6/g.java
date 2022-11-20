// 
// Decompiled by Procyon v0.6.0
// 

package h6;

import android.os.Build$VERSION;
import androidx.work.NetworkType;
import k6.q;
import i6.d;
import i6.e;
import m6.a;
import android.content.Context;
import g6.b;

public final class g extends c<b>
{
    public g(final Context context, final a a) {
        super((d)i6.g.a(context, a).c);
    }
    
    public final boolean b(final q q) {
        final NetworkType a = q.j.a;
        return a == NetworkType.UNMETERED || (Build$VERSION.SDK_INT >= 30 && a == NetworkType.TEMPORARILY_UNMETERED);
    }
    
    public final boolean c(final Object o) {
        final b b = (b)o;
        return !b.a || b.c;
    }
}
