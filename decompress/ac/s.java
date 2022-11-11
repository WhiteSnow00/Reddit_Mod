// 
// Decompiled by Procyon v0.6.0
// 

package ac;

import ad.d0;
import com.google.android.exoplayer2.source.p;
import ra.n;
import ad.f;
import android.util.SparseArray;

public final class s<V>
{
    public int a;
    public final SparseArray<V> b;
    public final f<V> c;
    
    public s(final n c) {
        this.b = (SparseArray<V>)new SparseArray();
        this.c = c;
        this.a = -1;
    }
    
    public final void a(final int n, final p.b b) {
        final int a = this.a;
        final boolean b2 = false;
        if (a == -1) {
            d0.f(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            final SparseArray<V> b3 = this.b;
            final int key = b3.keyAt(b3.size() - 1);
            boolean b4 = b2;
            if (n >= key) {
                b4 = true;
            }
            d0.c(b4);
            if (key == n) {
                final f<V> c = this.c;
                final SparseArray<V> b5 = this.b;
                c.accept((V)b5.valueAt(b5.size() - 1));
            }
        }
        this.b.append(n, (Object)b);
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
