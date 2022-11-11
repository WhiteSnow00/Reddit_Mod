// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import zg2.p;
import kotlinx.coroutines.CoroutineStart;
import mj2.b0;
import mj2.g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import c6.d;
import tg2.c;
import mj2.j0;
import java.util.concurrent.Executor;
import ah2.f;
import android.content.Context;
import uj2.b;
import androidx.work.impl.utils.futures.a;
import mj2.b1;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class CoroutineWorker extends ListenableWorker
{
    public final b1 f;
    public final a<ListenableWorker$a> g;
    public final b h;
    
    public CoroutineWorker(final Context context, final WorkerParameters workerParameters) {
        ah2.f.f((Object)context, "appContext");
        ah2.f.f((Object)workerParameters, "params");
        super(context, workerParameters);
        this.f = at1.a.i();
        (this.g = new a<ListenableWorker$a>()).a((Runnable)new CoroutineWorker$a(this), (Executor)((n6.b)this.getTaskExecutor()).a);
        this.h = j0.a;
    }
    
    public abstract Object a(final c<? super ListenableWorker$a> p0);
    
    public final yg.c<d> getForegroundInfoAsync() {
        final b1 i = at1.a.i();
        final b h = this.h;
        h.getClass();
        final rj2.f a = mj2.g.a(CoroutineContext$DefaultImpls.a((CoroutineContext)h, (CoroutineContext)i));
        final androidx.work.c c = new androidx.work.c(i);
        mj2.g.i((b0)a, (CoroutineContext)null, (CoroutineStart)null, (p)new CoroutineWorker$getForegroundInfoAsync$1(c, this, (c)null), 3);
        return (yg.c<d>)c;
    }
    
    public final void onStopped() {
        super.onStopped();
        this.g.cancel(false);
    }
    
    public final yg.c<ListenableWorker$a> startWork() {
        mj2.g.i((b0)mj2.g.a(((tg2.a)this.h).plus((CoroutineContext)this.f)), (CoroutineContext)null, (CoroutineStart)null, (p)new CoroutineWorker$startWork$1(this, (c)null), 3);
        return (yg.c<ListenableWorker$a>)this.g;
    }
}
