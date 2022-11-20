// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import yh2.c;
import xd.a;
import java.util.Collection;
import ng2.e;
import java.lang.annotation.Annotation;
import rh2.z;

public final class y extends m implements z
{
    public final w a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;
    
    public y(final w a, final Annotation[] b, final String c, final boolean d) {
        e.f((Object)b, "reflectAnnotations");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a() {
        return this.d;
    }
    
    public final Collection getAnnotations() {
        return xd.a.Y(this.b);
    }
    
    public final yh2.e getName() {
        final String c = this.c;
        yh2.e e;
        if (c != null) {
            e = yh2.e.e(c);
        }
        else {
            e = null;
        }
        return e;
    }
    
    public final rh2.w getType() {
        return this.a;
    }
    
    public final rh2.a l(final c c) {
        e.f((Object)c, "fqName");
        return (rh2.a)xd.a.V(this.b, c);
    }
    
    public final void t() {
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        android.support.v4.media.a.B((Class)y.class, sb, ": ");
        String s;
        if (this.d) {
            s = "vararg ";
        }
        else {
            s = "";
        }
        sb.append(s);
        sb.append(this.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
