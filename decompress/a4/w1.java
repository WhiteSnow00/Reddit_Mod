// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.View;
import android.os.Build$VERSION;
import android.view.Window;

public final class w1
{
    public static void a(final Window window, final boolean b) {
        if (Build$VERSION.SDK_INT >= 30) {
            w1.b.a(window, b);
        }
        else {
            a.a(window, b);
        }
    }
    
    public static final class a
    {
        public static void a(final Window window, final boolean b) {
            final View decorView = window.getDecorView();
            final int systemUiVisibility = decorView.getSystemUiVisibility();
            int systemUiVisibility2;
            if (b) {
                systemUiVisibility2 = (systemUiVisibility & 0xFFFFF8FF);
            }
            else {
                systemUiVisibility2 = (systemUiVisibility | 0x700);
            }
            decorView.setSystemUiVisibility(systemUiVisibility2);
        }
    }
    
    public static final class b
    {
        public static void a(final Window window, final boolean b) {
            x1.e(window, b);
        }
    }
}
