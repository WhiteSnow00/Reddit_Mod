// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.os.Build$VERSION;
import android.view.Window;
import com.bytedance.covode.number.Covode;

public final class 0cS
{
    static {
        Covode.recordClassIndex(5726);
    }
    
    public static void LIZ(final Window window) {
        if (window == null) {
            return;
        }
        if (LIZJ(window, true)) {
            return;
        }
        if (LIZIZ(window, true)) {
            return;
        }
        if (Build$VERSION.SDK_INT >= 23) {
            LIZ(window, true);
        }
    }
    
    public static void LIZ(final Window window, final boolean b) {
        if (window == null) {
            return;
        }
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        final View decorView = window.getDecorView();
        final int systemUiVisibility = decorView.getSystemUiVisibility();
        int systemUiVisibility2;
        if (b) {
            systemUiVisibility2 = (systemUiVisibility | 0x2000);
        }
        else {
            systemUiVisibility2 = (systemUiVisibility & 0xFFFFDFFF);
        }
        decorView.setSystemUiVisibility(systemUiVisibility2);
    }
    
    public static void LIZIZ(final Window window) {
        if (window == null) {
            return;
        }
        final String liz = 1HY.LIZ();
        int n;
        if ("MIUI".equals(liz)) {
            n = 1;
        }
        else if ("FLYME".equals(liz)) {
            n = 2;
        }
        else {
            n = 3;
        }
        if (n == 1) {
            LIZJ(window, false);
            return;
        }
        if (n == 2) {
            LIZIZ(window, false);
            return;
        }
        LIZ(window, false);
    }
    
    public static boolean LIZIZ(final Window window, final boolean b) {
        final boolean b2 = true;
        Label_0098: {
            if (window == null) {
                break Label_0098;
            }
            try {
                final WindowManager$LayoutParams attributes = window.getAttributes();
                final Field declaredField = WindowManager$LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                final Field declaredField2 = WindowManager$LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                final int int1 = declaredField.getInt(null);
                final int int2 = declaredField2.getInt(attributes);
                int n;
                if (b) {
                    n = (int2 | int1);
                }
                else {
                    n = (int2 & ~int1);
                }
                declaredField2.setInt(attributes, n);
                window.setAttributes(attributes);
                return b2;
                b3 = false;
                return b3;
            }
            catch (final Exception ex) {
                return false;
            }
        }
    }
    
    public static boolean LIZJ(final Window window) {
        if (window == null) {
            return false;
        }
        final WindowManager$LayoutParams attributes = window.getAttributes();
        return (window.getDecorView().getSystemUiVisibility() & 0x400) != 0x0 || (attributes.flags & 0x4000000) != 0x0;
    }
    
    public static boolean LIZJ(final Window window, final boolean b) {
        final boolean b2 = true;
        Label_0164: {
            if (window == null) {
                break Label_0164;
            }
            final Class<? extends Window> class1 = window.getClass();
            try {
                final Class<?> forName = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                final int int1 = forName.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(forName);
                final Method method = class1.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (b) {
                    method.invoke(window, int1, int1);
                }
                else {
                    method.invoke(window, 0, int1);
                }
                boolean b3 = b2;
                if (Build$VERSION.SDK_INT >= 23) {
                    if (b) {
                        window.getDecorView().setSystemUiVisibility(8192);
                        b3 = b2;
                    }
                    else {
                        window.getDecorView().setSystemUiVisibility(0);
                        b3 = b2;
                    }
                }
                return b3;
                b3 = false;
                return b3;
            }
            catch (final Exception ex) {
                return false;
            }
        }
    }
}
