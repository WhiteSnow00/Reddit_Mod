// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import j5.w;
import n5.e;
import com.reddit.db.converters.a;
import com.reddit.notification.common.NotificationLevel;
import java.util.concurrent.Callable;

public final class x0 implements Callable<Void>
{
    public final /* synthetic */ NotificationLevel f;
    public final /* synthetic */ String g;
    public final /* synthetic */ v0 h;
    
    public x0(final v0 h, final NotificationLevel f, final String g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() throws Exception {
        final e a = ((w)this.h.l).a();
        final String b = com.reddit.db.converters.a.b(this.f);
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        final String g = this.g;
        if (g == null) {
            a.bindNull(2);
        }
        else {
            a.bindString(2, g);
        }
        this.h.f.c();
        try {
            a.executeUpdateDelete();
            this.h.f.q();
            return null;
        }
        finally {
            this.h.f.m();
            ((w)this.h.l).c(a);
        }
    }
}
