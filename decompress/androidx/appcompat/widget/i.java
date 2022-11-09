// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import n3.a;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import q3.e;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public final class i
{
    public static final PorterDuff$Mode b;
    public static i c;
    public ResourceManagerInternal a;
    
    static {
        b = PorterDuff$Mode.SRC_IN;
    }
    
    public static i a() {
        synchronized (i.class) {
            if (i.c == null) {
                d();
            }
            return i.c;
        }
    }
    
    public static PorterDuffColorFilter c(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (i.class) {
            return ResourceManagerInternal.getPorterDuffColorFilter(n, porterDuff$Mode);
        }
    }
    
    public static void d() {
        synchronized (i.class) {
            if (i.c == null) {
                (i.c = new i()).a = ResourceManagerInternal.get();
                i.c.a.setHooks((ResourceManagerInternal.c)new ResourceManagerInternal.c() {
                    public final int[] a = { 2131230902, 2131230900, 2131230826 };
                    public final int[] b = { 2131230850, 2131230885, 2131230857, 2131230852, 2131230853, 2131230856, 2131230855 };
                    public final int[] c = { 2131230899, 2131230901, 2131230843, 2131230895, 2131230896, 2131230897, 2131230898 };
                    public final int[] d = { 2131230875, 2131230841, 2131230874 };
                    public final int[] e = { 2131230893, 2131230903 };
                    public final int[] f = { 2131230829, 2131230835, 2131230830, 2131230836 };
                    
                    public static boolean a(final int n, final int[] array) {
                        for (int length = array.length, i = 0; i < length; ++i) {
                            if (array[i] == n) {
                                return true;
                            }
                        }
                        return false;
                    }
                    
                    public static ColorStateList b(final int n, final Context context) {
                        final int c = u0.c(2130968820, context);
                        return new ColorStateList(new int[][] { u0.b, u0.d, u0.c, u0.f }, new int[] { u0.b(2130968818, context), e.g(c, n), e.g(c, n), n });
                    }
                    
                    public static LayerDrawable c(final ResourceManagerInternal resourceManagerInternal, final Context context, int dimensionPixelSize) {
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(dimensionPixelSize);
                        final Drawable drawable = resourceManagerInternal.getDrawable(context, 2131230889);
                        final Drawable drawable2 = resourceManagerInternal.getDrawable(context, 2131230890);
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        if (drawable instanceof BitmapDrawable && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable)drawable;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        }
                        else {
                            final Bitmap bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
                            final Canvas canvas = new Canvas(bitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(bitmap);
                            bitmapDrawable2 = new BitmapDrawable(bitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader$TileMode.REPEAT);
                        BitmapDrawable bitmapDrawable3;
                        if (drawable2 instanceof BitmapDrawable && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable)drawable2;
                        }
                        else {
                            final Bitmap bitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
                            final Canvas canvas2 = new Canvas(bitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(bitmap2);
                        }
                        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)bitmapDrawable, (Drawable)bitmapDrawable3, (Drawable)bitmapDrawable2 });
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }
                    
                    public static void e(final Drawable drawable, final int n, final PorterDuff$Mode porterDuff$Mode) {
                        final int[] a = d0.a;
                        final Drawable mutate = drawable.mutate();
                        PorterDuff$Mode b = porterDuff$Mode;
                        if (porterDuff$Mode == null) {
                            b = i.b;
                        }
                        mutate.setColorFilter((ColorFilter)i.c(n, b));
                    }
                    
                    public final ColorStateList d(final int n, final Context context) {
                        if (n == 2131230846) {
                            return n3.a.getColorStateList(context, 2131099669);
                        }
                        if (n == 2131230892) {
                            return n3.a.getColorStateList(context, 2131099672);
                        }
                        if (n == 2131230891) {
                            final int[][] array = new int[3][];
                            final int[] array2 = new int[3];
                            final ColorStateList d = u0.d(2130968837, context);
                            if (d != null && d.isStateful()) {
                                final int[] b = u0.b;
                                array[0] = b;
                                array2[0] = d.getColorForState(b, 0);
                                array[1] = u0.e;
                                array2[1] = u0.c(2130968819, context);
                                array[2] = u0.f;
                                array2[2] = d.getDefaultColor();
                            }
                            else {
                                array[0] = u0.b;
                                array2[0] = u0.b(2130968837, context);
                                array[1] = u0.e;
                                array2[1] = u0.c(2130968819, context);
                                array[2] = u0.f;
                                array2[2] = u0.c(2130968837, context);
                            }
                            return new ColorStateList(array, array2);
                        }
                        if (n == 2131230834) {
                            return b(u0.c(2130968818, context), context);
                        }
                        if (n == 2131230828) {
                            return b(0, context);
                        }
                        if (n == 2131230833) {
                            return b(u0.c(2130968816, context), context);
                        }
                        if (n == 2131230887 || n == 2131230888) {
                            return n3.a.getColorStateList(context, 2131099671);
                        }
                        if (a(n, this.b)) {
                            return u0.d(2130968821, context);
                        }
                        if (a(n, this.e)) {
                            return n3.a.getColorStateList(context, 2131099668);
                        }
                        if (a(n, this.f)) {
                            return n3.a.getColorStateList(context, 2131099667);
                        }
                        if (n == 2131230884) {
                            return n3.a.getColorStateList(context, 2131099670);
                        }
                        return null;
                    }
                });
            }
        }
    }
    
    public final Drawable b(final Context context, final int n) {
        synchronized (this) {
            return this.a.getDrawable(context, n);
        }
    }
}
