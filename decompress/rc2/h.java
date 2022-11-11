// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import com.sendbird.android.shadow.okio.a;
import od.g0;

public final class h extends g0
{
    public final /* synthetic */ int h;
    public final /* synthetic */ a i;
    public final /* synthetic */ int j;
    public final /* synthetic */ e k;
    
    public h(final e k, final Object[] array, final int h, final a i, final int j, final boolean b) {
        this.k = k;
        this.h = h;
        this.i = i;
        this.j = j;
        super("OkHttp %s Push Data[%s]", array);
    }
    
    @Override
    public final void a() {
        try {
            final q o = this.k.o;
            final a i = this.i;
            final int j = this.j;
            o.getClass();
            i.skip(j);
            this.k.v.j(this.h, ErrorCode.CANCEL);
            synchronized (this.k) {
                this.k.x.remove(this.h);
            }
        }
        catch (final IOException ex) {}
    }
}
