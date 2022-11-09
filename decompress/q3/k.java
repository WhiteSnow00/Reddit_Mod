// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import android.net.Uri;
import j0.i;
import w3.m;
import java.io.File;
import p3.d;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import android.content.res.Resources;
import p3.d$c;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.GenericDeclaration;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public final class k extends p
{
    public static final Class<?> a;
    public static final Constructor<?> b;
    public static final Method c;
    public static final Method d;
    
    static {
        final Constructor<?> constructor = null;
        Class<?> forName = null;
        Constructor<?> constructor2 = null;
        GenericDeclaration method = null;
        Method method2 = null;
        Label_0113: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor2 = forName.getConstructor((Class<?>[])new Class[0]);
                final Class<Integer> type = Integer.TYPE;
                method = forName.getMethod("addFontWeightStyle", ByteBuffer.class, type, List.class, type, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass());
                break Label_0113;
            }
            catch (final NoSuchMethodException constructor2) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi24Impl", constructor2.getClass().getName(), (Throwable)constructor2);
            forName = null;
            method = (method2 = (Method)forName);
            constructor2 = constructor;
        }
        b = constructor2;
        a = forName;
        c = (Method)method;
        d = method2;
    }
    
    public static boolean g(final Object o, final ByteBuffer byteBuffer, final int n, final int n2, final boolean b) {
        try {
            return (boolean)k.c.invoke(o, byteBuffer, n, null, n2, b);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    @Override
    public final Typeface a(final Context context, d$c d$c, final Resources resources, int i) {
        final Typeface typeface = null;
        Object instance;
        try {
            instance = k.b.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final d.d[] a = d$c.a;
        final int length = a.length;
        i = 0;
        while (i < length) {
            final d.d d = a[i];
            final int f = d.f;
            final File d2 = q.d(context);
            Label_0100: {
                if (d2 == null) {
                    break Label_0100;
                }
                try {
                    if (!q.b(d2, resources, f)) {
                        d2.delete();
                        d$c = null;
                    }
                    else {
                        try {
                            final FileInputStream fileInputStream = new FileInputStream(d2);
                            try {
                                final FileChannel channel = fileInputStream.getChannel();
                                channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            }
                            finally {
                                try {
                                    fileInputStream.close();
                                }
                                finally {
                                    final Throwable t;
                                    ((Throwable)d$c).addSuppressed(t);
                                }
                            }
                        }
                        catch (final IOException ex2) {
                            d$c = null;
                        }
                        d2.delete();
                    }
                    if (d$c == null) {
                        return null;
                    }
                    if (!g(instance, (ByteBuffer)d$c, d.e, d.b, d.c)) {
                        return null;
                    }
                    ++i;
                    continue;
                }
                finally {
                    d2.delete();
                }
            }
            break;
        }
        try {
            final Object instance2 = Array.newInstance(k.a, 1);
            Array.set(instance2, 0, instance);
            return (Typeface)k.d.invoke(null, instance2);
        }
        catch (final IllegalAccessException | InvocationTargetException ex3) {
            return typeface;
        }
    }
    
    @Override
    public final Typeface b(final Context context, final m[] array, final int n) {
        Object instance;
        try {
            instance = k.b.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final i i = new i();
        for (final m m : array) {
            final Uri a = m.a;
            ByteBuffer e;
            if ((e = (ByteBuffer)i.getOrDefault((Object)a, (Object)null)) == null) {
                e = q.e(context, a);
                i.put((Object)a, (Object)e);
            }
            if (e == null) {
                return null;
            }
            if (!g(instance, e, m.b, m.c, m.d)) {
                return null;
            }
        }
        Typeface typeface;
        try {
            final Object instance2 = Array.newInstance(k.a, 1);
            Array.set(instance2, 0, instance);
            typeface = (Typeface)k.d.invoke(null, instance2);
        }
        catch (final IllegalAccessException | InvocationTargetException ex2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, n);
    }
}
