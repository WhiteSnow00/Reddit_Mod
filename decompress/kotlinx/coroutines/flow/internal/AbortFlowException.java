// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import cj2.f;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t" }, d2 = { "Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lcj2/f;", "owner", "<init>", "(Lcj2/f;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 })
public final class AbortFlowException extends CancellationException
{
    public final transient f<?> owner;
    
    public AbortFlowException(final f<?> owner) {
        super("Flow was aborted, no more elements needed");
        this.owner = owner;
    }
    
    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
