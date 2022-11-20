// 
// Decompiled by Procyon v0.6.0
// 

package q40;

import ng2.e;
import com.reddit.queries.ProfileDetailsByNamesQuery;
import y60.b;
import h7.k;
import h7.k$b;
import h7.k$a;
import b6.h;

public final class a extends h
{
    public static final a f;
    
    static {
        f = new a();
    }
    
    public final <D extends k$a, T, V extends k$b, O extends k<D, T, V>> y60.a H(final O o) {
        final y60.a a = b.a;
        if (e.a((Object)ng2.h.a((Class)o.getClass()), (Object)ng2.h.a((Class)ProfileDetailsByNamesQuery.class))) {
            final y60.a a2 = b.a;
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
            return new y60.a(s, s2, s3, 1);
        }
        throw new IllegalArgumentException();
    }
}
