// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.net.Uri;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class 14l extends 08c
{
    public static final Method LIZ;
    public static final Class<?> LIZIZ;
    public static final Constructor<?> LIZJ;
    public static final Method LIZLLL;
    
    static {
        Covode.recordClassIndex(902);
        Constructor<?> lizj = null;
        Class<?> forName;
        GenericDeclaration method;
        Method method2;
        try {
            forName = Class.forName("android.graphics.FontFamily");
            final Constructor<?> constructor = forName.getConstructor((Class<?>[])new Class[0]);
            method = forName.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass());
            lizj = constructor;
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            forName = null;
            method2 = (Method)(method = forName);
        }
        LIZJ = lizj;
        LIZIZ = forName;
        LIZ = (Method)method;
        LIZLLL = method2;
    }
    
    public static Typeface LIZ(final Object o) {
        try {
            final Object instance = Array.newInstance(14l.LIZIZ, 1);
            Array.set(instance, 0, o);
            return (Typeface)14l.LIZLLL.invoke(null, instance);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public static Object LIZ() {
        try {
            return 14l.LIZJ.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public static boolean LIZ(final Object o, final ByteBuffer byteBuffer, final int n, final int n2, final boolean b) {
        try {
            return (boolean)14l.LIZ.invoke(o, byteBuffer, n, null, n2, b);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    @Override
    public final Typeface LIZ(final Context context, final 06l.b b, final Resources resources, int i) {
        final Object liz = LIZ();
        if (liz == null) {
            return null;
        }
        final 06l.c[] liz2 = b.LIZ;
        int length;
        06l.c c;
        ByteBuffer liz3;
        for (length = liz2.length, i = 0; i < length; ++i) {
            c = liz2[i];
            liz3 = 08d.LIZ(context, resources, c.LJFF);
            if (liz3 == null) {
                return null;
            }
            if (!LIZ(liz, liz3, c.LJ, c.LIZIZ, c.LIZJ)) {
                return null;
            }
        }
        return LIZ(liz);
    }
    
    @Override
    public final Typeface LIZ(final Context context, final CancellationSignal cancellationSignal, final 075.b[] array, final int n) {
        final Object liz = LIZ();
        if (liz == null) {
            return null;
        }
        final 050 050 = new 050();
        for (final 075.b b : array) {
            final Uri liz2 = b.LIZ;
            ByteBuffer byteBuffer;
            if ((byteBuffer = 050.get(liz2)) == null) {
                final ByteBuffer liz3 = 08d.LIZ(context, null, liz2);
                050.put(liz2, liz3);
                if ((byteBuffer = liz3) == null) {
                    return null;
                }
            }
            if (!LIZ(liz, byteBuffer, b.LIZIZ, b.LIZJ, b.LIZLLL)) {
                return null;
            }
        }
        final Typeface liz4 = LIZ(liz);
        if (liz4 == null) {
            return null;
        }
        return Typeface.create(liz4, n);
    }
}
