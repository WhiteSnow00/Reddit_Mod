// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import yg.c;
import androidx.annotation.Keep;
import android.content.Context;
import androidx.work.impl.utils.futures.a;

public abstract class Worker extends ListenableWorker
{
    public a<ListenableWorker$a> f;
    
    @Keep
    public Worker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public abstract ListenableWorker$a a();
    
    public final c<ListenableWorker$a> startWork() {
        this.f = new a<ListenableWorker$a>();
        this.getBackgroundExecutor().execute((Runnable)new Worker$a(this));
        return (c<ListenableWorker$a>)this.f;
    }
}
