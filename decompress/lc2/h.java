// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import gc2.a;

public final class h extends a
{
    public final int g;
    public final com.sendbird.android.shadow.okio.a h;
    public final int i;
    public final e j;
    
    public h(final e j, final Object[] array, final int g, final com.sendbird.android.shadow.okio.a h, final int i, final boolean b) {
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
        super("OkHttp %s Push Data[%s]", array);
    }
    
    @Override
    public final void a() {
        try {
            final q o = this.j.o;
            final com.sendbird.android.shadow.okio.a h = this.h;
            final int i = this.i;
            o.getClass();
            h.skip((long)i);
            this.j.v.l(this.g, ErrorCode.CANCEL);
            synchronized (this.j) {
                this.j.x.remove(this.g);
            }
        }
        catch (final IOException ex) {}
    }
}
