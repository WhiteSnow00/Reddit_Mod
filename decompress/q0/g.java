// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import java.util.NoSuchElementException;
import a1.e;

public final class g
{
    public final e<a> a;
    
    public g() {
        this.a = new e<a>(new a[16]);
    }
    
    public final int a() {
        final e<a> a = this.a;
        if (!a.j()) {
            final T[] f = (T[])a.f;
            int n = 0;
            int b = ((a)f[0]).b;
            final e<a> a2 = this.a;
            final int h = a2.h;
            int n2 = b;
            if (h > 0) {
                final a[] f2 = a2.f;
                int n3;
                do {
                    final int b2 = f2[n].b;
                    if (b2 > (n2 = b)) {
                        n2 = b2;
                    }
                    n3 = n + 1;
                    b = n2;
                } while ((n = n3) < h);
            }
            return n2;
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }
    
    public final int b() {
        final e<a> a = this.a;
        if (a.j()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        final a[] f = a.f;
        final int n = 0;
        int a2 = f[0].a;
        final e<a> a3 = this.a;
        final int h = a3.h;
        int n2 = a2;
        if (h > 0) {
            final a[] f2 = a3.f;
            int n3 = 0;
            int n4;
            do {
                final int a4 = f2[n3].a;
                if (a4 < (n2 = a2)) {
                    n2 = a4;
                }
                n4 = n3 + 1;
                a2 = n2;
            } while ((n3 = n4) < h);
        }
        int n5 = n;
        if (n2 >= 0) {
            n5 = 1;
        }
        if (n5 != 0) {
            return n2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        
        public a(int a, final int b) {
            this.a = a;
            this.b = b;
            final int n = 1;
            if (a < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (b >= a) {
                a = n;
            }
            else {
                a = 0;
            }
            if (a != 0) {
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.b) + Integer.hashCode(this.a) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("Interval(start=");
            k.append(this.a);
            k.append(", end=");
            return d.k(k, this.b, ')');
        }
    }
}
