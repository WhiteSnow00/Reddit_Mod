// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import android.database.Cursor;
import l5.b;
import l5.c;
import j5.o;
import i60.n;
import java.util.concurrent.Callable;

public final class h0 implements Callable<n>
{
    public final /* synthetic */ o f;
    public final /* synthetic */ g0 g;
    
    public h0(final g0 g, final o f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final Cursor b = c.b(this.g.f, this.f, false);
        try {
            final int b2 = l5.b.b(b, "username");
            final int b3 = l5.b.b(b, "subredditName");
            final int b4 = l5.b.b(b, "responseJson");
            final int b5 = l5.b.b(b, "lastUpdateTimestamp");
            final boolean moveToFirst = b.moveToFirst();
            Object o = null;
            String string = null;
            if (moveToFirst) {
                String string2;
                if (b.isNull(b2)) {
                    string2 = null;
                }
                else {
                    string2 = b.getString(b2);
                }
                String string3;
                if (b.isNull(b3)) {
                    string3 = null;
                }
                else {
                    string3 = b.getString(b3);
                }
                if (!b.isNull(b4)) {
                    string = b.getString(b4);
                }
                o = new n(string2, string3, string, b.getLong(b5));
            }
            return o;
        }
        finally {
            b.close();
        }
    }
    
    public final void finalize() {
        this.f.h();
    }
}
