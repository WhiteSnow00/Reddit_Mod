// 
// Decompiled by Procyon v0.6.0
// 

package pc;

import s6.j;
import s6.k;
import s6.a;
import java.util.ArrayList;
import java.util.List;
import w6.i;
import nc.f;

public final class c implements f, i
{
    public List f;
    
    public c() {
        this.f = new ArrayList(2);
    }
    
    public c(final List f) {
        this.f = f;
    }
    
    @Override
    public long a(final int n) {
        return 0L;
    }
    
    @Override
    public a b() {
        if (this.f.get(0).c()) {
            return (a)new k(this.f);
        }
        return (a)new j(this.f);
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
    
    @Override
    public List f() {
        return this.f;
    }
    
    @Override
    public boolean h() {
        final int size = this.f.size();
        boolean b = false;
        if (size == 1) {
            b = b;
            if (this.f.get(0).c()) {
                b = true;
            }
        }
        return b;
    }
}
