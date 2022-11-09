// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import android.util.SparseBooleanArray;

public final class j
{
    public final SparseBooleanArray a;
    
    public j(final SparseBooleanArray a) {
        this.a = a;
    }
    
    public final int a(final int n) {
        d0.e(n, this.b());
        return this.a.keyAt(n);
    }
    
    public final int b() {
        return this.a.size();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        if (c0.a >= 24) {
            return this.a.equals((Object)j.a);
        }
        if (this.b() != j.b()) {
            return false;
        }
        for (int i = 0; i < this.b(); ++i) {
            if (this.a(i) != j.a(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        if (c0.a < 24) {
            int b = this.b();
            for (int i = 0; i < this.b(); ++i) {
                b = b * 31 + this.a(i);
            }
            return b;
        }
        return this.a.hashCode();
    }
    
    public static final class a
    {
        public final SparseBooleanArray a;
        public boolean b;
        
        public a() {
            this.a = new SparseBooleanArray();
        }
        
        public final void a(final int n) {
            d0.f(this.b ^ true);
            this.a.append(n, true);
        }
        
        public final j b() {
            d0.f(this.b ^ true);
            this.b = true;
            return new j(this.a);
        }
    }
}
