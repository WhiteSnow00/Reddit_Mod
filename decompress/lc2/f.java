// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import gc2.a;

public final class f extends a
{
    public final int g;
    public final List h;
    public final e i;
    
    public f(final e i, final Object[] array, final int g, final ArrayList h) {
        this.i = i;
        this.g = g;
        this.h = h;
        super("OkHttp %s Push Request[%s]", array);
    }
    
    @Override
    public final void a() {
        this.i.o.getClass();
        try {
            this.i.v.l(this.g, ErrorCode.CANCEL);
            synchronized (this.i) {
                this.i.x.remove(this.g);
            }
        }
        catch (final IOException ex) {}
    }
}
