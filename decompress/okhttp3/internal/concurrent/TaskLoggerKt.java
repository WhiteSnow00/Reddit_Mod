// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.concurrent;

import java.util.logging.Level;
import ng2.e;
import java.util.Arrays;
import m5.a;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a.\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u00f8\u0001\u0000\u001a;\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\b\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013" }, d2 = { "Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lcg2/j;", "taskLog", "T", "block", "logElapsed", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lmg2/a;)Ljava/lang/Object;", "message", "log", "", "ns", "formatDuration", "okhttp" }, k = 2, mv = { 1, 6, 0 })
public final class TaskLoggerKt
{
    public static final void access$log(final Logger logger, final Task task, final TaskQueue taskQueue, final String s) {
        log(logger, task, taskQueue, s);
    }
    
    public static final String formatDuration(final long n) {
        String s;
        if (n <= -999500000L) {
            final StringBuilder sb = new StringBuilder();
            sb.append((n - 500000000) / 1000000000);
            sb.append(" s ");
            s = sb.toString();
        }
        else if (n <= -999500L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append((n - 500000) / 1000000);
            sb2.append(" ms");
            s = sb2.toString();
        }
        else if (n <= 0L) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append((n - 500) / 1000);
            sb3.append(" µs");
            s = sb3.toString();
        }
        else if (n < 999500L) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append((n + 500) / 1000);
            sb4.append(" µs");
            s = sb4.toString();
        }
        else if (n < 999500000L) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append((n + 500000) / 1000000);
            sb5.append(" ms");
            s = sb5.toString();
        }
        else {
            final StringBuilder sb6 = new StringBuilder();
            sb6.append((n + 500000000) / 1000000000);
            sb6.append(" s ");
            s = sb6.toString();
        }
        return a.k(new Object[] { s }, 1, "%6s", "format(format, *args)");
    }
    
    private static final void log(final Logger logger, final Task task, final TaskQueue taskQueue, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        final String format = String.format("%-22s", Arrays.copyOf(new Object[] { s }, 1));
        e.e((Object)format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }
    
    public static final <T> T logElapsed(final Logger logger, final Task task, final TaskQueue taskQueue, final mg2.a<? extends T> a) {
        e.f((Object)logger, "<this>");
        e.f((Object)task, "task");
        e.f((Object)taskQueue, "queue");
        e.f((Object)a, "block");
        final boolean loggable = logger.isLoggable(Level.FINE);
        long nanoTime;
        if (loggable) {
            nanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            access$log(logger, task, taskQueue, "starting");
        }
        else {
            nanoTime = -1L;
        }
        try {
            final Object invoke = a.invoke();
            if (loggable) {
                access$log(logger, task, taskQueue, e.l((Object)formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - nanoTime), "finished run in "));
            }
            return (T)invoke;
        }
        finally {
            if (loggable) {
                access$log(logger, task, taskQueue, e.l((Object)formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - nanoTime), "failed a run in "));
            }
        }
    }
    
    public static final void taskLog(final Logger logger, final Task task, final TaskQueue taskQueue, final mg2.a<String> a) {
        e.f((Object)logger, "<this>");
        e.f((Object)task, "task");
        e.f((Object)taskQueue, "queue");
        e.f((Object)a, "messageBlock");
        if (logger.isLoggable(Level.FINE)) {
            access$log(logger, task, taskQueue, (String)a.invoke());
        }
    }
}
