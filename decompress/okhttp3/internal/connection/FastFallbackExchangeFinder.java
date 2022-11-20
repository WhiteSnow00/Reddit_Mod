// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import java.util.Collection;
import xd.a;
import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal._UtilJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import ng2.e;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.concurrent.TaskRunner;
import dg2.h;
import java.util.concurrent.BlockingQueue;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "Lokhttp3/internal/connection/FastFallbackExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "launchTcpConnect", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitTcpConnect", "Lcg2/j;", "cancelInFlightConnects", "Lokhttp3/internal/connection/RealConnection;", "find", "Lokhttp3/internal/connection/RoutePlanner;", "routePlanner", "Lokhttp3/internal/connection/RoutePlanner;", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectDelayNanos", "J", "nextTcpConnectAtNanos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "tcpConnectsInFlight", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/BlockingQueue;", "kotlin.jvm.PlatformType", "connectResults", "Ljava/util/concurrent/BlockingQueue;", "<init>", "(Lokhttp3/internal/connection/RoutePlanner;Lokhttp3/internal/concurrent/TaskRunner;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class FastFallbackExchangeFinder implements ExchangeFinder
{
    private final long connectDelayNanos;
    private final BlockingQueue<RoutePlanner.ConnectResult> connectResults;
    private final h<RoutePlanner.Plan> deferredPlans;
    private long nextTcpConnectAtNanos;
    private final RoutePlanner routePlanner;
    private final TaskRunner taskRunner;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> tcpConnectsInFlight;
    
    public FastFallbackExchangeFinder(final RoutePlanner routePlanner, final TaskRunner taskRunner) {
        e.f((Object)routePlanner, "routePlanner");
        e.f((Object)taskRunner, "taskRunner");
        this.routePlanner = routePlanner;
        this.taskRunner = taskRunner;
        this.connectDelayNanos = TimeUnit.MILLISECONDS.toNanos(250L);
        this.nextTcpConnectAtNanos = Long.MIN_VALUE;
        this.tcpConnectsInFlight = new CopyOnWriteArrayList<RoutePlanner.Plan>();
        this.deferredPlans = (h<RoutePlanner.Plan>)new h();
        this.connectResults = taskRunner.getBackend().decorate(new LinkedBlockingDeque<RoutePlanner.ConnectResult>());
    }
    
    public static final BlockingQueue access$getConnectResults$p(final FastFallbackExchangeFinder fastFallbackExchangeFinder) {
        return fastFallbackExchangeFinder.connectResults;
    }
    
    public static final CopyOnWriteArrayList access$getTcpConnectsInFlight$p(final FastFallbackExchangeFinder fastFallbackExchangeFinder) {
        return fastFallbackExchangeFinder.tcpConnectsInFlight;
    }
    
    private final RoutePlanner.ConnectResult awaitTcpConnect(final long n, final TimeUnit timeUnit) {
        if (this.tcpConnectsInFlight.isEmpty()) {
            return null;
        }
        final RoutePlanner.ConnectResult connectResult = this.connectResults.poll(n, timeUnit);
        if (connectResult == null) {
            return null;
        }
        this.tcpConnectsInFlight.remove(connectResult.getPlan());
        return connectResult;
    }
    
    private final void cancelInFlightConnects() {
        for (final RoutePlanner.Plan plan : this.tcpConnectsInFlight) {
            plan.cancel();
            final RoutePlanner.Plan retry = plan.retry();
            if (retry == null) {
                continue;
            }
            ((Collection<RoutePlanner.Plan>)this.deferredPlans).add(retry);
        }
        this.tcpConnectsInFlight.clear();
    }
    
    private final RoutePlanner.ConnectResult launchTcpConnect() {
        Object o;
        if (((Collection)this.deferredPlans).isEmpty() ^ true) {
            o = this.deferredPlans.removeFirst();
        }
        else {
            if (!RoutePlanner.DefaultImpls.hasNext$default(this.getRoutePlanner(), null, 1, null)) {
                return null;
            }
            try {
                this.getRoutePlanner().plan();
            }
            finally {
                final Throwable t;
                o = new FailedPlan(t);
            }
        }
        if (((RoutePlanner.Plan)o).isReady()) {
            return new RoutePlanner.ConnectResult((RoutePlanner.Plan)o, null, null, 6, null);
        }
        if (o instanceof FailedPlan) {
            return ((FailedPlan)o).getResult();
        }
        this.tcpConnectsInFlight.add((FailedPlan)o);
        final StringBuilder sb = new StringBuilder();
        sb.append(_UtilJvmKt.okHttpName);
        sb.append(" connect ");
        sb.append(this.getRoutePlanner().getAddress().url().redact());
        TaskQueue.schedule$default(this.taskRunner.newQueue(), (Task)new FastFallbackExchangeFinder$launchTcpConnect.FastFallbackExchangeFinder$launchTcpConnect$1(sb.toString(), (RoutePlanner.Plan)o, this), 0L, 2, null);
        return null;
    }
    
    @Override
    public RealConnection find() {
        IOException ex = null;
        try {
            while ((this.tcpConnectsInFlight.isEmpty() ^ true) || (((Collection)this.deferredPlans).isEmpty() ^ true) || RoutePlanner.DefaultImpls.hasNext$default(this.getRoutePlanner(), null, 1, null)) {
                if (this.getRoutePlanner().isCanceled()) {
                    throw new IOException("Canceled");
                }
                final long nanoTime = this.taskRunner.getBackend().nanoTime();
                long connectDelayNanos = this.nextTcpConnectAtNanos - nanoTime;
                RoutePlanner.ConnectResult launchTcpConnect;
                if (!this.tcpConnectsInFlight.isEmpty() && connectDelayNanos > 0L) {
                    launchTcpConnect = null;
                }
                else {
                    launchTcpConnect = this.launchTcpConnect();
                    connectDelayNanos = this.connectDelayNanos;
                    this.nextTcpConnectAtNanos = nanoTime + connectDelayNanos;
                }
                Object awaitTcpConnect = launchTcpConnect;
                if (launchTcpConnect == null && (awaitTcpConnect = this.awaitTcpConnect(connectDelayNanos, TimeUnit.NANOSECONDS)) == null) {
                    continue;
                }
                Object o = awaitTcpConnect;
                if (((RoutePlanner.ConnectResult)awaitTcpConnect).isSuccess()) {
                    this.cancelInFlightConnects();
                    Object connectTlsEtc = awaitTcpConnect;
                    if (!((RoutePlanner.ConnectResult)awaitTcpConnect).getPlan().isReady()) {
                        connectTlsEtc = ((RoutePlanner.ConnectResult)awaitTcpConnect).getPlan().connectTlsEtc();
                    }
                    o = connectTlsEtc;
                    if (((RoutePlanner.ConnectResult)connectTlsEtc).isSuccess()) {
                        return ((RoutePlanner.ConnectResult)connectTlsEtc).getPlan().handleSuccess();
                    }
                }
                final Throwable throwable = ((RoutePlanner.ConnectResult)o).getThrowable();
                IOException ex2 = ex;
                if (throwable != null) {
                    if (!(throwable instanceof IOException)) {
                        throw throwable;
                    }
                    if (ex == null) {
                        ex2 = (IOException)throwable;
                    }
                    else {
                        a.t((Throwable)ex, throwable);
                        ex2 = ex;
                    }
                }
                final RoutePlanner.Plan nextPlan = ((RoutePlanner.ConnectResult)o).getNextPlan();
                ex = ex2;
                if (nextPlan == null) {
                    continue;
                }
                this.deferredPlans.addFirst((Object)nextPlan);
                ex = ex2;
            }
            this.cancelInFlightConnects();
            e.c((Object)ex);
            throw ex;
        }
        finally {
            this.cancelInFlightConnects();
        }
    }
    
    @Override
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}
