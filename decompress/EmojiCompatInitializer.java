// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

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
    public final Object create(final Context context) {
        final a a = new a(context);
        if (f.j == null) {
            synchronized (f.i) {
                if (f.j == null) {
                    f.j = new f(a);
                }
            }
        }
        final Lifecycle lifecycle = ((q)p5.a.c(context).d((Class)ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a((p)new EmojiCompatInitializer$1(this, lifecycle));
        return Boolean.TRUE;
    }
    
    public final List<Class<? extends p5.b<?>>> dependencies() {
        return Collections.singletonList((Class<? extends p5.b<?>>)ProcessLifecycleInitializer.class);
    }
    
    public static final class a extends f$c
    {
        public a(final Context context) {
            super((f$g)new b(context));
            super.b = 1;
        }
    }
    
    public static final class b implements f$g
    {
        public final Context a;
        
        public b(final Context context) {
            this.a = context.getApplicationContext();
        }
        
        public final void a(final f$h f$h) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute((Runnable)new g((Object)this, 0, (Object)f$h, (Object)threadPoolExecutor));
        }
    }
}
