// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import d6.j;
import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import c6.h;
import androidx.work.ListenableWorker$a;
import androidx.work.impl.utils.futures.a;
import androidx.work.WorkerParameters;
import h6.c;
import androidx.work.ListenableWorker;

public class ConstraintTrackingWorker extends ListenableWorker implements c
{
    public static final String k;
    public WorkerParameters f;
    public final Object g;
    public volatile boolean h;
    public a<ListenableWorker$a> i;
    public ListenableWorker j;
    
    static {
        k = h.e("ConstraintTrkngWrkr");
    }
    
    public ConstraintTrackingWorker(final Context context, final WorkerParameters f) {
        super(context, f);
        this.f = f;
        this.g = new Object();
        this.h = false;
        this.i = new a<ListenableWorker$a>();
    }
    
    public final void d(final ArrayList list) {
        c6.h.c().a(ConstraintTrackingWorker.k, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.g) {
            this.h = true;
        }
    }
    
    public final void e(final List<String> list) {
    }
    
    public final n6.a getTaskExecutor() {
        return d6.j.k(this.getApplicationContext()).d;
    }
    
    public final boolean isRunInForeground() {
        final ListenableWorker j = this.j;
        return j != null && j.isRunInForeground();
    }
    
    public final void onStopped() {
        super.onStopped();
        final ListenableWorker j = this.j;
        if (j != null && !j.isStopped()) {
            this.j.stop();
        }
    }
    
    public final yg.c<ListenableWorker$a> startWork() {
        this.getBackgroundExecutor().execute((Runnable)new ConstraintTrackingWorker$a(this));
        return (yg.c<ListenableWorker$a>)this.i;
    }
}
