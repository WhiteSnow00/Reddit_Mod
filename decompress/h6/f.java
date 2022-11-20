// 
// Decompiled by Procyon v0.6.0
// 

package h6;

import androidx.work.NetworkType;
import k6.q;
import i6.d;
import i6.g;
import i6.e;
import m6.a;
import android.content.Context;
import b6.j;
import g6.b;

public final class f extends c<b>
{
    static {
        j.e("NetworkNotRoamingCtrlr");
    }
    
    public f(final Context context, final a a) {
        super((d)g.a(context, a).c);
    }
    
    public final boolean b(final q q) {
        return q.j.a == NetworkType.NOT_ROAMING;
    }
    
    public final boolean c(final Object o) {
        final b b = (b)o;
        return !b.a || !b.d;
    }
}
