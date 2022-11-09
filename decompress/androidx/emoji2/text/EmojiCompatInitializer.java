// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import v3.k;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.List;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.ProcessLifecycleInitializer;
import p5.a;
import androidx.lifecycle.q;
import android.content.Context;
import p5.b;

public class EmojiCompatInitializer implements p5.b<Boolean>
{
    @Override
    public final Object create(final Context context) {
        final a a = new a(context);
        if (f.j == null) {
            synchronized (f.i) {
                if (f.j == null) {
                    f.j = new f(a);
                }
            }
        }
        final Lifecycle lifecycle = p5.a.c(context).d((Class<? extends p5.b<q>>)ProcessLifecycleInitializer.class).getLifecycle();
        lifecycle.a((p)new EmojiCompatInitializer$1(this, lifecycle));
        return Boolean.TRUE;
    }
    
    @Override
    public final List<Class<? extends p5.b<?>>> dependencies() {
        return (List<Class<? extends p5.b<?>>>)Collections.singletonList(ProcessLifecycleInitializer.class);
    }
    
    public static final class a extends f.c
    {
        public a(final Context context) {
            super(new EmojiCompatInitializer.b(context));
            super.b = 1;
        }
    }
    
    public static final class b implements g
    {
        public final Context a;
        
        public b(final Context context) {
            this.a = context.getApplicationContext();
        }
        
        @Override
        public final void a(final h h) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(), new a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new androidx.emoji2.text.g(this, 0, h, threadPoolExecutor));
        }
    }
    
    public static final class c implements Runnable
    {
        @Override
        public final void run() {
            try {
                final int a = k.a;
                k.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.j != null) {
                    f.a().c();
                }
                k.a.b();
            }
            finally {
                final int a2 = k.a;
                k.a.b();
            }
        }
    }
}
