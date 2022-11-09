// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import yd.a;
import java.util.ArrayList;

public final class m
{
    public static boolean a(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static final class a
    {
        public final ArrayList a;
        public final Object b;
        
        public final void a(final Object o, final String s) {
            final ArrayList a = this.a;
            final String value = String.valueOf(o);
            final StringBuilder sb = new StringBuilder(s.length() + 1 + value.length());
            sb.append(s);
            sb.append("=");
            sb.append(value);
            a.add(sb.toString());
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                sb.append((String)this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
