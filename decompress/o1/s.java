// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.PorterDuffColorFilter;
import aa1.a;
import android.os.Build$VERSION;
import sg2.e;
import android.graphics.ColorFilter;

public final class s
{
    public final ColorFilter a;
    
    static {
        new a();
    }
    
    public s(final ColorFilter a) {
        e.f((Object)a, "nativeColorFilter");
        this.a = a;
    }
    
    public static final class a
    {
        public static s a(final int n, final long n2) {
            Object a;
            if (Build$VERSION.SDK_INT >= 29) {
                a = l.a.a(n2, n);
            }
            else {
                a = new PorterDuffColorFilter(aa1.a.b1(n2), o1.a.b(n));
            }
            return new s((ColorFilter)a);
        }
    }
}
