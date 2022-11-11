// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Collections;
import java.util.List;
import d6.j;
import android.content.Context;
import c6.h;
import c6.l;
import p5.b;

public final class WorkManagerInitializer implements b<l>
{
    public static final String a;
    
    static {
        a = h.e("WrkMgrInitializer");
    }
    
    @Override
    public final Object create(final Context context) {
        h.c().a(WorkManagerInitializer.a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        j.l(context, new a(new a$a()));
        return j.k(context);
    }
    
    @Override
    public final List<Class<? extends b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
