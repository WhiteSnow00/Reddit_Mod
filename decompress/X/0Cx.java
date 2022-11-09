// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import java.util.List;
import android.os.Build$VERSION;
import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DigHoleUtilOptSetting;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0cX
{
    public static volatile Boolean LIZ;
    
    static {
        Covode.recordClassIndex(5731);
    }
    
    public static boolean LIZ(final Context context) {
        if (DigHoleUtilOptSetting.INSTANCE.getEnable() && context instanceof Activity) {
            if (0cX.LIZ == null) {
                0cX.LIZ = LIZIZ(context);
            }
            return 0cX.LIZ;
        }
        return LIZIZ(context);
    }
    
    public static boolean LIZIZ(final Context context) {
        return LIZJ(context) || new 0cM(context).LIZ || LIZLLL(context);
    }
    
    public static boolean LIZJ(final Context context) {
        final 1nL liz = GTi.LIZ(context);
        if (liz == null) {
            return false;
        }
        if (Build$VERSION.SDK_INT < 28) {
            return false;
        }
        final View decorView = liz.getWindow().getDecorView();
        try {
            final Object invoke = decorView.getClass().getMethod("getRootWindowInsets", (Class<?>[])new Class[0]).invoke(decorView, new Object[0]);
            final Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", (Class<?>[])new Class[0]).invoke(invoke, new Object[0]);
            final List list = (List)invoke2.getClass().getMethod("getBoundingRects", (Class<?>[])new Class[0]).invoke(invoke2, new Object[0]);
            return list != null && list.size() > 0;
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
            return false;
        }
    }
    
    public static boolean LIZLLL(final Context context) {
        try {
            final Resources resources = context.getResources();
            final int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0) {
                final String string = resources.getString(identifier);
                if (string != null && !TextUtils.isEmpty((CharSequence)string)) {
                    return true;
                }
            }
            return false;
        }
        catch (final Exception ex) {
            return false;
        }
    }
}
