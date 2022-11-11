// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import od.g0;

public final class g extends g0
{
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ e j;
    
    public g(final e j, final Object[] array, final int h, final ArrayList i, final boolean b) {
        this.j = j;
        this.h = h;
        this.i = i;
        super("OkHttp %s Push Headers[%s]", array);
    }
    
    @Override
    public final void a() {
        this.j.o.getClass();
        try {
            this.j.v.j(this.h, ErrorCode.CANCEL);
            synchronized (this.j) {
                this.j.x.remove(this.h);
            }
        }
        catch (final IOException ex) {}
    }
}
