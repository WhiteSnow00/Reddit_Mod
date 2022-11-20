// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.concurrent;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!" }, d2 = { "Lokhttp3/internal/concurrent/Task;", "", "", "runOnce", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lcg2/j;", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "", "toString", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "cancelable", "Z", "getCancelable", "()Z", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "()J", "setNextExecuteNanoTime$okhttp", "(J)V", "<init>", "(Ljava/lang/String;Z)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public abstract class Task
{
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;
    
    public Task(final String name, final boolean cancelable) {
        e.f((Object)name, "name");
        this.name = name;
        this.cancelable = cancelable;
        this.nextExecuteNanoTime = -1L;
    }
    
    public Task(final String s, boolean b, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        this(s, b);
    }
    
    public final boolean getCancelable() {
        return this.cancelable;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }
    
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }
    
    public final void initQueue$okhttp(final TaskQueue queue) {
        e.f((Object)queue, "queue");
        final TaskQueue queue2 = this.queue;
        if (queue2 == queue) {
            return;
        }
        if (queue2 == null) {
            this.queue = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }
    
    public abstract long runOnce();
    
    public final void setNextExecuteNanoTime$okhttp(final long nextExecuteNanoTime) {
        this.nextExecuteNanoTime = nextExecuteNanoTime;
    }
    
    public final void setQueue$okhttp(final TaskQueue queue) {
        this.queue = queue;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
