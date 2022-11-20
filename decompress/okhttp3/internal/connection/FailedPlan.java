// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/connection/FailedPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "e", "", "(Ljava/lang/Throwable;)V", "isReady", "", "()Z", "result", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "getResult", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "cancel", "", "connectTcp", "connectTlsEtc", "handleSuccess", "retry", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class FailedPlan implements Plan
{
    private final boolean isReady;
    private final ConnectResult result;
    
    public FailedPlan(final Throwable t) {
        e.f((Object)t, "e");
        this.result = new RoutePlanner.ConnectResult(this, null, t, 2, null);
    }
    
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }
    
    @Override
    public /* bridge */ void cancel() {
        this.cancel();
    }
    
    @Override
    public ConnectResult connectTcp() {
        return this.result;
    }
    
    @Override
    public ConnectResult connectTlsEtc() {
        return this.result;
    }
    
    public final ConnectResult getResult() {
        return this.result;
    }
    
    public Void handleSuccess() {
        throw new IllegalStateException("unexpected call".toString());
    }
    
    @Override
    public /* bridge */ RealConnection handleSuccess() {
        return (RealConnection)this.handleSuccess();
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
