// 
// Decompiled by Procyon v0.6.0
// 

package x1;

import sg2.e;
import android.view.KeyEvent;

public final class b
{
    public final KeyEvent a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final KeyEvent a = this.a;
        final boolean b = o instanceof b;
        boolean b2 = false;
        if (b) {
            if (e.a((Object)a, (Object)((b)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final KeyEvent a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("KeyEvent(nativeKeyEvent=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
