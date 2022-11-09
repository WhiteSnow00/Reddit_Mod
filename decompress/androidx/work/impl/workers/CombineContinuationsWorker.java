// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import androidx.work.ListenableWorker$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.Worker;

public class CombineContinuationsWorker extends Worker
{
    public CombineContinuationsWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @Override
    public final ListenableWorker$a a() {
        return new ListenableWorker$a.c(this.getInputData());
    }
}
