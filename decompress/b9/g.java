// 
// Decompiled by Procyon v0.6.0
// 

package b9;

import q8.l;
import java.io.IOException;
import r8.d;
import android.graphics.Bitmap;
import j8.a;
import o8.h;

public final class g implements h<a, Bitmap>
{
    public final d a;
    
    public g(final d a) {
        this.a = a;
    }
    
    @Override
    public final l b(final Object o, final int n, final int n2, final o8.g g) throws IOException {
        return (l)x8.d.b(this.a, ((a)o).getNextFrame());
    }
}
