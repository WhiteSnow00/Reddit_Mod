// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import b5.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import okhttp3.HttpUrl;
import java.io.IOException;
import okhttp3.Address;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/connection/RoutePlanner;", "", "address", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "hasNext", "", "failedConnection", "Lokhttp3/internal/connection/RealConnection;", "isCanceled", "plan", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "ConnectResult", "Plan", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public interface RoutePlanner
{
    Address getAddress();
    
    boolean hasNext(final RealConnection p0);
    
    boolean isCanceled();
    
    Plan plan() throws IOException;
    
    boolean sameHostAndPort(final HttpUrl p0);
    
    @Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "", "plan", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "nextPlan", "throwable", "", "(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/RoutePlanner$Plan;Ljava/lang/Throwable;)V", "isSuccess", "", "()Z", "getNextPlan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "getPlan", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class ConnectResult
    {
        private final Plan nextPlan;
        private final Plan plan;
        private final Throwable throwable;
        
        public ConnectResult(final Plan plan, final Plan nextPlan, final Throwable throwable) {
            e.f((Object)plan, "plan");
            this.plan = plan;
            this.nextPlan = nextPlan;
            this.throwable = throwable;
        }
        
        public ConnectResult(final Plan plan, Plan plan2, Throwable t, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x2) != 0x0) {
                plan2 = null;
            }
            if ((n & 0x4) != 0x0) {
                t = null;
            }
            this(plan, plan2, t);
        }
        
        public static ConnectResult copy$default(final ConnectResult connectResult, Plan plan, Plan nextPlan, Throwable throwable, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                plan = connectResult.plan;
            }
            if ((n & 0x2) != 0x0) {
                nextPlan = connectResult.nextPlan;
            }
            if ((n & 0x4) != 0x0) {
                throwable = connectResult.throwable;
            }
            return connectResult.copy(plan, nextPlan, throwable);
        }
        
        public final Plan component1() {
            return this.plan;
        }
        
        public final Plan component2() {
            return this.nextPlan;
        }
        
        public final Throwable component3() {
            return this.throwable;
        }
        
        public final ConnectResult copy(final Plan plan, final Plan plan2, final Throwable t) {
            e.f((Object)plan, "plan");
            return new ConnectResult(plan, plan2, t);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ConnectResult)) {
                return false;
            }
            final ConnectResult connectResult = (ConnectResult)o;
            return e.a((Object)this.plan, (Object)connectResult.plan) && e.a((Object)this.nextPlan, (Object)connectResult.nextPlan) && e.a((Object)this.throwable, (Object)connectResult.throwable);
        }
        
        public final Plan getNextPlan() {
            return this.nextPlan;
        }
        
        public final Plan getPlan() {
            return this.plan;
        }
        
        public final Throwable getThrowable() {
            return this.throwable;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.plan.hashCode();
            final Plan nextPlan = this.nextPlan;
            int hashCode2 = 0;
            int hashCode3;
            if (nextPlan == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = nextPlan.hashCode();
            }
            final Throwable throwable = this.throwable;
            if (throwable != null) {
                hashCode2 = throwable.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        public final boolean isSuccess() {
            return this.nextPlan == null && this.throwable == null;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("ConnectResult(plan=");
            t.append(this.plan);
            t.append(", nextPlan=");
            t.append(this.nextPlan);
            t.append(", throwable=");
            return k.m(t, this.throwable, ')');
        }
    }
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public static final class DefaultImpls
    {
        public static boolean hasNext$default(final RoutePlanner routePlanner, RealConnection realConnection, final int n, final Object o) {
            if (o == null) {
                if ((n & 0x1) != 0x0) {
                    realConnection = null;
                }
                return routePlanner.hasNext(realConnection);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0007H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "connectTlsEtc", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "Lcg2/j;", "cancel", "retry", "", "isReady", "()Z", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public interface Plan
    {
        void cancel();
        
        ConnectResult connectTcp();
        
        ConnectResult connectTlsEtc();
        
        RealConnection handleSuccess();
        
        boolean isReady();
        
        Plan retry();
    }
}
