// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import n1.c;

public final class e
{
    public final long a;
    public final long b;
    
    public e(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("HistoricalChange(uptimeMillis=");
        t.append(this.a);
        t.append(", position=");
        t.append((Object)c.j(this.b));
        t.append(')');
        return t.toString();
    }
}
