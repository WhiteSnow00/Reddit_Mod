// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import xd.a;
import java.io.IOException;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lokhttp3/internal/connection/SequentialExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "routePlanner", "Lokhttp3/internal/connection/RoutePlanner;", "(Lokhttp3/internal/connection/RoutePlanner;)V", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "find", "Lokhttp3/internal/connection/RealConnection;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class SequentialExchangeFinder implements ExchangeFinder
{
    private final RoutePlanner routePlanner;
    
    public SequentialExchangeFinder(final RoutePlanner routePlanner) {
        e.f((Object)routePlanner, "routePlanner");
        this.routePlanner = routePlanner;
    }
    
    @Override
    public RealConnection find() {
        Object o = null;
        Throwable t = null;
        while (!this.getRoutePlanner().isCanceled()) {
            Object component2 = null;
            Label_0042: {
                if (o != null) {
                    component2 = null;
                    final Object plan = o;
                    o = component2;
                    break Label_0042;
                }
                try {
                    final Object plan = this.getRoutePlanner().plan();
                    component2 = o;
                    Object o2 = o;
                    try {
                        if (!((RoutePlanner.Plan)plan).isReady()) {
                            o2 = o;
                            RoutePlanner.ConnectResult connectResult2;
                            final RoutePlanner.ConnectResult connectResult = connectResult2 = ((RoutePlanner.Plan)plan).connectTcp();
                            o2 = o;
                            if (connectResult.isSuccess()) {
                                o2 = o;
                                connectResult2 = ((RoutePlanner.Plan)plan).connectTlsEtc();
                            }
                            o2 = o;
                            component2 = connectResult2.component2();
                            o2 = o;
                            o = connectResult2.component3();
                            if (o == null) {
                                if (component2 != null) {
                                    o = component2;
                                    continue;
                                }
                            }
                            else {
                                try {
                                    throw o;
                                }
                                catch (IOException o) {
                                    o2 = component2;
                                    component2 = o;
                                    o = o2;
                                    break Label_0042;
                                }
                            }
                        }
                        o2 = component2;
                        o = ((RoutePlanner.Plan)plan).handleSuccess();
                        return (RealConnection)o;
                    }
                    catch (final IOException component2) {
                        o = o2;
                    }
                }
                catch (final IOException ex) {}
            }
            if (t == null) {
                t = (Throwable)component2;
            }
            else {
                a.t(t, (Throwable)component2);
            }
            if (o == null && !RoutePlanner.DefaultImpls.hasNext$default(this.getRoutePlanner(), null, 1, null)) {
                throw t;
            }
        }
        throw new IOException("Canceled");
    }
    
    @Override
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}
