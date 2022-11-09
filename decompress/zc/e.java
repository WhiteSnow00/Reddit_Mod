// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import bd.c0;
import com.google.android.exoplayer2.upstream.b;
import java.util.ArrayList;
import com.google.android.exoplayer2.upstream.a;

public abstract class e implements a
{
    public final boolean a;
    public final ArrayList<s> b;
    public int c;
    public b d;
    
    public e(final boolean a) {
        this.a = a;
        this.b = new ArrayList<s>(1);
    }
    
    public final void d(final s s) {
        s.getClass();
        if (!this.b.contains(s)) {
            this.b.add(s);
            ++this.c;
        }
    }
    
    public final void o(final int n) {
        final b d = this.d;
        final int a = c0.a;
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).d(d, this.a, n);
        }
    }
    
    public final void p() {
        final b d = this.d;
        final int a = c0.a;
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).e(d, this.a);
        }
        this.d = null;
    }
    
    public final void q(final b b) {
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).g();
        }
    }
    
    public final void r(final b d) {
        this.d = d;
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).b(d, this.a);
        }
    }
}
