// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import android.content.Context;
import java.util.concurrent.Callable;

public final class g implements Callable<k.a>
{
    public final String f;
    public final Context g;
    public final f h;
    public final int i;
    
    public g(final String f, final Context g, final f h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Object call() throws Exception {
        return k.a(this.f, this.g, this.h, this.i);
    }
}
