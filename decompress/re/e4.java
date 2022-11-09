// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class e4 extends FutureTask implements Comparable
{
    public final long f;
    public final boolean g;
    public final String h;
    public final /* synthetic */ g4 i;
    
    public e4(final g4 i, final Runnable runnable, final boolean g, final String h) {
        this.i = i;
        super(runnable, null);
        final long andIncrement = g4.p.getAndIncrement();
        this.f = andIncrement;
        this.h = h;
        this.g = g;
        if (andIncrement == Long.MAX_VALUE) {
            ((h4)((w)i).f).f().k.a("Tasks index overflow");
        }
    }
    
    public e4(final g4 i, final Callable callable, final boolean g) {
        this.i = i;
        super(callable);
        final long andIncrement = g4.p.getAndIncrement();
        this.f = andIncrement;
        this.h = "Task exception on worker thread";
        this.g = g;
        if (andIncrement == Long.MAX_VALUE) {
            ((h4)((w)i).f).f().k.a("Tasks index overflow");
        }
    }
    
    @Override
    public final int compareTo(final Object o) {
        final e4 e4 = (e4)o;
        final boolean g = this.g;
        final boolean g2 = e4.g;
        int n = 1;
        if (g != g2) {
            if (g) {
                return -1;
            }
        }
        else {
            final long n2 = lcmp(this.f, e4.f);
            if (n2 < 0) {
                n = -1;
            }
            else if (n2 <= 0) {
                ((h4)((w)this.i).f).f().l.b(this.f, "Two tasks share the same index. index");
                return 0;
            }
        }
        return n;
    }
    
    public final void setException(final Throwable exception) {
        ((h4)((w)this.i).f).f().k.b(exception, this.h);
        super.setException(exception);
    }
}
