// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import s8.d;
import k8.a;

public final class b implements a
{
    public final d a;
    public final s8.b b;
    
    public b(final s8.b b, final d a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final byte[] a(final int n) {
        final s8.b b = this.b;
        if (b == null) {
            return new byte[n];
        }
        return (byte[])b.b(byte[].class, n);
    }
    
    @Override
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return this.a.getDirty(n, n2, bitmap$Config);
    }
    
    @Override
    public final void c(final Bitmap bitmap) {
        this.a.put(bitmap);
    }
    
    @Override
    public final int[] d(final int n) {
        final s8.b b = this.b;
        if (b == null) {
            return new int[n];
        }
        return (int[])b.b(int[].class, n);
    }
    
    @Override
    public final void e(final byte[] array) {
        final s8.b b = this.b;
        if (b == null) {
            return;
        }
        b.a(array);
    }
    
    @Override
    public final void f(final int[] array) {
        final s8.b b = this.b;
        if (b == null) {
            return;
        }
        b.a(array);
    }
}
