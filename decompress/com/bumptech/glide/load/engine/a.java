// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import java.lang.ref.WeakReference;
import q8.l;
import o8.d;
import java.util.concurrent.ExecutorService;
import q8.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;

public final class a
{
    public final boolean a;
    public final HashMap b;
    public final ReferenceQueue<g<?>> c;
    public g.a d;
    
    public a() {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor((ThreadFactory)new a());
        this.b = new HashMap();
        this.c = new ReferenceQueue<g<?>>();
        this.a = false;
        singleThreadExecutor.execute((Runnable)new b(this));
    }
    
    public final void a(final d d, final g<?> g) {
        synchronized (this) {
            final a a = this.b.put(d, new a(d, g, this.c, this.a));
            if (a != null) {
                a.c = null;
                a.clear();
            }
        }
    }
    
    public final void b(final a a) {
        synchronized (this) {
            this.b.remove(a.a);
            if (a.b) {
                final l<?> c = a.c;
                if (c != null) {
                    monitorexit(this);
                    this.d.a(a.a, new g<Object>((q8.l<Object>)c, true, false, a.a, this.d));
                }
            }
        }
    }
    
    public static final class a extends WeakReference<g<?>>
    {
        public final d a;
        public final boolean b;
        public l<?> c;
        
        public a(final d a, final g<?> g, final ReferenceQueue<? super g<?>> referenceQueue, final boolean b) {
            super(g, referenceQueue);
            ml0.a.l((Object)a);
            this.a = a;
            q8.l<?> h;
            if (g.f && b) {
                h = g.h;
                ml0.a.l((Object)h);
            }
            else {
                h = null;
            }
            this.c = h;
            this.b = g.f;
        }
    }
}
