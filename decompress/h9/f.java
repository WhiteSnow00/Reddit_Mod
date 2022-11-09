// 
// Decompiled by Procyon v0.6.0
// 

package h9;

import p8.d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$CompressFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import android.graphics.Bitmap;
import p8.j;

public class f extends a<f>
{
    private static f centerCropOptions;
    private static f centerInsideOptions;
    private static f circleCropOptions;
    private static f fitCenterOptions;
    private static f noAnimationOptions;
    private static f noTransformOptions;
    private static f skipMemoryCacheFalseOptions;
    private static f skipMemoryCacheTrueOptions;
    
    public static f bitmapTransform(final j<Bitmap> j) {
        return (f)new f().transform((j)j);
    }
    
    public static f centerCropTransform() {
        if (f.centerCropOptions == null) {
            f.centerCropOptions = (f)new f().centerCrop().autoClone();
        }
        return f.centerCropOptions;
    }
    
    public static f centerInsideTransform() {
        if (f.centerInsideOptions == null) {
            f.centerInsideOptions = (f)new f().centerInside().autoClone();
        }
        return f.centerInsideOptions;
    }
    
    public static f circleCropTransform() {
        if (f.circleCropOptions == null) {
            f.circleCropOptions = (f)new f().circleCrop().autoClone();
        }
        return f.circleCropOptions;
    }
    
    public static f decodeTypeOf(final Class<?> clazz) {
        return (f)new f().decode((Class)clazz);
    }
    
    public static f diskCacheStrategyOf(final r8.f f) {
        return (f)new f().diskCacheStrategy(f);
    }
    
    public static f downsampleOf(final DownsampleStrategy downsampleStrategy) {
        return (f)new f().downsample(downsampleStrategy);
    }
    
    public static f encodeFormatOf(final Bitmap$CompressFormat bitmap$CompressFormat) {
        return (f)new f().encodeFormat(bitmap$CompressFormat);
    }
    
    public static f encodeQualityOf(final int n) {
        return (f)new f().encodeQuality(n);
    }
    
    public static f errorOf(final int n) {
        return (f)new f().error(n);
    }
    
    public static f errorOf(final Drawable drawable) {
        return (f)new f().error(drawable);
    }
    
    public static f fitCenterTransform() {
        if (f.fitCenterOptions == null) {
            f.fitCenterOptions = (f)new f().fitCenter().autoClone();
        }
        return f.fitCenterOptions;
    }
    
    public static f formatOf(final DecodeFormat decodeFormat) {
        return (f)new f().format(decodeFormat);
    }
    
    public static f frameOf(final long n) {
        return (f)new f().frame(n);
    }
    
    public static f noAnimation() {
        if (f.noAnimationOptions == null) {
            f.noAnimationOptions = (f)new f().dontAnimate().autoClone();
        }
        return f.noAnimationOptions;
    }
    
    public static f noTransformation() {
        if (f.noTransformOptions == null) {
            f.noTransformOptions = (f)new f().dontTransform().autoClone();
        }
        return f.noTransformOptions;
    }
    
    public static <T> f option(final p8.f<T> f, final T t) {
        return (f)new f().set((p8.f)f, (Object)t);
    }
    
    public static f overrideOf(final int n) {
        return overrideOf(n, n);
    }
    
    public static f overrideOf(final int n, final int n2) {
        return (f)new f().override(n, n2);
    }
    
    public static f placeholderOf(final int n) {
        return (f)new f().placeholder(n);
    }
    
    public static f placeholderOf(final Drawable drawable) {
        return (f)new f().placeholder(drawable);
    }
    
    public static f priorityOf(final Priority priority) {
        return (f)new f().priority(priority);
    }
    
    public static f signatureOf(final d d) {
        return (f)new f().signature(d);
    }
    
    public static f sizeMultiplierOf(final float n) {
        return (f)new f().sizeMultiplier(n);
    }
    
    public static f skipMemoryCacheOf(final boolean b) {
        if (b) {
            if (f.skipMemoryCacheTrueOptions == null) {
                f.skipMemoryCacheTrueOptions = (f)new f().skipMemoryCache(true).autoClone();
            }
            return f.skipMemoryCacheTrueOptions;
        }
        if (f.skipMemoryCacheFalseOptions == null) {
            f.skipMemoryCacheFalseOptions = (f)new f().skipMemoryCache(false).autoClone();
        }
        return f.skipMemoryCacheFalseOptions;
    }
    
    public static f timeoutOf(final int n) {
        return (f)new f().timeout(n);
    }
}
