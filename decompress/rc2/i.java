// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import od.g0;

public final class i extends g0
{
    public final /* synthetic */ int h;
    public final /* synthetic */ e i;
    
    public i(final e i, final Object[] array, final int h, final ErrorCode errorCode) {
        this.i = i;
        this.h = h;
        super("OkHttp %s Push Reset[%s]", array);
    }
    
    @Override
    public final void a() {
        this.i.o.getClass();
        synchronized (this.i) {
            this.i.x.remove(this.h);
        }
    }
}
