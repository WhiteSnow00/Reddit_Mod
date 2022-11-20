// 
// Decompiled by Procyon v0.6.0
// 

package qc;

import b7.g$a;
import b7.g;
import r6.t;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import nc.f;

public final class b implements f
{
    public final List f;
    
    public b(final int n) {
        if (n != 1) {
            this.f = new ArrayList();
            return;
        }
        this.f = new ArrayList();
    }
    
    public b(final List f) {
        this.f = f;
    }
    
    @Override
    public long a(final int n) {
        return 0L;
    }
    
    public void b(final Path path) {
        int size = this.f.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final t t = this.f.get(n);
            final g$a a = g.a;
            size = n;
            if (t == null) {
                continue;
            }
            if (t.a) {
                size = n;
            }
            else {
                g.a(path, t.d.l() / 100.0f, t.e.l() / 100.0f, t.f.l() / 360.0f);
                size = n;
            }
        }
    }
    
    @Override
    public int c() {
        return 1;
    }
    
    @Override
    public int d(final long n) {
        return -1;
    }
    
    @Override
    public List e(final long n) {
        return this.f;
    }
}
