// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import bd.d0;
import com.google.android.exoplayer2.source.p$b;
import sa.m;
import bd.f;
import android.util.SparseArray;

public final class s<V>
{
    public int a;
    public final SparseArray<V> b;
    public final f<V> c;
    
    public s(final m c) {
        this.b = (SparseArray<V>)new SparseArray();
        this.c = (f<V>)c;
        this.a = -1;
    }
    
    public final void a(final int n, final p$b p$b) {
        final int a = this.a;
        final boolean b = false;
        if (a == -1) {
            d0.f(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            final SparseArray<V> b2 = this.b;
            final int key = b2.keyAt(b2.size() - 1);
            boolean b3 = b;
            if (n >= key) {
                b3 = true;
            }
            d0.c(b3);
            if (key == n) {
                final f<V> c = this.c;
                final SparseArray<V> b4 = this.b;
                c.accept((V)b4.valueAt(b4.size() - 1));
            }
        }
        this.b.append(n, (Object)p$b);
    }
    
    public final V b(final int n) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            final int a = this.a;
            if (a <= 0 || n >= this.b.keyAt(a)) {
                break;
            }
            --this.a;
        }
        while (this.a < this.b.size() - 1 && n >= this.b.keyAt(this.a + 1)) {
            ++this.a;
        }
        return (V)this.b.valueAt(this.a);
    }
}
