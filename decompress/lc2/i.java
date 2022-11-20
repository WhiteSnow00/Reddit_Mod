// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import gc2.a;

public final class i extends a
{
    public final int g;
    public final e h;
    
    public i(final e h, final Object[] array, final int g, final ErrorCode errorCode) {
        this.h = h;
        this.g = g;
        super("OkHttp %s Push Reset[%s]", array);
    }
    
    @Override
    public final void a() {
        this.h.o.getClass();
        synchronized (this.h) {
            this.h.x.remove(this.g);
        }
    }
}
