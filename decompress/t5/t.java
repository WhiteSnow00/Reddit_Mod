// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import java.util.Iterator;
import java.util.ArrayList;
import android.view.View;
import java.util.HashMap;

public final class t
{
    public final HashMap a;
    public View b;
    public final ArrayList<m> c;
    
    @Deprecated
    public t() {
        this.a = new HashMap();
        this.c = new ArrayList<m>();
    }
    
    public t(final View b) {
        this.a = new HashMap();
        this.c = new ArrayList<m>();
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof t) {
            final View b = this.b;
            final t t = (t)o;
            if (b == t.b && this.a.equals(t.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TransitionValues@");
        t.append(Integer.toHexString(this.hashCode()));
        t.append(":\n");
        final StringBuilder q = android.support.v4.media.a.q(t.toString(), "    view = ");
        q.append(this.b);
        q.append("\n");
        String s = b.l(q.toString(), "    values:");
        for (final String s2 : this.a.keySet()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            sb.append(s2);
            sb.append(": ");
            sb.append(this.a.get(s2));
            sb.append("\n");
            s = sb.toString();
        }
        return s;
    }
}
