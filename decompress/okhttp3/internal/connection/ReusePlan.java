// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\u0010" }, d2 = { "Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "connection", "Lokhttp3/internal/connection/RealConnection;", "(Lokhttp3/internal/connection/RealConnection;)V", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "isReady", "", "()Z", "cancel", "", "connectTcp", "connectTlsEtc", "handleSuccess", "retry", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class ReusePlan implements Plan
{
    private final RealConnection connection;
    private final boolean isReady;
    
    public ReusePlan(final RealConnection connection) {
        e.f((Object)connection, "connection");
        this.connection = connection;
        this.isReady = true;
    }
    
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }
    
    @Override
    public /* bridge */ void cancel() {
        this.cancel();
    }
    
    public Void connectTcp() {
        throw new IllegalStateException("already connected".toString());
    }
    
    @Override
    public /* bridge */ ConnectResult connectTcp() {
        return (ConnectResult)this.connectTcp();
    }
    
    public Void connectTlsEtc() {
        throw new IllegalStateException("already connected".toString());
    }
    
    @Override
    public /* bridge */ ConnectResult connectTlsEtc() {
        return (ConnectResult)this.connectTlsEtc();
    }
    
    public final RealConnection getConnection() {
        return this.connection;
    }
    
    @Override
    public RealConnection handleSuccess() {
        return this.connection;
    }
    
    @Override
    public boolean isReady() {
        return this.isReady;
    }
    
    public Void retry() {
        throw new IllegalStateException("unexpected retry".toString());
    }
    
    @Override
    public /* bridge */ Plan retry() {
        return (Plan)this.retry();
    }
}
