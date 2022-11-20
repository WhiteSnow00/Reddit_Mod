// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import mc2.f;
import gc2.a;

public final class j extends a
{
    public final n g;
    public final e.f h;
    
    public j(final e.f h, final Object[] array, final n g) {
        this.h = h;
        this.g = g;
        super("OkHttp %s stream %d", array);
    }
    
    @Override
    public final void a() {
        try {
            this.h.h.g.b(this.g);
            return;
        }
        catch (final IOException ex) {
            final f a = mc2.f.a;
            final StringBuilder t = a.t("Http2Connection.Listener failure for ");
            t.append(this.h.h.i);
            a.l(4, t.toString(), ex);
            final j j = this;
            final n n = j.g;
            final ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            n.c(errorCode);
        }
        try {
            final j j = this;
            final n n = j.g;
            final ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            n.c(errorCode);
        }
        catch (final IOException ex2) {}
    }
}
