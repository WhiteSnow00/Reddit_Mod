// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.content.pm.PackageManager$NameNotFoundException;
import w3.e;
import w3.m;
import androidx.activity.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import ej2.c0;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import android.os.Handler;
import w3.f;
import android.content.Context;

public final class l extends f$c
{
    public static final l$a d;
    
    static {
        d = new l$a();
    }
    
    public l(final Context context, final f f) {
        super((f$g)new b(context, f));
    }
    
    public static final class b implements f$g
    {
        public final Context a;
        public final f b;
        public final l$a c;
        public final Object d;
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public f$h h;
        
        public b(final Context context, final f b) {
            final l$a d = l.d;
            this.d = new Object();
            c0.J2((Object)context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = b;
            this.c = d;
        }
        
        public final void a(final f$h h) {
            synchronized (this.d) {
                this.h = h;
                monitorexit(this.d);
                this.c();
            }
        }
        
        public final void b() {
            synchronized (this.d) {
                this.h = null;
                final Handler e = this.e;
                if (e != null) {
                    e.removeCallbacks((Runnable)null);
                }
                this.e = null;
                final ThreadPoolExecutor g = this.g;
                if (g != null) {
                    g.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }
        
        public final void c() {
            synchronized (this.d) {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute((Runnable)new androidx.activity.b((Object)this, 6));
            }
        }
        
        public final m d() {
            try {
                final l$a c = this.c;
                final Context a = this.a;
                final f b = this.b;
                c.getClass();
                final w3.l a2 = w3.e.a(a, b);
                if (a2.a != 0) {
                    throw new RuntimeException(al0.a.l(a.r("fetchFonts failed ("), a2.a, ")"));
                }
                final m[] b2 = a2.b;
                if (b2 != null && b2.length != 0) {
                    return b2[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                throw new RuntimeException("provider not found", (Throwable)ex);
            }
        }
    }
}
