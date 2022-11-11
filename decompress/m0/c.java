// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import sg2.e;
import o1.b0;
import q1.a;
import o1.p;
import o1.w;

public final class c
{
    public w a;
    public p b;
    public a c;
    public b0 d;
    
    public c() {
        this(0);
    }
    
    public c(final int n) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
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
        return e.a((Object)this.a, (Object)c.a) && e.a((Object)this.b, (Object)c.b) && e.a((Object)this.c, (Object)c.c) && e.a((Object)this.d, (Object)c.d);
    }
    
    @Override
    public final int hashCode() {
        final w a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final p b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final a c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final b0 d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("BorderCache(imageBitmap=");
        r.append(this.a);
        r.append(", canvas=");
        r.append(this.b);
        r.append(", canvasDrawScope=");
        r.append(this.c);
        r.append(", borderPath=");
        r.append(this.d);
        r.append(')');
        return r.toString();
    }
}
