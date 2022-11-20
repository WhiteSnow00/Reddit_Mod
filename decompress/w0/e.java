// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import n1.c;
import androidx.compose.foundation.text.Handle;

public final class e
{
    public final Handle a;
    public final long b;
    
    public e(final Handle a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.a == e.a && c.c(this.b, e.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int e = c.e;
        return Long.hashCode(b) + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SelectionHandleInfo(handle=");
        t.append(this.a);
        t.append(", position=");
        t.append((Object)c.j(this.b));
        t.append(')');
        return t.toString();
    }
}
