// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.ContentResolver;
import java.io.IOException;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.io.InputStream;
import java.io.FileInputStream;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import java.lang.reflect.GenericDeclaration;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.system.Os;
import java.io.File;
import android.os.ParcelFileDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class 14k extends 08c
{
    public static Class<?> LIZ;
    public static Constructor<?> LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static boolean LJ;
    
    static {
        Covode.recordClassIndex(901);
    }
    
    public static Typeface LIZ(final Object ex) {
        LIZ();
        try {
            final Object instance = Array.newInstance(14k.LIZ, 1);
            Array.set(instance, 0, ex);
            return (Typeface)14k.LIZLLL.invoke(null, instance);
        }
        catch (final IllegalAccessException ex) {}
        catch (final InvocationTargetException ex2) {}
        throw new RuntimeException(ex);
    }
    
    private File LIZ(final ParcelFileDescriptor parcelFileDescriptor) {
        try {
            final StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            final String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        }
        catch (final ErrnoException ex) {
            return null;
        }
    }
    
    public static void LIZ() {
        if (14k.LJ) {
            return;
        }
        14k.LJ = true;
        Constructor<?> liziz = null;
        GenericDeclaration forName;
        Method method;
        Method method2;
        try {
            forName = Class.forName("android.graphics.FontFamily");
            final Constructor constructor = ((Class)forName).getConstructor((Class[])new Class[0]);
            method = ((Class)forName).getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>)forName, 1).getClass());
            liziz = constructor;
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            method2 = null;
            forName = (method = method2);
        }
        14k.LIZIZ = liziz;
        14k.LIZ = (Class<?>)forName;
        14k.LIZJ = method;
        14k.LIZLLL = method2;
    }
    
    public static boolean LIZ(final File file) {
        try {
            609 liz;
            if (NIJ.LIZIZ()) {
                liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
            }
            else {
                liz = 4F0.LIZ;
            }
            if (608.LIZ(file.getAbsolutePath(), liz)) {
                608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
            }
            if (608.LIZJ(file.getAbsolutePath(), liz)) {
                608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                return false;
            }
            return file.delete();
        }
        finally {
            return file.delete();
        }
    }
    
    public static boolean LIZ(final Object ex, final String s, final int n, final boolean b) {
        LIZ();
        try {
            return (boolean)14k.LIZJ.invoke(ex, s, n, b);
        }
        catch (final IllegalAccessException ex) {}
        catch (final InvocationTargetException ex2) {}
        throw new RuntimeException(ex);
    }
    
    public static Object LIZIZ() {
        LIZ();
        try {
            return 14k.LIZIZ.newInstance(new Object[0]);
        }
        catch (final InstantiationException ex) {}
        catch (final IllegalAccessException ex) {}
        catch (final InvocationTargetException ex2) {}
        final InstantiationException ex;
        throw new RuntimeException(ex);
    }
    
    @Override
    public Typeface LIZ(final Context context, 06l.b liz, final Resources resources, int i) {
        final Object liziz = LIZIZ();
        final 06l.c[] liz2 = liz.LIZ;
        final int length = liz2.length;
        i = 0;
        while (i < length) {
            final 06l.c c = liz2[i];
            liz = (06l.b)08d.LIZ(context);
            if (liz == null) {
                return null;
            }
            try {
                if (!08d.LIZ((File)liz, resources, c.LJFF)) {
                    return null;
                }
                if (!LIZ(liziz, ((File)liz).getPath(), c.LIZIZ, c.LIZJ)) {
                    return null;
                }
                LIZ((File)liz);
                ++i;
                continue;
            }
            catch (final RuntimeException ex) {
                return null;
            }
            finally {
                LIZ((File)liz);
            }
            break;
        }
        return LIZ(liziz);
    }
    
    @Override
    public Typeface LIZ(final Context context, CancellationSignal openFileDescriptor, 075.b[] array, final int n) {
        if (array.length <= 0) {
            return null;
        }
        final 075.b liz = this.LIZ(array, n);
        final ContentResolver contentResolver = context.getContentResolver();
        try {
            openFileDescriptor = (CancellationSignal)contentResolver.openFileDescriptor(liz.LIZ, "r", (CancellationSignal)null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                final File liz2 = this.LIZ((ParcelFileDescriptor)openFileDescriptor);
                if (liz2 == null || !liz2.canRead()) {
                    array = (075.b[])(Object)new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor());
                    try {
                        final Typeface liz3 = super.LIZ(context, (InputStream)(Object)array);
                        ((FileInputStream)(Object)array).close();
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                        return liz3;
                    }
                    finally {
                        try {
                            ((FileInputStream)(Object)array).close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)context).addSuppressed(t);
                        }
                    }
                }
                Typeface typeface = null;
                Label_0171: {
                    if (TypeFaceOptimizer.getSwitch()) {
                        final String path = liz2.getPath();
                        if (path != null) {
                            if (TypeFaceLancet.cache.contains(path)) {
                                typeface = TypeFaceLancet.cache.get(path);
                                break Label_0171;
                            }
                            typeface = Typeface.createFromFile(liz2);
                            if (typeface != null) {
                                TypeFaceLancet.cache.put(path, typeface);
                                break Label_0171;
                            }
                        }
                    }
                    typeface = Typeface.createFromFile(liz2);
                }
                ((ParcelFileDescriptor)openFileDescriptor).close();
                return typeface;
            }
            finally {
                try {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                finally {
                    final Throwable t2;
                    ((Throwable)context).addSuppressed(t2);
                }
            }
        }
        catch (final IOException ex) {
            return null;
        }
    }
}
