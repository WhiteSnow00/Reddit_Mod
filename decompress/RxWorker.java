// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import androidx.work.impl.utils.futures.AbstractFuture$b;
import m6.l;
import nf2.e0;
import yf2.j1;
import java.util.concurrent.Future;
import nf2.g;
import yg.c;
import io.reactivex.plugins.RxJavaPlugins;
import xf2.e;
import io.reactivex.internal.functions.Functions$u;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import mg2.a;
import nf2.b0;
import nf2.c0;
import android.content.Context;
import m6.q;
import java.util.concurrent.Executor;

public abstract class RxWorker extends ListenableWorker
{
    public static final Executor INSTANT_EXECUTOR;
    private a<ListenableWorker$a> mSingleFutureObserverAdapter;
    
    static {
        INSTANT_EXECUTOR = (Executor)new q();
    }
    
    public RxWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public abstract c0<ListenableWorker$a> createWork();
    
    public b0 getBackgroundScheduler() {
        final Executor backgroundExecutor = this.getBackgroundExecutor();
        final b0 a = mg2.a.a;
        return (b0)new ExecutorScheduler(backgroundExecutor);
    }
    
    public void onStopped() {
        super.onStopped();
        final a<ListenableWorker$a> mSingleFutureObserverAdapter = this.mSingleFutureObserverAdapter;
        if (mSingleFutureObserverAdapter != null) {
            final qf2.a g = mSingleFutureObserverAdapter.g;
            if (g != null) {
                g.dispose();
            }
            this.mSingleFutureObserverAdapter = null;
        }
    }
    
    public final nf2.a setCompletableProgress(final b progressAsync) {
        final c setProgressAsync = this.setProgressAsync(progressAsync);
        if (setProgressAsync != null) {
            return RxJavaPlugins.onAssembly((nf2.a)new e((sf2.a)new Functions$u(setProgressAsync)));
        }
        throw new NullPointerException("future is null");
    }
    
    @Deprecated
    public final c0<Void> setProgress(final b progressAsync) {
        return (c0<Void>)RxJavaPlugins.onAssembly((c0)new j1(g.fromFuture((Future)this.setProgressAsync(progressAsync)), (Object)null));
    }
    
    public c<ListenableWorker$a> startWork() {
        this.mSingleFutureObserverAdapter = new a<ListenableWorker$a>();
        final c0 h = this.createWork().H(this.getBackgroundScheduler());
        final l a = ((n6.b)this.getTaskExecutor()).a;
        final b0 a2 = mg2.a.a;
        h.y((b0)new ExecutorScheduler((Executor)a)).c((e0)this.mSingleFutureObserverAdapter);
        return (c<ListenableWorker$a>)this.mSingleFutureObserverAdapter.f;
    }
    
    public static final class a<T> implements e0<T>, Runnable
    {
        public final androidx.work.impl.utils.futures.a<T> f;
        public qf2.a g;
        
        public a() {
            (this.f = new androidx.work.impl.utils.futures.a<T>()).a(this, RxWorker.INSTANT_EXECUTOR);
        }
        
        public final void onError(final Throwable t) {
            this.f.j(t);
        }
        
        public final void onSubscribe(final qf2.a g) {
            this.g = g;
        }
        
        public final void onSuccess(final T t) {
            this.f.i(t);
        }
        
        public final void run() {
            if (this.f.f instanceof AbstractFuture$b) {
                final qf2.a g = this.g;
                if (g != null) {
                    g.dispose();
                }
            }
        }
    }
}
