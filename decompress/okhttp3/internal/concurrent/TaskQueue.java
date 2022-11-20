// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.concurrent;

import java.util.concurrent.RejectedExecutionException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.logging.Logger;
import java.util.logging.Level;
import okhttp3.internal._UtilJvmKt;
import cg2.j;
import mg2.a;
import java.util.ArrayList;
import ng2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001:B\u0019\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b8\u00109J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ0\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u0006\u0010\u0010\u001a\u00020\u000fJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\bH\u0016R\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0016\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010&R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00101¨\u0006;" }, d2 = { "Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "Lcg2/j;", "schedule", "", "name", "Lkotlin/Function0;", "block", "", "cancelable", "execute", "Ljava/util/concurrent/CountDownLatch;", "idleLatch", "recurrence", "scheduleAndDecide$okhttp", "(Lokhttp3/internal/concurrent/Task;JZ)Z", "scheduleAndDecide", "cancelAll", "shutdown", "cancelAllAndDecide$okhttp", "()Z", "cancelAllAndDecide", "toString", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/lang/String;", "getName$okhttp", "()Ljava/lang/String;", "Z", "getShutdown$okhttp", "setShutdown$okhttp", "(Z)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "", "futureTasks", "Ljava/util/List;", "getFutureTasks$okhttp", "()Ljava/util/List;", "cancelActiveTask", "getCancelActiveTask$okhttp", "setCancelActiveTask$okhttp", "", "getScheduledTasks", "scheduledTasks", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "AwaitIdleTask", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class TaskQueue
{
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;
    
    public TaskQueue(final TaskRunner taskRunner, final String name) {
        e.f((Object)taskRunner, "taskRunner");
        e.f((Object)name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList<Task>();
    }
    
    public static void execute$default(final TaskQueue taskQueue, final String s, long n, boolean b, final a a, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0L;
        }
        if ((n2 & 0x4) != 0x0) {
            b = true;
        }
        taskQueue.execute(s, n, b, (a<j>)a);
    }
    
    public static void schedule$default(final TaskQueue taskQueue, final String s, long n, final a a, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0L;
        }
        taskQueue.schedule(s, n, (a<Long>)a);
    }
    
    public static void schedule$default(final TaskQueue taskQueue, final Task task, long n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0L;
        }
        taskQueue.schedule(task, n);
    }
    
    public final void cancelAll() {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        synchronized (this.taskRunner) {
            if (this.cancelAllAndDecide$okhttp()) {
                this.getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            final j a = j.a;
        }
    }
    
    public final boolean cancelAllAndDecide$okhttp() {
        final Task activeTask = this.activeTask;
        if (activeTask != null) {
            e.c((Object)activeTask);
            if (activeTask.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean b = false;
        final boolean b2 = false;
        int n = this.futureTasks.size() - 1;
        if (n >= 0) {
            b = b2;
            while (true) {
                final int n2 = n - 1;
                if (this.futureTasks.get(n).getCancelable()) {
                    final Logger logger$okhttp = this.taskRunner.getLogger$okhttp();
                    final Task task = this.futureTasks.get(n);
                    if (logger$okhttp.isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(logger$okhttp, task, this, "canceled");
                    }
                    this.futureTasks.remove(n);
                    b = true;
                }
                if (n2 < 0) {
                    break;
                }
                n = n2;
            }
        }
        return b;
    }
    
    public final void execute(final String s, final long n, final boolean b, final a<j> a) {
        e.f((Object)s, "name");
        e.f((Object)a, "block");
        this.schedule((Task)new TaskQueue$execute$1(s, b, (a)a), n);
    }
    
    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }
    
    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }
    
    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }
    
    public final String getName$okhttp() {
        return this.name;
    }
    
    public final List<Task> getScheduledTasks() {
        synchronized (this.taskRunner) {
            return CollectionsKt___CollectionsKt.I5((Iterable)this.getFutureTasks$okhttp());
        }
    }
    
    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }
    
    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }
    
    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.getActiveTask$okhttp() == null && this.getFutureTasks$okhttp().isEmpty()) {
                return new CountDownLatch(0);
            }
            final Task activeTask$okhttp = this.getActiveTask$okhttp();
            if (activeTask$okhttp instanceof TaskQueue.TaskQueue$AwaitIdleTask) {
                return ((TaskQueue.TaskQueue$AwaitIdleTask)activeTask$okhttp).getLatch();
            }
            for (final Task task : this.getFutureTasks$okhttp()) {
                if (task instanceof TaskQueue.TaskQueue$AwaitIdleTask) {
                    return ((TaskQueue.TaskQueue$AwaitIdleTask)task).getLatch();
                }
            }
            final TaskQueue.TaskQueue$AwaitIdleTask taskQueue$AwaitIdleTask = new TaskQueue.TaskQueue$AwaitIdleTask();
            if (this.scheduleAndDecide$okhttp((Task)taskQueue$AwaitIdleTask, 0L, false)) {
                this.getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            return taskQueue$AwaitIdleTask.getLatch();
        }
    }
    
    public final void schedule(final String s, final long n, final a<Long> a) {
        e.f((Object)s, "name");
        e.f((Object)a, "block");
        this.schedule((Task)new TaskQueue$schedule$2(s, (a)a), n);
    }
    
    public final void schedule(final Task task, final long n) {
        e.f((Object)task, "task");
        synchronized (this.taskRunner) {
            if (!this.getShutdown$okhttp()) {
                if (this.scheduleAndDecide$okhttp(task, n, false)) {
                    this.getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                final j a = j.a;
                return;
            }
            if (task.getCancelable()) {
                final Logger logger$okhttp = this.getTaskRunner$okhttp().getLogger$okhttp();
                if (logger$okhttp.isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(logger$okhttp, task, this, "schedule canceled (queue is shutdown)");
                }
                return;
            }
            final Logger logger$okhttp2 = this.getTaskRunner$okhttp().getLogger$okhttp();
            if (logger$okhttp2.isLoggable(Level.FINE)) {
                TaskLoggerKt.access$log(logger$okhttp2, task, this, "schedule failed (queue is shutdown)");
            }
            throw new RejectedExecutionException();
        }
    }
    
    public final boolean scheduleAndDecide$okhttp(final Task task, final long n, final boolean b) {
        e.f((Object)task, "task");
        task.initQueue$okhttp(this);
        final long nanoTime = this.taskRunner.getBackend().nanoTime();
        final long nextExecuteNanoTime$okhttp = nanoTime + n;
        final int index = this.futureTasks.indexOf(task);
        final boolean b2 = false;
        if (index != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= nextExecuteNanoTime$okhttp) {
                final Logger logger$okhttp = this.taskRunner.getLogger$okhttp();
                if (logger$okhttp.isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(logger$okhttp, task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(index);
        }
        task.setNextExecuteNanoTime$okhttp(nextExecuteNanoTime$okhttp);
        final Logger logger$okhttp2 = this.taskRunner.getLogger$okhttp();
        if (logger$okhttp2.isLoggable(Level.FINE)) {
            String s;
            if (b) {
                s = e.l((Object)TaskLoggerKt.formatDuration(nextExecuteNanoTime$okhttp - nanoTime), "run again after ");
            }
            else {
                s = e.l((Object)TaskLoggerKt.formatDuration(nextExecuteNanoTime$okhttp - nanoTime), "scheduled after ");
            }
            TaskLoggerKt.access$log(logger$okhttp2, task, this, s);
        }
        final Iterator<Task> iterator = this.futureTasks.iterator();
        int n2 = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (iterator.next().getNextExecuteNanoTime$okhttp() - nanoTime > n) {
                    int size = n2;
                    if (n2 == -1) {
                        size = this.futureTasks.size();
                    }
                    this.futureTasks.add(size, task);
                    boolean b3 = b2;
                    if (size == 0) {
                        b3 = true;
                    }
                    return b3;
                }
                ++n2;
            }
            n2 = -1;
            continue;
        }
    }
    
    public final void setActiveTask$okhttp(final Task activeTask) {
        this.activeTask = activeTask;
    }
    
    public final void setCancelActiveTask$okhttp(final boolean cancelActiveTask) {
        this.cancelActiveTask = cancelActiveTask;
    }
    
    public final void setShutdown$okhttp(final boolean shutdown) {
        this.shutdown = shutdown;
    }
    
    public final void shutdown() {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        synchronized (this.taskRunner) {
            this.setShutdown$okhttp(true);
            if (this.cancelAllAndDecide$okhttp()) {
                this.getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            final j a = j.a;
        }
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
