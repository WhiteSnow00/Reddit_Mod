// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import zi2.z0;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0000H\u0016¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "createCopy", "", "message", "Lzi2/z0;", "coroutine", "<init>", "(Ljava/lang/String;Lzi2/z0;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 })
public final class TimeoutCancellationException extends CancellationException
{
    public final transient z0 coroutine;
    
    public TimeoutCancellationException(final String s) {
        this(s, (z0)null);
    }
    
    public TimeoutCancellationException(final String s, final z0 coroutine) {
        super(s);
        this.coroutine = coroutine;
    }
    
    public /* bridge */ Throwable createCopy() {
        return this.createCopy();
    }
    
    public TimeoutCancellationException createCopy() {
        String message;
        if ((message = this.getMessage()) == null) {
            message = "";
        }
        final TimeoutCancellationException ex = new TimeoutCancellationException(message, this.coroutine);
        ex.initCause(this);
        return ex;
    }
}
