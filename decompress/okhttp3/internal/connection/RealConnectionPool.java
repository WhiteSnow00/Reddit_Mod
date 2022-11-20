// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import okhttp3.ConnectionPool;
import cg.d;
import java.util.Collection;
import okhttp3.internal.concurrent.Task;
import cg2.j;
import java.net.Socket;
import java.util.Iterator;
import okhttp3.Route;
import okhttp3.Address;
import java.util.List;
import okhttp3.internal.platform.Platform;
import java.lang.ref.Reference;
import okhttp3.internal._UtilJvmKt;
import ng2.e;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal.concurrent.TaskQueue;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001!\u0018\u0000 .2\u00020\u0001:\u0001.B'\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J8\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006/" }, d2 = { "Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/connection/RealConnection;", "connection", "", "now", "", "pruneAndGetAllocationCount", "idleConnectionCount", "connectionCount", "", "doExtensiveHealthChecks", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", "call", "", "Lokhttp3/Route;", "routes", "requireMultiplexed", "callAcquirePooledConnection", "Lcg2/j;", "put", "connectionBecameIdle", "evictAll", "cleanup", "maxIdleConnections", "I", "keepAliveDurationNs", "J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class RealConnectionPool
{
    public static final Companion Companion;
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask.RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    
    static {
        Companion = new Companion(null);
    }
    
    public RealConnectionPool(final TaskRunner taskRunner, int maxIdleConnections, final long n, final TimeUnit timeUnit) {
        e.f((Object)taskRunner, "taskRunner");
        e.f((Object)timeUnit, "timeUnit");
        this.maxIdleConnections = maxIdleConnections;
        this.keepAliveDurationNs = timeUnit.toNanos(n);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new RealConnectionPool$cleanupTask.RealConnectionPool$cleanupTask$1(this, e.l((Object)" ConnectionPool", _UtilJvmKt.okHttpName));
        this.connections = new ConcurrentLinkedQueue<RealConnection>();
        if (n > 0L) {
            maxIdleConnections = 1;
        }
        else {
            maxIdleConnections = 0;
        }
        if (maxIdleConnections != 0) {
            return;
        }
        throw new IllegalArgumentException(e.l((Object)n, "keepAliveDuration <= 0: ").toString());
    }
    
    private final int pruneAndGetAllocationCount(final RealConnection realConnection, final long n) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(realConnection);
            throw new AssertionError((Object)t.toString());
        }
        final List<Reference<RealCall>> calls = realConnection.getCalls();
        int i = 0;
        while (i < calls.size()) {
            final Reference reference = calls.get(i);
            if (reference.get() != null) {
                ++i;
            }
            else {
                final RealCall.CallReference callReference = (RealCall.CallReference)reference;
                final StringBuilder t2 = a.t("A connection to ");
                t2.append(realConnection.route().address().url());
                t2.append(" was leaked. Did you forget to close a response body?");
                Platform.Companion.get().logCloseableLeak(t2.toString(), callReference.getCallStackTrace());
                calls.remove(i);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs(n - this.keepAliveDurationNs);
                    return 0;
                }
                continue;
            }
        }
        return calls.size();
    }
    
    public final RealConnection callAcquirePooledConnection(final boolean b, final Address address, final RealCall realCall, final List<Route> list, final boolean b2) {
        e.f((Object)address, "address");
        e.f((Object)realCall, "call");
    Label_0074_Outer:
        for (RealConnection realConnection : this.connections) {
            e.e((Object)realConnection, "connection");
            monitorenter(realConnection);
            boolean b3 = false;
            while (true) {
                if (b2) {
                    try {
                        if (realConnection.isMultiplexed$okhttp()) {
                            if (realConnection.isEligible$okhttp(address, list)) {
                                realCall.acquireConnectionNoEvents(realConnection);
                                b3 = true;
                            }
                        }
                        monitorexit(realConnection);
                        if (!b3) {
                            continue Label_0074_Outer;
                        }
                        if (realConnection.isHealthy(b)) {
                            return realConnection;
                        }
                        synchronized (realConnection) {
                            realConnection.setNoNewExchanges(true);
                            final Socket releaseConnectionNoEvents$okhttp = realCall.releaseConnectionNoEvents$okhttp();
                            monitorexit(realConnection);
                            if (releaseConnectionNoEvents$okhttp == null) {
                                continue Label_0074_Outer;
                            }
                            _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                            continue Label_0074_Outer;
                        }
                    }
                    finally {
                        monitorexit(realConnection);
                    }
                    break;
                }
                continue;
            }
        }
        return null;
    }
    
    public final long cleanup(final long n) {
        final Iterator<RealConnection> iterator = this.connections.iterator();
        int n2 = 0;
        long n3 = Long.MIN_VALUE;
        final RealConnection realConnection = null;
        int n4 = 0;
        while (iterator.hasNext()) {
            final RealConnection realConnection2 = iterator.next();
            e.e((Object)realConnection2, "connection");
            synchronized (realConnection2) {
                if (this.pruneAndGetAllocationCount(realConnection2, n) > 0) {
                    ++n4;
                }
                else {
                    ++n2;
                    final long n5 = n - realConnection2.getIdleAtNs();
                    long n6 = n3;
                    if (n5 > n3) {
                        n6 = n5;
                    }
                    final j a = j.a;
                    n3 = n6;
                }
                continue;
            }
            break;
        }
        final long keepAliveDurationNs = this.keepAliveDurationNs;
        if (n3 < keepAliveDurationNs && n2 <= this.maxIdleConnections) {
            if (n2 > 0) {
                return keepAliveDurationNs - n3;
            }
            if (n4 > 0) {
                return keepAliveDurationNs;
            }
            return -1L;
        }
        else {
            e.c((Object)realConnection);
            synchronized (realConnection) {
                if (realConnection.getCalls().isEmpty() ^ true) {
                    return 0L;
                }
                if (realConnection.getIdleAtNs() + n3 != n) {
                    return 0L;
                }
                realConnection.setNoNewExchanges(true);
                this.connections.remove(realConnection);
                monitorexit(realConnection);
                _UtilJvmKt.closeQuietly(realConnection.socket());
                if (this.connections.isEmpty()) {
                    this.cleanupQueue.cancelAll();
                }
                return 0L;
            }
        }
    }
    
    public final boolean connectionBecameIdle(final RealConnection realConnection) {
        e.f((Object)realConnection, "connection");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(realConnection);
            throw new AssertionError((Object)t.toString());
        }
        final boolean noNewExchanges = realConnection.getNoNewExchanges();
        final boolean b = true;
        boolean b2;
        if (!noNewExchanges && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
            b2 = false;
        }
        else {
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            b2 = b;
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
                b2 = b;
            }
        }
        return b2;
    }
    
    public final int connectionCount() {
        return this.connections.size();
    }
    
    public final void evictAll() {
        final Iterator<RealConnection> iterator = this.connections.iterator();
        e.e((Object)iterator, "connections.iterator()");
        while (iterator.hasNext()) {
            final RealConnection realConnection = iterator.next();
            e.e((Object)realConnection, "connection");
            synchronized (realConnection) {
                Socket socket;
                if (realConnection.getCalls().isEmpty()) {
                    iterator.remove();
                    realConnection.setNoNewExchanges(true);
                    socket = realConnection.socket();
                }
                else {
                    socket = null;
                }
                monitorexit(realConnection);
                if (socket == null) {
                    continue;
                }
                _UtilJvmKt.closeQuietly(socket);
                continue;
            }
            break;
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }
    
    public final int idleConnectionCount() {
        final ConcurrentLinkedQueue<RealConnection> connections = this.connections;
        final boolean b = connections instanceof Collection;
        int n = 0;
        int n2 = 0;
        if (!b || !connections.isEmpty()) {
            final Iterator iterator = connections.iterator();
            while (true) {
                n = n2;
                if (iterator.hasNext()) {
                    final RealConnection realConnection = (RealConnection)iterator.next();
                    e.e((Object)realConnection, "it");
                    synchronized (realConnection) {
                        final boolean empty = realConnection.getCalls().isEmpty();
                        monitorexit(realConnection);
                        if (!empty) {
                            continue;
                        }
                        if (++n2 >= 0) {
                            continue;
                        }
                        d.Z3();
                        throw null;
                    }
                    break;
                }
                break;
            }
        }
        return n;
    }
    
    public final void put(final RealConnection realConnection) {
        e.f((Object)realConnection, "connection");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(realConnection);
            throw new AssertionError((Object)t.toString());
        }
        this.connections.add(realConnection);
        TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final RealConnectionPool get(final ConnectionPool connectionPool) {
            e.f((Object)connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }
}
