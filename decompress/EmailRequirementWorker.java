// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.worker;

import ff2.c0;
import androidx.work.ListenableWorker$a$a;
import su2.a;
import kotlinx.coroutines.rx2.d;
import androidx.work.ListenableWorker$a$c;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import androidx.work.ListenableWorker$a;
import lg2.c;
import sg2.e;
import androidx.work.WorkerParameters;
import android.content.Context;
import xd0.m;
import kotlin.Metadata;
import androidx.work.CoroutineWorker;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/worker/EmailRequirementWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxd0/m;", "myAccountRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxd0/m;)V", "a", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class EmailRequirementWorker extends CoroutineWorker
{
    public final m f;
    
    public EmailRequirementWorker(final Context context, final WorkerParameters workerParameters, final m f) {
        e.f((Object)context, "context");
        e.f((Object)workerParameters, "workerParams");
        e.f((Object)f, "myAccountRepository");
        super(context, workerParameters);
        this.f = f;
    }
    
    public final Object doWork(final c<? super ListenableWorker$a> c) {
        EmailRequirementWorker$doWork$1 emailRequirementWorker$doWork$2 = null;
        Label_0047: {
            if (c instanceof EmailRequirementWorker$doWork$1) {
                final EmailRequirementWorker$doWork$1 emailRequirementWorker$doWork$1 = (EmailRequirementWorker$doWork$1)c;
                final int label = emailRequirementWorker$doWork$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    emailRequirementWorker$doWork$1.label = label + Integer.MIN_VALUE;
                    emailRequirementWorker$doWork$2 = emailRequirementWorker$doWork$1;
                    break Label_0047;
                }
            }
            emailRequirementWorker$doWork$2 = new EmailRequirementWorker$doWork$1(this, (c)c);
        }
        final Object result = emailRequirementWorker$doWork$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = emailRequirementWorker$doWork$2.label;
        Object o = null;
        Label_0089: {
            if (label2 == 0) {
                break Label_0089;
            }
            Label_0079: {
                if (label2 != 1) {
                    break Label_0079;
                }
                try {
                    b.k0(result);
                    Label_0122: {
                        o = new ListenableWorker$a$c();
                    }
                    return o;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    b.k0(result);
                    final c0 r1 = this.f.r1();
                    emailRequirementWorker$doWork$2.label = 1;
                    iftrue(Label_0122:)(d.b(r1, (c)emailRequirementWorker$doWork$2) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    a.a.f((Throwable)ex, "Error fetching email requirement.", new Object[0]);
                    o = new ListenableWorker$a$a();
                }
            }
        }
        return o;
    }
}
