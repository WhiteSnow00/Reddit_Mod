// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import q8.l;
import java.io.IOException;
import o8.g;
import r8.b;
import android.graphics.Bitmap;
import java.io.InputStream;
import o8.h;

public final class f implements h<InputStream, Bitmap>
{
    public final j a;
    
    public f(final j a, final b b) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Object o, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        this.a.getClass();
        g.a(j.e).booleanValue();
        return false;
    }
    
    @Override
    public final l b(final Object o, final int n, final int n2, final g g) throws IOException {
        return (l)this.a.a((InputStream)o, n, n2, g);
    }
}
