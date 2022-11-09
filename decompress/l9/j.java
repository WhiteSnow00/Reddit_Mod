// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.os.Looper;
import android.os.Handler;

public final class j
{
    public static final char[] a;
    public static final char[] b;
    public static volatile Handler c;
    
    static {
        a = "0123456789abcdef".toCharArray();
        b = new char[64];
    }
    
    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
    
    public static boolean b(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            equals = (o2 == null);
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static int c(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        Bitmap$Config argb_8888 = bitmap$Config;
        if (bitmap$Config == null) {
            argb_8888 = Bitmap$Config.ARGB_8888;
        }
        final int n3 = j$a.a[((Enum)argb_8888).ordinal()];
        int n4 = 4;
        if (n3 != 1) {
            if (n3 != 2 && n3 != 3) {
                if (n3 == 4) {
                    n4 = 8;
                }
            }
            else {
                n4 = 2;
            }
        }
        else {
            n4 = 1;
        }
        return n * n2 * n4;
    }
    
    public static int d(final Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            }
            catch (final NullPointerException ex) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }
    
    public static ArrayList e(final Set set) {
        final ArrayList list = new ArrayList(set.size());
        for (final Object next : set) {
            if (next != null) {
                list.add(next);
            }
        }
        return list;
    }
    
    public static Handler f() {
        if (j.c == null) {
            synchronized (j.class) {
                if (j.c == null) {
                    j.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return j.c;
    }
    
    public static int g(final int n, final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return n * 31 + hashCode;
    }
    
    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper() ^ true;
    }
    
    public static boolean i(int n, final int n2) {
        final boolean b = false;
        if (n <= 0 && n != Integer.MIN_VALUE) {
            n = 0;
        }
        else {
            n = 1;
        }
        boolean b2 = b;
        if (n != 0) {
            if (n2 <= 0 && n2 != Integer.MIN_VALUE) {
                n = 0;
            }
            else {
                n = 1;
            }
            b2 = b;
            if (n != 0) {
                b2 = true;
            }
        }
        return b2;
    }
}
