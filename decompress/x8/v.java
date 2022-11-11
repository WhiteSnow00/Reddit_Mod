// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.RectF;
import android.os.Build$VERSION;
import android.util.Log;
import android.graphics.Bitmap$Config;
import al0.a;
import r8.d;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import java.util.concurrent.locks.ReentrantLock;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import android.graphics.Paint;

public final class v
{
    public static final Paint a;
    public static final Paint b;
    public static final Paint c;
    public static final Lock d;
    
    static {
        a = new Paint(6);
        b = new Paint(7);
        Lock d2;
        if (new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL)) {
            d2 = new ReentrantLock();
        }
        else {
            d2 = new b();
        }
        d = d2;
        (c = new Paint(7)).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
    }
    
    public static void a(final Bitmap bitmap, final Bitmap bitmap2, final Matrix matrix) {
        final Lock d = v.d;
        d.lock();
        try {
            final Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, v.a);
            canvas.setBitmap((Bitmap)null);
            d.unlock();
        }
        finally {
            v.d.unlock();
        }
    }
    
    public static Bitmap b(final d d, final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        float c = 0.0f;
        float n3;
        float c2;
        if (width * n2 > height * n) {
            n3 = n2 / (float)bitmap.getHeight();
            c = al0.a.c((float)bitmap.getWidth(), n3, (float)n, 0.5f);
            c2 = 0.0f;
        }
        else {
            n3 = n / (float)bitmap.getWidth();
            c2 = al0.a.c((float)bitmap.getHeight(), n3, (float)n2, 0.5f);
        }
        matrix.setScale(n3, n3);
        matrix.postTranslate((float)(int)(c + 0.5f), (float)(int)(c2 + 0.5f));
        Bitmap$Config bitmap$Config;
        if (bitmap.getConfig() != null) {
            bitmap$Config = bitmap.getConfig();
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap value = d.get(n, n2, bitmap$Config);
        value.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, value, matrix);
        return value;
    }
    
    public static Bitmap c(final d d, final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        final float min = Math.min(n / (float)bitmap.getWidth(), n2 / (float)bitmap.getHeight());
        final int round = Math.round(bitmap.getWidth() * min);
        final int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        final int n3 = (int)(bitmap.getWidth() * min);
        final int n4 = (int)(bitmap.getHeight() * min);
        Bitmap$Config bitmap$Config;
        if (bitmap.getConfig() != null) {
            bitmap$Config = bitmap.getConfig();
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap value = d.get(n3, n4, bitmap$Config);
        value.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(n);
            sb.append("x");
            sb.append(n2);
            Log.v("TransformationUtils", sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            Log.v("TransformationUtils", sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(value.getWidth());
            sb3.append("x");
            sb3.append(value.getHeight());
            Log.v("TransformationUtils", sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v("TransformationUtils", sb4.toString());
        }
        final Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, value, matrix);
        return value;
    }
    
    public static Bitmap d(final d d, final Bitmap bitmap) {
        final Bitmap$Config e = e(bitmap);
        if (e.equals(bitmap.getConfig())) {
            return bitmap;
        }
        final Bitmap value = d.get(bitmap.getWidth(), bitmap.getHeight(), e);
        new Canvas(value).drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
        return value;
    }
    
    public static Bitmap$Config e(final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT >= 26 && Bitmap$Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap$Config.RGBA_F16;
        }
        return Bitmap$Config.ARGB_8888;
    }
    
    public static int f(int n) {
        switch (n) {
            default: {
                n = 0;
                break;
            }
            case 7:
            case 8: {
                n = 270;
                break;
            }
            case 5:
            case 6: {
                n = 90;
                break;
            }
            case 3:
            case 4: {
                n = 180;
                break;
            }
        }
        return n;
    }
    
    public static boolean g(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                return true;
            }
        }
    }
    
    public static Bitmap h(final d d, final Bitmap bitmap, int round) {
        if (!g(round)) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        switch (round) {
            case 8: {
                matrix.setRotate(-90.0f);
                break;
            }
            case 7: {
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            }
            case 6: {
                matrix.setRotate(90.0f);
                break;
            }
            case 5: {
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            }
            case 4: {
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            }
            case 3: {
                matrix.setRotate(180.0f);
                break;
            }
            case 2: {
                matrix.setScale(-1.0f, 1.0f);
                break;
            }
        }
        final RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        matrix.mapRect(rectF);
        final int round2 = Math.round(rectF.width());
        round = Math.round(rectF.height());
        Bitmap$Config bitmap$Config;
        if (bitmap.getConfig() != null) {
            bitmap$Config = bitmap.getConfig();
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap value = d.get(round2, round, bitmap$Config);
        matrix.postTranslate(-rectF.left, -rectF.top);
        value.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, value, matrix);
        return value;
    }
    
    public static Bitmap i(final d d, final Bitmap bitmap, final a a) {
        final Bitmap$Config e = e(bitmap);
        final Bitmap d2 = d(d, bitmap);
        final Bitmap value = d.get(d2.getWidth(), d2.getHeight(), e);
        value.setHasAlpha(true);
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        final BitmapShader shader = new BitmapShader(d2, clamp, clamp);
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((Shader)shader);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)value.getWidth(), (float)value.getHeight());
        final Lock d3 = v.d;
        d3.lock();
        try {
            final Canvas canvas = new Canvas(value);
            canvas.drawColor(0, PorterDuff$Mode.CLEAR);
            a.a(canvas, paint, rectF);
            canvas.setBitmap((Bitmap)null);
            d3.unlock();
            if (!d2.equals(bitmap)) {
                d.put(d2);
            }
            return value;
        }
        finally {
            v.d.unlock();
        }
    }
    
    public interface a
    {
        void a(final Canvas p0, final Paint p1, final RectF p2);
    }
    
    public static final class b implements Lock
    {
        @Override
        public final void lock() {
        }
        
        @Override
        public final void lockInterruptibly() throws InterruptedException {
        }
        
        @Override
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
        
        @Override
        public final boolean tryLock() {
            return true;
        }
        
        @Override
        public final boolean tryLock(final long n, final TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
        
        @Override
        public final void unlock() {
        }
    }
}
