// 
// Decompiled by Procyon v0.6.0
// 

package p40;

import sg2.e;
import com.reddit.queries.ProfileDetailsByNamesQuery;
import sg2.h;
import h7.k;
import android.support.v4.media.b;

public final class a extends b
{
    public static final a f;
    
    static {
        f = new a();
    }
    
    public final <D extends k.a, T, V extends k.b, O extends k<D, T, V>> x60.a K(final O o) {
        final x60.a a = x60.b.a;
        if (e.a((Object)h.a((Class)o.getClass()), (Object)h.a((Class)ProfileDetailsByNamesQuery.class))) {
            final x60.a a2 = x60.b.a;
            final int a3 = a2.a;
            String s = null;
            switch (a3) {
                default: {
                    s = a2.b;
                    break;
                }
                case 0: {
                    s = a2.b;
                    break;
                }
            }
            String s2 = null;
            switch (a3) {
                default: {
                    s2 = a2.c;
                    break;
                }
                case 0: {
                    s2 = a2.c;
                    break;
                }
            }
            String s3 = null;
            switch (a3) {
                default: {
                    s3 = a2.d;
                    break;
                }
                case 0: {
                    s3 = a2.d;
                    break;
                }
            }
            return new x60.a(s, s2, s3, 1);
        }
        throw new IllegalArgumentException();
    }
}
