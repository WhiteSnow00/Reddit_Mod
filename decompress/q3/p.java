// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import java.io.File;
import java.io.InputStream;
import w3.m;
import android.graphics.Typeface;
import android.content.res.Resources;
import p3.d$c;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

public class p
{
    public p() {
        new ConcurrentHashMap();
    }
    
    public static <T> T e(final T[] array, int i, final a<T> a) {
        int n;
        if ((i & 0x1) == 0x0) {
            n = 400;
        }
        else {
            n = 700;
        }
        final boolean b = (i & 0x2) != 0x0;
        final int length = array.length;
        T t = null;
        int n2 = Integer.MAX_VALUE;
        T t2;
        int abs;
        int n3;
        int n4;
        int n5;
        for (i = 0; i < length; ++i, n2 = n5) {
            t2 = array[i];
            abs = Math.abs(a.a(t2) - n);
            if (a.b(t2) == b) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            n4 = abs * 2 + n3;
            if (t == null || (n5 = n2) > n4) {
                t = t2;
                n5 = n4;
            }
        }
        return t;
    }
    
    public Typeface a(final Context context, final d$c d$c, final Resources resources, final int n) {
        throw null;
    }
    
    public Typeface b(final Context context, final m[] array, final int n) {
        throw null;
    }
    
    public Typeface c(Context d, final InputStream inputStream) {
        d = (Context)q.d(d);
        if (d == null) {
            return null;
        }
        try {
            if (!q.c((File)d, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(((File)d).getPath());
        }
        catch (final RuntimeException ex) {
            return null;
        }
        finally {
            ((File)d).delete();
        }
    }
    
    public Typeface d(Context d, final Resources resources, final int n, final String s, final int n2) {
        d = (Context)q.d(d);
        if (d == null) {
            return null;
        }
        try {
            if (!q.b((File)d, resources, n)) {
                return null;
            }
            return Typeface.createFromFile(((File)d).getPath());
        }
        catch (final RuntimeException ex) {
            return null;
        }
        finally {
            ((File)d).delete();
        }
    }
    
    public m f(final int n, final m[] array) {
        return e(array, n, (a<m>)new o());
    }
    
    public interface a<T>
    {
        int a(final T p0);
        
        boolean b(final T p0);
    }
}
