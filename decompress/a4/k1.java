// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.util.TypedValue;
import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class k1
{
    public static Method a;
    
    static {
        if (Build$VERSION.SDK_INT == 25) {
            try {
                k1.a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", (Class<?>[])new Class[0]);
            }
            catch (final Exception ex) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }
    
    public static float a(final ViewConfiguration viewConfiguration, final Context context) {
        if (Build$VERSION.SDK_INT >= 25) {
            final Method a = k1.a;
            if (a != null) {
                try {
                    return (float)(int)a.invoke(viewConfiguration, new Object[0]);
                }
                catch (final Exception ex) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
    
    public static final class a
    {
        public static float a(final ViewConfiguration viewConfiguration) {
            return p.a(viewConfiguration);
        }
        
        public static float b(final ViewConfiguration viewConfiguration) {
            return o.a(viewConfiguration);
        }
    }
    
    public static final class b
    {
        public static int a(final ViewConfiguration viewConfiguration) {
            return t0.b(viewConfiguration);
        }
        
        public static boolean b(final ViewConfiguration viewConfiguration) {
            return s0.h(viewConfiguration);
        }
    }
}
