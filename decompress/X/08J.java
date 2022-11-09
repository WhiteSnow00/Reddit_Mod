// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class 08j
{
    public static Field LIZ;
    public static boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(920);
    }
    
    public static Drawable LIZ(final CompoundButton ex) {
        if (Build$VERSION.SDK_INT >= 23) {
            return ((CompoundButton)ex).getButtonDrawable();
        }
        Label_0040: {
            if (08j.LIZIZ) {
                break Label_0040;
            }
            while (true) {
                try {
                    (08j.LIZ = CompoundButton.class.getDeclaredField("mButtonDrawable")).setAccessible(true);
                    08j.LIZIZ = true;
                    final Field liz = 08j.LIZ;
                    if (liz != null) {
                        try {
                            return (Drawable)liz.get(ex);
                        }
                        catch (final IllegalAccessException ex) {
                            08j.LIZ = null;
                        }
                    }
                    return null;
                }
                catch (final NoSuchFieldException ex2) {
                    continue;
                }
                break;
            }
        }
    }
}
