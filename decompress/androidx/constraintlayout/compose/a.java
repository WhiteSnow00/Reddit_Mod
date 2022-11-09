// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import ah2.f;
import java.util.ArrayList;

public abstract class a
{
    public final ArrayList a;
    public int b;
    public final int c;
    public int d;
    
    public a() {
        this.a = new ArrayList();
        this.c = 1000;
        this.d = 1000;
    }
    
    public final b a() {
        final int n = this.d++;
        this.a.add(new ConstraintLayoutBaseScope$createGuidelineFromTop$2(n, 0.0f));
        this.b = (this.b * 1009 + 8) % 1000000007;
        this.b = (this.b * 1009 + Float.hashCode(0.0f)) % 1000000007;
        return new b(n, 0);
    }
    
    public static final class a
    {
        public final Object a;
        
        public a(final Integer a) {
            f.f((Object)a, "id");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && f.a(this.a, ((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zu.a.b(a.k("BaselineAnchor(id="), this.a, ')');
        }
    }
    
    public static final class b
    {
        public final Object a;
        public final int b;
        
        public b(final Integer a, final int b) {
            f.f((Object)a, "id");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return f.a(this.a, b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.b) + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("HorizontalAnchor(id=");
            k.append(this.a);
            k.append(", index=");
            return d.k(k, this.b, ')');
        }
    }
    
    public static final class c
    {
        public final Object a;
        public final int b;
        
        public c(final Integer a, final int b) {
            f.f((Object)a, "id");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return f.a(this.a, c.a) && this.b == c.b;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.b) + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("VerticalAnchor(id=");
            k.append(this.a);
            k.append(", index=");
            return d.k(k, this.b, ')');
        }
    }
}
