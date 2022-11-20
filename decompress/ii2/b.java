// 
// Decompiled by Procyon v0.6.0
// 

package ii2;

import ng2.e;
import oi2.t;
import ch2.c;

public final class b extends a
{
    public final c c;
    
    public b(final c c, final t t) {
        e.f((Object)c, "classDescriptor");
        e.f((Object)t, "receiverType");
        super(t, (f)null);
        this.c = c;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getType());
        sb.append(": Ctx { ");
        sb.append(this.c);
        sb.append(" }");
        return sb.toString();
    }
}
