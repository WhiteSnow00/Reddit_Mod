// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import java.util.Iterator;
import n5.e;
import a4.u1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class m1 implements Callable<Integer>
{
    public final /* synthetic */ List f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ v0 h;
    
    public m1(final v0 h, final ArrayList f) {
        this.h = h;
        this.f = f;
        this.g = false;
    }
    
    @Override
    public final Object call() throws Exception {
        final StringBuilder m = b.m("\n", "      UPDATE subreddit", "\n", "      SET userIsSubscriber = ", "?");
        m.append("\n");
        m.append("      WHERE displayName IN(");
        u1.v(this.f.size(), m);
        m.append(")");
        m.append("\n");
        m.append("    ");
        final e f = this.h.f.f(m.toString());
        f.bindLong(1, this.g ? 1 : 0);
        int n = 2;
        for (final String s : this.f) {
            if (s == null) {
                f.bindNull(n);
            }
            else {
                f.bindString(n, s);
            }
            ++n;
        }
        this.h.f.c();
        try {
            final int executeUpdateDelete = f.executeUpdateDelete();
            this.h.f.q();
            this.h.f.m();
            return executeUpdateDelete;
        }
        finally {
            this.h.f.m();
        }
    }
}
