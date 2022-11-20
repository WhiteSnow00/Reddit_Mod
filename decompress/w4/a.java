// 
// Decompiled by Procyon v0.6.0
// 

package w4;

import androidx.loader.content.ModernAsyncTask$g;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;
import androidx.loader.content.ModernAsyncTask$d;
import androidx.loader.content.ModernAsyncTask$Status;
import java.util.concurrent.ThreadPoolExecutor;
import androidx.loader.content.ModernAsyncTask;
import android.content.Context;
import java.util.concurrent.Executor;

public abstract class a<D> extends b<D>
{
    public final Executor h;
    public volatile a i;
    public volatile a j;
    
    public a(final Context context) {
        final ThreadPoolExecutor k = ModernAsyncTask.k;
        super(context);
        this.h = k;
    }
    
    public final void e() {
        if (this.j == null && this.i != null) {
            this.i.getClass();
            final a i = this.i;
            final Executor h = this.h;
            if (i.h != ModernAsyncTask$Status.PENDING) {
                final int n = ModernAsyncTask$d.a[((Enum)i.h).ordinal()];
                if (n == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                if (n != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            else {
                i.h = ModernAsyncTask$Status.RUNNING;
                ((ModernAsyncTask$g)i.f).f = null;
                h.execute((Runnable)i.g);
            }
        }
    }
    
    public abstract D f();
    
    public final class a extends ModernAsyncTask<Void, Void, D> implements Runnable
    {
        public final CountDownLatch m;
        public final w4.a n;
        
        public a(final w4.a n) {
            this.n = n;
            this.m = new CountDownLatch(1);
        }
        
        public final Object a(final Object[] array) {
            final Void[] array2 = (Void[])array;
            Object f;
            try {
                f = this.n.f();
            }
            catch (final OperationCanceledException ex) {
                if (!super.i.get()) {
                    throw ex;
                }
                f = null;
            }
            return f;
        }
        
        public final void b(final D n) {
            try {
                final w4.a n2 = this.n;
                if (n2.j == this) {
                    SystemClock.uptimeMillis();
                    n2.j = null;
                    n2.e();
                }
            }
            finally {
                this.m.countDown();
            }
        }
        
        public final void c(final D n) {
            try {
                final w4.a n2 = this.n;
                if (n2.i != this) {
                    if (n2.j == this) {
                        SystemClock.uptimeMillis();
                        n2.j = null;
                        n2.e();
                    }
                }
                else if (!n2.e) {
                    SystemClock.uptimeMillis();
                    n2.i = null;
                    n2.b(n);
                }
            }
            finally {
                this.m.countDown();
            }
        }
        
        public final void run() {
            this.n.e();
        }
    }
}
