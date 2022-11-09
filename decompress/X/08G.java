// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.TypedValue;
import android.content.Context;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class 08G
{
    public static Method LIZ;
    
    static {
        Covode.recordClassIndex(873);
        if (Build$VERSION.SDK_INT != 25) {
            return;
        }
        try {
            08G.LIZ = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", (Class<?>[])new Class[0]);
        }
        catch (final Exception ex) {}
    }
    
    public static float LIZ(final ViewConfiguration viewConfiguration, final Context context) {
        while (true) {
            if (Build$VERSION.SDK_INT < 25) {
                break Label_0033;
            }
            final Method liz = 08G.LIZ;
            if (liz == null) {
                break Label_0033;
            }
            try {
                return (float)(int)liz.invoke(viewConfiguration, new Object[0]);
                final TypedValue typedValue = new TypedValue();
                iftrue(Label_0067:)(!context.getTheme().resolveAttribute(16842829, typedValue, true));
                return typedValue.getDimension(context.getResources().getDisplayMetrics());
                Label_0067: {
                    return 0.0f;
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
}
