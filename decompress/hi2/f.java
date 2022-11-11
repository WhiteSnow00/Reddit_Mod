// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import sg2.e;
import di2.b;

public final class f
{
    public final b a;
    public final int b;
    
    public f(final b a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return e.a((Object)this.a, (Object)f.a) && this.b == f.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final int b = this.b;
        final int n = 0;
        for (int i = 0; i < b; ++i) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        for (int b2 = this.b, j = n; j < b2; ++j) {
            sb.append(">");
        }
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
