// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import ng2.e;
import zi2.z0;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014" }, d2 = { "Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "fillInStackTrace", "createCopy", "", "toString", "other", "", "equals", "", "hashCode", "message", "cause", "Lzi2/z0;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lzi2/z0;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 })
public final class JobCancellationException extends CancellationException
{
    public final transient z0 job;
    
    public JobCancellationException(final String s, final Throwable t, final z0 job) {
        super(s);
        this.job = job;
        if (t != null) {
            this.initCause(t);
        }
    }
    
    public /* bridge */ Throwable createCopy() {
        return this.createCopy();
    }
    
    public JobCancellationException createCopy() {
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof JobCancellationException) {
                final JobCancellationException ex = (JobCancellationException)o;
                if (e.a((Object)ex.getMessage(), (Object)this.getMessage()) && e.a((Object)ex.job, (Object)this.job) && e.a((Object)ex.getCause(), (Object)this.getCause())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public int hashCode() {
        final String message = this.getMessage();
        e.c((Object)message);
        final int hashCode = message.hashCode();
        final int hashCode2 = this.job.hashCode();
        final Throwable cause = this.getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.job);
        return sb.toString();
    }
}
