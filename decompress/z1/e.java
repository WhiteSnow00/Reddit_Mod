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
        final StringBuilder k = a.k("HistoricalChange(uptimeMillis=");
        k.append(this.a);
        k.append(", position=");
        k.append((Object)c.h(this.b));
        k.append(')');
        return k.toString();
    }
}
