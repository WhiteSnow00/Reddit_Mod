// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import al0.b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import android.content.Context;

public abstract class o
{
    public static final String a;
    
    static {
        a = i.e("WorkerFactory");
    }
    
    public abstract ListenableWorker a(final Context p0, final String p1, final WorkerParameters p2);
    
    public final ListenableWorker b(final Context context, final String s, final WorkerParameters workerParameters) {
        ListenableWorker a;
        final ListenableWorker listenableWorker = a = this.a(context, s, workerParameters);
        if (listenableWorker == null) {
            Class<? extends ListenableWorker> subclass = null;
            try {
                subclass = Class.forName(s).asSubclass(ListenableWorker.class);
            }
            finally {
                final Throwable t;
                i.c().b(o.a, b.h("Invalid class: ", s), t);
            }
            a = listenableWorker;
            if (subclass != null) {
                try {
                    final ListenableWorker listenableWorker2 = (ListenableWorker)subclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                }
                finally {
                    final Throwable t2;
                    i.c().b(o.a, b.h("Could not instantiate ", s), t2);
                    a = listenableWorker;
                }
            }
        }
        if (a != null && a.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", this.getClass().getName(), s));
        }
        return a;
    }
}
