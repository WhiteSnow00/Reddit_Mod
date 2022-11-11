// 
// Decompiled by Procyon v0.6.0
// 

package wc2;

import oc2.g;
import java.net.ProtocolException;
import java.io.Closeable;
import mc2.a;
import lc2.d;
import com.sendbird.android.shadow.okhttp3.internal.Internal;
import lc2.a0;
import lc2.v;
import lc2.w;
import lc2.e;

public final class b implements e
{
    public final /* synthetic */ w a;
    public final /* synthetic */ c b;
    
    public b(final c b, final w a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final v v, a0 string) {
        try {
            this.b.a(string);
            final g streamAllocation = Internal.instance.streamAllocation((d)v);
            streamAllocation.f();
            final oc2.d b = streamAllocation.b();
            final oc2.c c = new oc2.c((xc2.e)b.i, (xc2.d)b.j, streamAllocation);
            try {
                final c b2 = this.b;
                b2.b.B0(b2, string);
                string = (a0)new StringBuilder();
                ((StringBuilder)string).append("OkHttp WebSocket ");
                ((StringBuilder)string).append(this.a.a.n());
                string = (a0)((StringBuilder)string).toString();
                this.b.d((String)string, c);
                streamAllocation.b().e.setSoTimeout(0);
                this.b.e();
            }
            catch (final Exception ex) {
                this.b.c(ex, null);
            }
        }
        catch (final ProtocolException ex2) {
            this.b.c(ex2, string);
            mc2.a.e((Closeable)string);
        }
    }
}
