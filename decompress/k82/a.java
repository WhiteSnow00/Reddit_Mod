// 
// Decompiled by Procyon v0.6.0
// 

package k82;

import ng2.e;

public abstract class a
{
    public final k82.b a;
    
    public a(final k82.b a) {
        this.a = a;
    }
    
    public static final class a extends k82.a
    {
        public final k82.b b;
        
        public a(final k82.b b) {
            super(b);
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e.a((Object)this.b, (Object)((a)o).b));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("Legacy(gasPrice=");
            t.append(this.b);
            t.append(')');
            return t.toString();
        }
    }
    
    public static final class b extends a
    {
        public final k82.b b;
        public final k82.b c;
        
        public b(final k82.b b, final k82.b c) {
            super(b);
            this.b = b;
            this.c = c;
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
            return e.a((Object)this.b, (Object)b.b) && e.a((Object)this.c, (Object)b.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + this.b.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("London(maxFeePerGas=");
            t.append(this.b);
            t.append(", maxPriorityFeePerGas=");
            t.append(this.c);
            t.append(')');
            return t.toString();
        }
    }
}
