// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.content.res.Resources;
import java.io.Closeable;
import ml0.a;
import android.graphics.Path;
import android.graphics.PathMeasure;

public final class g
{
    public static final g$a a;
    public static final g$b b;
    public static final g$c c;
    public static final g$d d;
    public static final float e;
    
    static {
        a = new ThreadLocal<PathMeasure>() {
            public final Object initialValue() {
                return new PathMeasure();
            }
        };
        b = new ThreadLocal<Path>() {
            public final Object initialValue() {
                return new Path();
            }
        };
        c = new ThreadLocal<Path>() {
            public final Object initialValue() {
                return new Path();
            }
        };
        d = new ThreadLocal<float[]>() {
            public final Object initialValue() {
                return new float[4];
            }
        };
        e = (float)(Math.sqrt(2.0) / 2.0);
    }
    
    public static void a(final Path path, float min, float n, float n2) {
        final PathMeasure pathMeasure = g.a.get();
        final Path path2 = g.b.get();
        final Path path3 = g.c.get();
        pathMeasure.setPath(path, false);
        final float length = pathMeasure.getLength();
        if (min == 1.0f && n == 0.0f) {
            ml0.a.A();
            return;
        }
        if (length < 1.0f || Math.abs(n - min - 1.0f) < 0.01) {
            ml0.a.A();
            return;
        }
        final float n3 = min * length;
        n *= length;
        min = Math.min(n3, n);
        final float max = Math.max(n3, n);
        n2 *= length;
        n = min + n2;
        final float n4 = max + n2;
        n2 = n;
        min = n4;
        if (n >= length) {
            n2 = n;
            min = n4;
            if (n4 >= length) {
                n2 = (float)f.c(n, length);
                min = (float)f.c(n4, length);
            }
        }
        n = n2;
        if (n2 < 0.0f) {
            n = (float)f.c(n2, length);
        }
        n2 = min;
        if (min < 0.0f) {
            n2 = (float)f.c(min, length);
        }
        final float n5 = fcmpl(n, n2);
        if (n5 == 0) {
            path.reset();
            ml0.a.A();
            return;
        }
        min = n;
        if (n5 >= 0) {
            min = n - length;
        }
        path2.reset();
        pathMeasure.getSegment(min, n2, path2, true);
        if (n2 > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, n2 % length, path3, true);
            path2.addPath(path3);
        }
        else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        ml0.a.A();
    }
    
    public static void b(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }
    
    public static float d(final Matrix matrix) {
        final float[] array = g.d.get();
        array[1] = (array[0] = 0.0f);
        array[3] = (array[2] = g.e);
        matrix.mapPoints(array);
        return (float)Math.hypot(array[2] - array[0], array[3] - array[1]);
    }
    
    public static Bitmap e(final int n, final int n2, final Bitmap bitmap) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        final Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, n, n2, true);
        bitmap.recycle();
        return scaledBitmap;
    }
}
