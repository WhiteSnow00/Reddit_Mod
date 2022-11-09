// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.DrawableContainer;
import java.lang.reflect.Field;
import android.graphics.Insets;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;

public final class 04a
{
    public static final Rect LIZ;
    public static final int[] LIZIZ;
    public static final int[] LIZJ;
    public static Class<?> LIZLLL;
    
    static {
        Covode.recordClassIndex(545);
        LIZIZ = new int[] { 16842912 };
        LIZJ = new int[0];
        LIZ = new Rect();
        try {
            04a.LIZLLL = Class.forName("android.graphics.Insets");
        }
        catch (final ClassNotFoundException ex) {}
    }
    
    public static PorterDuff$Mode LIZ(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
        }
    }
    
    public static Rect LIZ(final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 29) {
            final Insets opticalInsets = drawable.getOpticalInsets();
            final Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        Label_0343: {
            if (04a.LIZLLL == null) {
                break Label_0343;
            }
            Drawable liz = drawable;
            try {
                if (drawable instanceof 08Y) {
                    liz = ((08Y)drawable).LIZ();
                }
                final Object invoke = liz.getClass().getMethod("getOpticalInsets", (Class<?>[])new Class[0]).invoke(liz, new Object[0]);
                if (invoke != null) {
                    final Rect rect2 = new Rect();
                    for (final Field field : 04a.LIZLLL.getFields()) {
                        final String name = field.getName();
                        int n = -1;
                        switch (name.hashCode()) {
                            case -1383228885: {
                                if (name.equals("bottom")) {
                                    n = 3;
                                    break;
                                }
                                break;
                            }
                            case 115029: {
                                if (name.equals("top")) {
                                    n = 1;
                                    break;
                                }
                                break;
                            }
                            case 3317767: {
                                if (name.equals("left")) {
                                    n = 0;
                                    break;
                                }
                                break;
                            }
                            case 108511772: {
                                if (name.equals("right")) {
                                    n = 2;
                                    break;
                                }
                                break;
                            }
                        }
                        if (n != 0) {
                            if (n != 1) {
                                if (n != 2) {
                                    if (n == 3) {
                                        rect2.bottom = field.getInt(invoke);
                                    }
                                }
                                else {
                                    rect2.right = field.getInt(invoke);
                                }
                            }
                            else {
                                rect2.top = field.getInt(invoke);
                            }
                        }
                        else {
                            rect2.left = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
                return 04a.LIZ;
            }
            catch (final Exception ex) {
                return 04a.LIZ;
            }
        }
    }
    
    public static void LIZIZ(final Drawable drawable) {
        if (Build$VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            LIZLLL(drawable);
        }
    }
    
    public static boolean LIZJ(Drawable drawable) {
        while (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof 08Y) {
                drawable = ((08Y)drawable).LIZ();
            }
            else if (drawable instanceof 02O) {
                drawable = ((02O)drawable).LIZ;
            }
            else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable = ((ScaleDrawable)drawable).getDrawable();
            }
        }
        final Drawable$ConstantState constantState = drawable.getConstantState();
        if (constantState instanceof DrawableContainer$DrawableContainerState) {
            final Drawable[] children = ((DrawableContainer$DrawableContainerState)constantState).getChildren();
            for (int length = children.length, i = 0; i < length; ++i) {
                if (!LIZJ(children[i])) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
    
    public static void LIZLLL(final Drawable drawable) {
        final int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(04a.LIZIZ);
        }
        else {
            drawable.setState(04a.LIZJ);
        }
        drawable.setState(state);
    }
}
