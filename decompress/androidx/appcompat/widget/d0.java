// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import a4.t0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.graphics.PorterDuff$Mode;
import android.graphics.Insets;
import java.lang.reflect.InvocationTargetException;
import r3.d;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;

public final class d0
{
    public static final int[] a;
    public static final int[] b;
    public static final Rect c;
    
    static {
        a = new int[] { 16842912 };
        b = new int[0];
        c = new Rect();
    }
    
    public static void a(final Drawable drawable) {
        final String name = drawable.getClass().getName();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29 && sdk_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            final int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(d0.b);
            }
            else {
                drawable.setState(d0.a);
            }
            drawable.setState(state);
        }
    }
    
    public static Rect b(final Drawable drawable) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            final Insets a = d0.b.a(drawable);
            return new Rect(a.left, a.top, a.right, a.bottom);
        }
        Drawable b = drawable;
        if (drawable instanceof d) {
            b = ((d)drawable).b();
        }
        Label_0125: {
            if (sdk_INT >= 29) {
                break Label_0125;
            }
            Label_0129: {
                if (!d0.a.a) {
                    break Label_0129;
                }
                try {
                    final Object invoke = d0.a.b.invoke(b, new Object[0]);
                    if (invoke != null) {
                        return new Rect(d0.a.c.getInt(invoke), d0.a.d.getInt(invoke), d0.a.e.getInt(invoke), d0.a.f.getInt(invoke));
                    }
                    return d0.c;
                    final boolean a2 = d0.a.a;
                    return d0.c;
                }
                catch (final IllegalAccessException | InvocationTargetException ex) {
                    return d0.c;
                }
            }
        }
    }
    
    public static PorterDuff$Mode c(final int n, final PorterDuff$Mode porterDuff$Mode) {
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
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    public static final class a
    {
        public static final boolean a;
        public static final Method b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        public static final Field f;
        
        static {
            Class<?> forName = null;
            Method method;
            Field field = null;
            Field field2 = null;
            Field field3 = null;
            try {
                forName = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", (Class<?>[])new Class[0]);
                try {
                    field = forName.getField("left");
                    try {
                        field2 = forName.getField("top");
                        try {
                            field3 = forName.getField("right");
                            final Class clazz = forName;
                            final String s = "bottom";
                            final Field f2 = clazz.getField(s);
                            final int n2;
                            final int n = n2 = 1;
                        }
                        catch (NoSuchMethodException | ClassNotFoundException | NoSuchFieldException field3) {
                            field3 = null;
                        }
                    }
                    catch (final NoSuchFieldException field3) {}
                    catch (final ClassNotFoundException field3) {}
                    catch (final NoSuchMethodException field3) {}
                }
                catch (final NoSuchFieldException field) {}
                catch (final ClassNotFoundException field) {}
                catch (final NoSuchMethodException field) {}
            }
            catch (NoSuchFieldException method) {
                method = null;
            }
            catch (ClassNotFoundException method) {
                method = null;
            }
            catch (NoSuchMethodException method) {
                method = null;
            }
        Label_0114:
            while (true) {
                try {
                    final Class clazz = forName;
                    final String s = "bottom";
                    Field f2 = clazz.getField(s);
                    int n2 = 1;
                Label_0109:
                    while (true) {
                        while (true) {
                            if (n2 != 0) {
                                b = method;
                                c = field;
                                d = field2;
                                e = field3;
                                f = f2;
                                a = true;
                            }
                            else {
                                b = null;
                                c = null;
                                d = null;
                                e = null;
                                f = null;
                                a = false;
                            }
                            return;
                            field = null;
                            break Label_0109;
                            n2 = 0;
                            f2 = null;
                            continue;
                        }
                        field = null;
                        field2 = null;
                        field3 = null;
                        continue Label_0114;
                        field = null;
                        continue Label_0109;
                    }
                }
                catch (final NoSuchMethodException | ClassNotFoundException | NoSuchFieldException ex) {
                    continue Label_0114;
                }
                break;
            }
        }
    }
    
    public static final class b
    {
        public static Insets a(final Drawable drawable) {
            return t0.b(drawable);
        }
    }
}
