// 
// Decompiled by Procyon v0.6.0
// 

package i6;

import android.os.Build$VERSION;
import androidx.work.NetworkType;
import l6.q;
import j6.g;
import j6.e;
import n6.a;
import android.content.Context;
import h6.b;

public final class d extends c<b>
{
    public d(final Context context, final a a) {
        super((j6.d)g.c(context, a).c);
    }
    
    public final boolean b(final q q) {
        return q.j.a == NetworkType.CONNECTED;
    }
    
    public final boolean c(final Object o) {
        final b b = (b)o;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = true;
        boolean b3;
        if (sdk_INT >= 26) {
            b3 = b2;
            if (b.a) {
                b3 = (!b.b && b2);
            }
        }
        else {
            b3 = (true ^ b.a);
        }
        return b3;
    }
}
