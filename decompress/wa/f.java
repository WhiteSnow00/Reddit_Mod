// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.source.n$b;
import com.google.android.exoplayer2.source.d$a;
import sg.j;

public final class f implements j
{
    public final int f;
    public final Object g;
    
    public f(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object get() {
        switch (this.f) {
            default: {
                final d$a d$a = (d$a)this.g;
                return new n$b(d$a.a, d$a.b);
            }
            case 0: {
                return this.g;
            }
        }
    }
}
