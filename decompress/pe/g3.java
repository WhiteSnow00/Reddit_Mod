// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import lw0.b;
import java.io.IOException;
import java.util.Map;

public final class g3 implements Runnable
{
    public final f3 f;
    public final int g;
    public final Throwable h;
    public final byte[] i;
    public final String j;
    public final Map k;
    
    @Override
    public final void run() {
        this.f.w(this.j, this.g, this.h, this.i, this.k);
    }
}
