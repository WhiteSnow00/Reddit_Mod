// 
// Decompiled by Procyon v0.6.0
// 

package q82;

import gg2.c;

public interface e
{
    Object a(final c<? super a> p0);
    
    public static final class a
    {
        public final int a;
        public final boolean b;
        
        public a() {
            this(0, false);
        }
        
        public a(final int a, final boolean b) {
            this.a = a;
            this.b = b;
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
            final int hashCode = Integer.hashCode(this.a);
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            return hashCode * 31 + b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("VaultDrawerInfo(eligibleClaimCount=");
            t.append(this.a);
            t.append(", displaySecureVaultWarning=");
            return d.n(t, this.b, ')');
        }
    }
}
