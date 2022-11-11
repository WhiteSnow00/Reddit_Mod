// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.u;
import sg2.e;
import c2.h;
import c2.a;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import c2.d0;
import androidx.compose.ui.platform.o0;

public abstract class e0 extends o0 implements d0
{
    public e0(final l l) {
        super(l);
    }
    
    public static final class a extends e0
    {
        public final c2.a g;
        
        public a(final h g, final l l) {
            e.f((Object)l, "inspectorInfo");
            super(l);
            this.g = g;
        }
        
        public final Object B0(final u u, Object o) {
            e.f((Object)u, "<this>");
            b0 b0;
            if (o instanceof b0) {
                b0 = (b0)o;
            }
            else {
                b0 = null;
            }
            o = b0;
            if (b0 == null) {
                o = new b0(0);
            }
            final int a = k.a;
            ((b0)o).c = (k)new k$a(new b.a(this.g));
            return o;
        }
        
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            a a;
            if (o instanceof a) {
                a = (a)o;
            }
            else {
                a = null;
            }
            return a != null && e.a((Object)this.g, (Object)a.g);
        }
        
        public final int hashCode() {
            return this.g.hashCode();
        }
        
        public final String toString() {
            final StringBuilder r = a.r("WithAlignmentLine(line=");
            r.append(this.g);
            r.append(')');
            return r.toString();
        }
    }
}
