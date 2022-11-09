// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.ParcelFileDescriptor;
import java.lang.reflect.Array;
import android.net.Uri;
import java.util.Map;
import android.content.ContentResolver;
import java.io.IOException;
import android.graphics.Typeface$Builder;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import java.nio.ByteBuffer;
import android.graphics.fonts.FontVariationAxis;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class 1fq extends 14k
{
    public final Class<?> LIZ;
    public final Constructor<?> LIZIZ;
    public final Method LIZJ;
    public final Method LIZLLL;
    public final Method LJ;
    public final Method LJFF;
    public final Method LJI;
    
    static {
        Covode.recordClassIndex(903);
    }
    
    public 1fq() {
        Class<?> liz = null;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method liz2;
        try {
            final Class<?> forName = Class.forName("android.graphics.FontFamily");
            constructor = forName.getConstructor((Class<?>[])new Class[0]);
            method = forName.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            method2 = forName.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method3 = forName.getMethod("freeze", (Class[])new Class[0]);
            method4 = forName.getMethod("abortCreation", (Class[])new Class[0]);
            liz2 = this.LIZ(forName);
            liz = forName;
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            final Object o2;
            final Object o = o2 = null;
            final Object o4;
            final Object o3 = o4 = o2;
            final Object o5 = o4;
            constructor = (Constructor<?>)o3;
            method = (Method)o4;
            method2 = (Method)o5;
            method3 = (Method)o5;
            method4 = (Method)o2;
            liz2 = (Method)o;
        }
        this.LIZ = liz;
        this.LIZIZ = constructor;
        this.LIZJ = method;
        this.LIZLLL = method2;
        this.LJ = method3;
        this.LJFF = method4;
        this.LJI = liz2;
    }
    
    private boolean LIZ() {
        return this.LIZJ != null;
    }
    
    private boolean LIZ(final Context context, final Object o, final String s, final int n, final int n2, final int n3, final FontVariationAxis[] array) {
        try {
            return (boolean)this.LIZJ.invoke(o, context.getAssets(), s, 0, false, n, n2, n3, array);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private boolean LIZ(final Object o, final ByteBuffer byteBuffer, final int n, final int n2, final int n3) {
        try {
            return (boolean)this.LIZLLL.invoke(o, byteBuffer, n, null, n2, n3);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private Object LIZIZ() {
        try {
            return this.LIZIZ.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    private boolean LIZIZ(final Object o) {
        try {
            return (boolean)this.LJ.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private void LIZJ(final Object o) {
        try {
            this.LJFF.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {}
    }
    
    @Override
    public final Typeface LIZ(final Context context, final 06l.b b, final Resources resources, int i) {
        if (!this.LIZ()) {
            return super.LIZ(context, b, resources, i);
        }
        final Object liziz = this.LIZIZ();
        if (liziz == null) {
            return null;
        }
        final 06l.c[] liz = b.LIZ;
        int length;
        06l.c c;
        for (length = liz.length, i = 0; i < length; ++i) {
            c = liz[i];
            if (!this.LIZ(context, liziz, c.LIZ, c.LJ, c.LIZIZ, c.LIZJ ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c.LIZLLL))) {
                this.LIZJ(liziz);
                return null;
            }
        }
        if (!this.LIZIZ(liziz)) {
            return null;
        }
        return this.LIZ(liziz);
    }
    
    @Override
    public final Typeface LIZ(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.LIZ()) {
            return super.LIZ(context, resources, n, s, n2);
        }
        final Object liziz = this.LIZIZ();
        if (liziz == null) {
            return null;
        }
        if (!this.LIZ(context, liziz, s, 0, -1, -1, null)) {
            this.LIZJ(liziz);
            return null;
        }
        if (!this.LIZIZ(liziz)) {
            return null;
        }
        return this.LIZ(liziz);
    }
    
    @Override
    public final Typeface LIZ(Context openFileDescriptor, final CancellationSignal cancellationSignal, final 075.b[] array, final int n) {
        if (array.length <= 0) {
            return null;
        }
        if (!this.LIZ()) {
            final 075.b liz = this.LIZ(array, n);
            final ContentResolver contentResolver = openFileDescriptor.getContentResolver();
            try {
                openFileDescriptor = (Context)contentResolver.openFileDescriptor(liz.LIZ, "r", (CancellationSignal)null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    final Typeface build = new Typeface$Builder(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor()).setWeight(liz.LIZJ).setItalic(liz.LIZLLL).build();
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return build;
                }
                finally {
                    try {
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)cancellationSignal).addSuppressed(t);
                    }
                }
            }
            catch (final IOException ex) {
                return null;
            }
        }
        final Map<Uri, ByteBuffer> liz2 = 075.LIZ(openFileDescriptor, array, null);
        final Object liziz = this.LIZIZ();
        if (liziz == null) {
            return null;
        }
        final int length = array.length;
        boolean b = false;
        for (final 075.b b2 : array) {
            final ByteBuffer byteBuffer = liz2.get(b2.LIZ);
            if (byteBuffer != null) {
                if (!this.LIZ(liziz, byteBuffer, b2.LIZIZ, b2.LIZJ, b2.LIZLLL ? 1 : 0)) {
                    this.LIZJ(liziz);
                    return null;
                }
                b = true;
            }
        }
        if (!b) {
            this.LIZJ(liziz);
            return null;
        }
        if (!this.LIZIZ(liziz)) {
            return null;
        }
        final Typeface liz3 = this.LIZ(liziz);
        if (liz3 == null) {
            return null;
        }
        return Typeface.create(liz3, n);
    }
    
    public Typeface LIZ(final Object o) {
        try {
            final Object instance = Array.newInstance(this.LIZ, 1);
            Array.set(instance, 0, o);
            return (Typeface)this.LJI.invoke(null, instance, -1, -1);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public Method LIZ(final Class<?> clazz) {
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(clazz, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
