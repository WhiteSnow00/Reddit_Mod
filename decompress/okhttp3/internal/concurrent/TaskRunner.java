// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.concurrent;

import java.util.concurrent.BlockingQueue;
import okhttp3.internal._UtilCommonKt;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cg2.j;
import java.util.ArrayList;
import okhttp3.internal._UtilJvmKt;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u0003102B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0010\u001a\u00020\nJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u0006\u0010\u0013\u001a\u00020\u0004R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063" }, d2 = { "Lokhttp3/internal/concurrent/TaskRunner;", "", "Lokhttp3/internal/concurrent/Task;", "task", "Lcg2/j;", "beforeRun", "runTask", "", "delayNanos", "afterRun", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "kickCoordinator", "awaitTaskToRun", "newQueue", "", "activeQueues", "cancelAll", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Ljava/util/logging/Logger;", "logger$1", "Ljava/util/logging/Logger;", "getLogger$okhttp", "()Ljava/util/logging/Logger;", "logger", "", "nextQueueName", "I", "", "coordinatorWaiting", "Z", "coordinatorWakeUpAt", "J", "", "busyQueues", "Ljava/util/List;", "readyQueues", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;Ljava/util/logging/Logger;)V", "Companion", "Backend", "RealBackend", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class TaskRunner
{
    public static final Companion Companion;
    public static final TaskRunner INSTANCE;
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private final Logger logger$1;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;
    
    static {
        Companion = new Companion(null);
        final Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        e.e((Object)logger2, "getLogger(TaskRunner::class.java.name)");
        logger = logger2;
        INSTANCE = new TaskRunner((Backend)new TaskRunner.TaskRunner$RealBackend(_UtilJvmKt.threadFactory(e.l((Object)" TaskRunner", _UtilJvmKt.okHttpName), true)), null, 2, null);
    }
    
    public TaskRunner(final Backend backend, final Logger logger$1) {
        e.f((Object)backend, "backend");
        e.f((Object)logger$1, "logger");
        this.backend = backend;
        this.logger$1 = logger$1;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList<TaskQueue>();
        this.readyQueues = new ArrayList<TaskQueue>();
        this.runnable = (Runnable)new TaskRunner$runnable.TaskRunner$runnable$1(this);
    }
    
    public TaskRunner(final Backend backend, Logger logger, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            logger = TaskRunner.logger;
        }
        this(backend, logger);
    }
    
    public static final Logger access$getLogger$cp() {
        return TaskRunner.logger;
    }
    
    public static final void access$runTask(final TaskRunner taskRunner, final Task task) {
        taskRunner.runTask(task);
    }
    
    private final void afterRun(final Task task, final long n) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        final TaskQueue queue$okhttp = task.getQueue$okhttp();
        e.c((Object)queue$okhttp);
        if (queue$okhttp.getActiveTask$okhttp() == task) {
            final boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
            queue$okhttp.setCancelActiveTask$okhttp(false);
            queue$okhttp.setActiveTask$okhttp(null);
            this.busyQueues.remove(queue$okhttp);
            if (n != -1L && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
                queue$okhttp.scheduleAndDecide$okhttp(task, n, true);
            }
            if (queue$okhttp.getFutureTasks$okhttp().isEmpty() ^ true) {
                this.readyQueues.add(queue$okhttp);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    private final void beforeRun(final Task activeTask$okhttp) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        activeTask$okhttp.setNextExecuteNanoTime$okhttp(-1L);
        final TaskQueue queue$okhttp = activeTask$okhttp.getQueue$okhttp();
        e.c((Object)queue$okhttp);
        queue$okhttp.getFutureTasks$okhttp().remove(activeTask$okhttp);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(activeTask$okhttp);
        this.busyQueues.add(queue$okhttp);
    }
    
    private final void runTask(final Task task) {
        final Thread currentThread = Thread.currentThread();
        final String name = currentThread.getName();
        currentThread.setName(task.getName());
        try {
            final long runOnce = task.runOnce();
            synchronized (this) {
                this.afterRun(task, runOnce);
                final j a = j.a;
                monitorexit(this);
                currentThread.setName(name);
            }
        }
        finally {
            synchronized (this) {
                this.afterRun(task, -1L);
                final j a2 = j.a;
                monitorexit(this);
                currentThread.setName(name);
            }
        }
    }
    
    public final List<TaskQueue> activeQueues() {
        synchronized (this) {
            return CollectionsKt___CollectionsKt.o5((Iterable)this.readyQueues, (Collection)this.busyQueues);
        }
    }
    
    public final Task awaitTaskToRun() {
        if (_UtilJvmKt.assertionsEnabled) {
            if (!Thread.holdsLock(this)) {
                final StringBuilder t = a.t("Thread ");
                t.append((Object)Thread.currentThread().getName());
                t.append(" MUST hold lock on ");
                t.append(this);
                throw new AssertionError((Object)t.toString());
            }
        }
    Label_0063:
        while (!this.readyQueues.isEmpty()) {
            final long nanoTime = this.backend.nanoTime();
            long min = Long.MAX_VALUE;
            final Iterator<TaskQueue> iterator = this.readyQueues.iterator();
            Task task = null;
            while (true) {
                while (iterator.hasNext()) {
                    final Task task2 = iterator.next().getFutureTasks$okhttp().get(0);
                    final long max = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - nanoTime);
                    if (max > 0L) {
                        min = Math.min(max, min);
                    }
                    else if (task != null) {
                        final boolean b = true;
                        if (task != null) {
                            this.beforeRun(task);
                            if (b || (!this.coordinatorWaiting && (this.readyQueues.isEmpty() ^ true))) {
                                this.backend.execute(this, this.runnable);
                            }
                            return task;
                        }
                        if (this.coordinatorWaiting) {
                            if (min < this.coordinatorWakeUpAt - nanoTime) {
                                this.backend.coordinatorNotify(this);
                            }
                            return null;
                        }
                        this.coordinatorWaiting = true;
                        this.coordinatorWakeUpAt = nanoTime + min;
                        try {
                            try {
                                this.backend.coordinatorWait(this, min);
                            }
                            finally {}
                        }
                        catch (final InterruptedException ex) {
                            this.cancelAll();
                        }
                        this.coordinatorWaiting = false;
                        continue Label_0063;
                        this.coordinatorWaiting = false;
                    }
                    else {
                        task = task2;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
        return null;
    }
    
    public final void cancelAll() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        int n = this.busyQueues.size() - 1;
        if (n >= 0) {
            while (true) {
                final int n2 = n - 1;
                this.busyQueues.get(n).cancelAllAndDecide$okhttp();
                if (n2 < 0) {
                    break;
                }
                n = n2;
            }
        }
        int n3 = this.readyQueues.size() - 1;
        if (n3 >= 0) {
            while (true) {
                final int n4 = n3 - 1;
                final TaskQueue taskQueue = this.readyQueues.get(n3);
                taskQueue.cancelAllAndDecide$okhttp();
                if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    this.readyQueues.remove(n3);
                }
                if (n4 < 0) {
                    break;
                }
                n3 = n4;
            }
        }
    }
    
    public final Backend getBackend() {
        return this.backend;
    }
    
    public final Logger getLogger$okhttp() {
        return this.logger$1;
    }
    
    public final void kickCoordinator$okhttp(final TaskQueue taskQueue) {
        e.f((Object)taskQueue, "taskQueue");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        if (taskQueue.getActiveTask$okhttp() == null) {
            if (taskQueue.getFutureTasks$okhttp().isEmpty() ^ true) {
                _UtilCommonKt.addIfAbsent(this.readyQueues, taskQueue);
            }
            else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        }
        else {
            this.backend.execute(this, this.runnable);
        }
    }
    
    public final TaskQueue newQueue() {
        synchronized (this) {
            final int n = this.nextQueueName++;
            monitorexit(this);
            return new TaskQueue(this, e.l((Object)n, "Q"));
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "", "nanoTime", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lcg2/j;", "coordinatorNotify", "nanos", "coordinatorWait", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "decorate", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public interface Backend
    {
        void coordinatorNotify(final TaskRunner p0);
        
        void coordinatorWait(final TaskRunner p0, final long p1);
        
         <T> BlockingQueue<T> decorate(final BlockingQueue<T> p0);
        
        void execute(final TaskRunner p0, final Runnable p1);
        
        long nanoTime();
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final Logger getLogger() {
            return TaskRunner.access$getLogger$cp();
        }
    }
}
