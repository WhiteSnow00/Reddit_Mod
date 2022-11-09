// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import java.io.IOException;
import r8.l;
import s8.d;
import android.graphics.Bitmap;
import k8.a;
import p8.h;

public final class g implements h<a, Bitmap>
{
    public final d a;
    
    public g(final d a) {
        this.a = a;
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final p8.g g) throws IOException {
        return y8.d.b(this.a, ((a)o).getNextFrame());
    }
}
