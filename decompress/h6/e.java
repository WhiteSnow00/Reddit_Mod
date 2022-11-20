// 
// Decompiled by Procyon v0.6.0
// 

package h6;

import android.os.Build$VERSION;
import androidx.work.NetworkType;
import k6.q;
import i6.d;
import i6.g;
import m6.a;
import android.content.Context;
import b6.j;
import g6.b;

public final class e extends c<b>
{
    public static final String e;
    
    static {
        e = j.e("NetworkMeteredCtrlr");
    }
    
    public e(final Context context, final a a) {
        super((d)g.a(context, a).c);
    }
    
    public final boolean b(final q q) {
        return q.j.a == NetworkType.METERED;
    }
    
    public final boolean c(final Object o) {
        final b b = (b)o;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = true;
        boolean b3;
        if (sdk_INT < 26) {
            j.c().a(h6.e.e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            b3 = (b.a ^ true);
        }
        else {
            b3 = b2;
            if (b.a) {
                b3 = (!b.c && b2);
            }
        }
        return b3;
    }
}
