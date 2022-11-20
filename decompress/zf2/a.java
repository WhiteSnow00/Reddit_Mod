// 
// Decompiled by Procyon v0.6.0
// 

package zf2;

import java.util.concurrent.Callable;
import io.reactivex.plugins.RxJavaPlugins;
import rf2.i;
import af2.b0;

public final class a
{
    public static final b0 a;
    public static final b0 b;
    public static final b0 c;
    public static final i d;
    
    static {
        a = RxJavaPlugins.initSingleScheduler((Callable)new a.a$h());
        b = RxJavaPlugins.initComputationScheduler((Callable)new a.a$b());
        c = RxJavaPlugins.initIoScheduler((Callable)new a.a$c());
        d = i.b;
        RxJavaPlugins.initNewThreadScheduler((Callable)new a.a$f());
    }
    
    public static b0 a() {
        return RxJavaPlugins.onComputationScheduler(zf2.a.b);
    }
    
    public static b0 b() {
        return RxJavaPlugins.onIoScheduler(zf2.a.c);
    }
}
