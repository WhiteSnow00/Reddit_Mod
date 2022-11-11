// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import a81.e;

public final class b implements d
{
    public final int a;
    public final int b;
    
    public b(final int a, final int b) {
        this.a = a;
        this.b = b;
        if (a >= 0 && b >= 0) {
            return;
        }
        throw new IllegalArgumentException(e.m("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", a, " and ", b, " respectively.").toString());
    }
    
    @Override
    public final void a(final f f) {
        sg2.e.f((Object)f, "buffer");
        final int c = f.c;
        f.a(c, Math.min(this.b + c, f.c()));
        f.a(Math.max(0, f.b - this.a), f.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final int a = this.a;
        final b b = (b)o;
        return a == b.a && this.b == b.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        r.append(this.a);
        r.append(", lengthAfterCursor=");
        return d.l(r, this.b, ')');
    }
}
