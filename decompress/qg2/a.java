// 
// Decompiled by Procyon v0.6.0
// 

package qg2;

import sg2.e;
import java.util.List;
import java.io.File;

public final class a
{
    public final File a;
    public final List<File> b;
    
    public a(final File a, final List<? extends File> b) {
        e.f((Object)b, "segments");
        this.a = a;
        this.b = (List<File>)b;
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
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("FilePathComponents(root=");
        r.append(this.a);
        r.append(", segments=");
        return d.o(r, (List)this.b, ')');
    }
}
