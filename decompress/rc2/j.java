// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import sc2.f;
import od.g0;

public final class j extends g0
{
    public final /* synthetic */ n h;
    public final /* synthetic */ e.f i;
    
    public j(final e.f i, final Object[] array, final n h) {
        this.i = i;
        this.h = h;
        super("OkHttp %s stream %d", array);
    }
    
    @Override
    public final void a() {
        try {
            this.i.i.g.b(this.h);
            return;
        }
        catch (final IOException ex) {
            final f a = sc2.f.a;
            final StringBuilder r = a.r("Http2Connection.Listener failure for ");
            r.append(this.i.i.i);
            a.l(4, r.toString(), (Throwable)ex);
            final j j = this;
            final n n = j.h;
            final ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            n.c(errorCode);
        }
        try {
            final j j = this;
            final n n = j.h;
            final ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            n.c(errorCode);
        }
        catch (final IOException ex2) {}
    }
}
