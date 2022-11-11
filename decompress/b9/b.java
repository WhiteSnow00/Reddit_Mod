// 
// Decompiled by Procyon v0.6.0
// 

package b9;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import r8.d;
import j8.a$a;

public final class b implements a$a
{
    public final d a;
    public final r8.b b;
    
    public b(final r8.b b, final d a) {
        this.a = a;
        this.b = b;
    }
    
    public final byte[] a(final int n) {
        final r8.b b = this.b;
        if (b == null) {
            return new byte[n];
        }
        return (byte[])b.b((Class)byte[].class, n);
    }
    
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return this.a.getDirty(n, n2, bitmap$Config);
    }
    
    public final void c(final Bitmap bitmap) {
        this.a.put(bitmap);
    }
    
    public final int[] d(final int n) {
        final r8.b b = this.b;
        if (b == null) {
            return new int[n];
        }
        return (int[])b.b((Class)int[].class, n);
    }
    
    public final void e(final byte[] array) {
        final r8.b b = this.b;
        if (b == null) {
            return;
        }
        b.a((Object)array);
    }
    
    public final void f(final int[] array) {
        final r8.b b = this.b;
        if (b == null) {
            return;
        }
        b.a((Object)array);
    }
}
