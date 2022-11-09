// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import com.google.android.exoplayer2.v;

public final class w implements n
{
    public final c f;
    public boolean g;
    public long h;
    public long i;
    public v j;
    
    public w(final c f) {
        this.f = f;
        this.j = v.i;
    }
    
    public final void a(final long h) {
        this.h = h;
        if (this.g) {
            this.i = this.f.d();
        }
    }
    
    @Override
    public final v c() {
        return this.j;
    }
    
    @Override
    public final void e(final v j) {
        if (this.g) {
            this.a(this.u());
        }
        this.j = j;
    }
    
    @Override
    public final long u() {
        long h = this.h;
        if (this.g) {
            final long n = this.f.d() - this.i;
            final v j = this.j;
            long i;
            if (j.f == 1.0f) {
                i = c0.J(n);
            }
            else {
                i = n * j.h;
            }
            h += i;
        }
        return h;
    }
}
