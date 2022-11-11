// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import android.net.Uri;
import java.util.HashSet;

public final class c
{
    public final HashSet a;
    
    public c() {
        this.a = new HashSet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && c.class == o.getClass() && this.a.equals(((c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public static final class a
    {
        public final Uri a;
        public final boolean b;
        
        public a(final Uri a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.b != a.b || !this.a.equals((Object)a.a)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + (this.b ? 1 : 0);
        }
    }
}
