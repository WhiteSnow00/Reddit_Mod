// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import android.app.Application$ActivityLifecycleCallbacks;
import android.util.Log;
import android.app.Application;
import p2.e;
import re.c4;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import android.content.Context;
import java.util.ArrayList;
import qe.a;
import java.util.concurrent.ExecutorService;

public final class x1
{
    public static volatile x1 g;
    public final ExecutorService a;
    public final a b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile r0 f;
    
    public x1(Context context, final Bundle bundle) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new o1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new a(this);
        this.c = new ArrayList();
        while (true) {
            try {
                p2.e.t(context, c4.a(context));
                this.b((s1)new g1(this, context, bundle));
                context = context.getApplicationContext();
                if (context == null) {
                    Log.w("FA", "Unable to register lifecycle notifications. Application null.");
                    return;
                }
                ((Application)context).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new w1(this));
            }
            catch (final IllegalStateException ex) {
                continue;
            }
            break;
        }
    }
    
    public static x1 d(final Context context, final Bundle bundle) {
        yd.a.S0((Object)context);
        if (x1.g == null) {
            synchronized (x1.class) {
                if (x1.g == null) {
                    x1.g = new x1(context, bundle);
                }
            }
        }
        return x1.g;
    }
    
    public final void a(final Exception ex, final boolean b, final boolean b2) {
        this.e |= b;
        if (b) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", (Throwable)ex);
            return;
        }
        if (b2) {
            this.b((s1)new n1(this, (Object)ex));
        }
        Log.w("FA", "Error with data collection. Data lost.", (Throwable)ex);
    }
    
    public final void b(final s1 s1) {
        this.a.execute(s1);
    }
    
    public final int c(final String s) {
        final n0 n0 = new n0();
        this.b((s1)new p1(this, s, n0));
        final Integer n2 = (Integer)ke.n0.R(n0.m(10000L), Integer.class);
        if (n2 == null) {
            return 25;
        }
        return n2;
    }
    
    public final List e(final String s, final String s2) {
        final n0 n0 = new n0();
        this.b((s1)new e1(this, s, s2, n0));
        List<Object> emptyList;
        if ((emptyList = (List)ke.n0.R(n0.m(5000L), List.class)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public final Map f(final String s, final String s2, final boolean b) {
        final n0 n0 = new n0();
        this.b((s1)new m1(this, s, s2, b, n0));
        final Bundle m = n0.m(5000L);
        if (m != null && ((BaseBundle)m).size() != 0) {
            final HashMap hashMap = new HashMap<String, Object>(((BaseBundle)m).size());
            for (final String s3 : ((BaseBundle)m).keySet()) {
                final Object value = ((BaseBundle)m).get(s3);
                if (value instanceof Double || value instanceof Long || value instanceof String) {
                    hashMap.put(s3, value);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
