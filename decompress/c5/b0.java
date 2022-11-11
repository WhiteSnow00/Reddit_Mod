// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import androidx.paging.LoadType;

public abstract class b0
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public b0(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int a(final LoadType loadType) {
        e.f((Object)loadType, "loadType");
        final int n = b0.c.a[loadType.ordinal()];
        if (n != 1) {
            int n2;
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n2 = this.b;
            }
            else {
                n2 = this.a;
            }
            return n2;
        }
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof b0)) {
            return false;
        }
        final int a = this.a;
        final b0 b2 = (b0)o;
        if (a != b2.a || this.b != b2.b || this.c != b2.c || this.d != b2.d) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) + (Integer.hashCode(this.b) + Integer.hashCode(this.a)));
    }
    
    public static final class a extends b0
    {
        public final int e;
        public final int f;
        
        public a(final int e, final int f, final int n, final int n2, final int n3, final int n4) {
            super(n, n2, n3, n4);
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final int e = this.e;
            final a a = (a)o;
            if (e != a.e || this.f != a.f || super.a != a.a || super.b != a.b || super.c != a.c || super.d != a.d) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.f) + (Integer.hashCode(this.e) + super.hashCode());
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("ViewportHint.Access(\n            |    pageOffset=");
            r.append(this.e);
            r.append(",\n            |    indexInPage=");
            r.append(this.f);
            r.append(",\n            |    presentedItemsBefore=");
            r.append(super.a);
            r.append(",\n            |    presentedItemsAfter=");
            r.append(super.b);
            r.append(",\n            |    originalPageOffsetFirst=");
            r.append(super.c);
            r.append(",\n            |    originalPageOffsetLast=");
            r.append(super.d);
            r.append(",\n            |)");
            return kotlin.text.a.y0(r.toString());
        }
    }
    
    public static final class b extends b0
    {
        public b(final int n, final int n2, final int n3, final int n4) {
            super(n, n2, n3, n4);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("ViewportHint.Initial(\n            |    presentedItemsBefore=");
            r.append(super.a);
            r.append(",\n            |    presentedItemsAfter=");
            r.append(super.b);
            r.append(",\n            |    originalPageOffsetFirst=");
            r.append(super.c);
            r.append(",\n            |    originalPageOffsetLast=");
            r.append(super.d);
            r.append(",\n            |)");
            return kotlin.text.a.y0(r.toString());
        }
    }
}
