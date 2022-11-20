// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import ch2.e0;
import wh2.e;
import wh2.c;

public abstract class s
{
    public final c a;
    public final e b;
    public final e0 c;
    
    public s(final c a, final e b, final e0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abstract yh2.c a();
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": ");
        sb.append(this.a());
        return sb.toString();
    }
}
