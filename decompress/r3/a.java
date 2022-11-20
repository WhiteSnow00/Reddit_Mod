// 
// Decompiled by Procyon v0.6.0
// 

package r3;

import android.graphics.drawable.DrawableWrapper;
import android.graphics.PorterDuff$Mode;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.content.res.Resources$Theme;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class a
{
    public static void a(final Drawable drawable, final int n) {
        b.g(drawable, n);
    }
    
    public static void b(final Drawable drawable, final ColorStateList list) {
        b.h(drawable, list);
    }
    
    public static final class a
    {
        public static int a(final Drawable drawable) {
            return drawable.getAlpha();
        }
        
        public static Drawable b(final DrawableContainer$DrawableContainerState drawableContainer$DrawableContainerState, final int n) {
            return drawableContainer$DrawableContainerState.getChild(n);
        }
        
        public static Drawable c(final InsetDrawable insetDrawable) {
            return ((DrawableWrapper)insetDrawable).getDrawable();
        }
        
        public static boolean d(final Drawable drawable) {
            return drawable.isAutoMirrored();
        }
        
        public static void e(final Drawable drawable, final boolean autoMirrored) {
            drawable.setAutoMirrored(autoMirrored);
        }
    }
    
    public static final class b
    {
        public static void a(final Drawable drawable, final Resources$Theme resources$Theme) {
            drawable.applyTheme(resources$Theme);
        }
        
        public static boolean b(final Drawable drawable) {
            return drawable.canApplyTheme();
        }
        
        public static ColorFilter c(final Drawable drawable) {
            return drawable.getColorFilter();
        }
        
        public static void d(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, set, resources$Theme);
        }
        
        public static void e(final Drawable drawable, final float n, final float n2) {
            drawable.setHotspot(n, n2);
        }
        
        public static void f(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
            drawable.setHotspotBounds(n, n2, n3, n4);
        }
        
        public static void g(final Drawable drawable, final int tint) {
            drawable.setTint(tint);
        }
        
        public static void h(final Drawable drawable, final ColorStateList tintList) {
            drawable.setTintList(tintList);
        }
        
        public static void i(final Drawable drawable, final PorterDuff$Mode tintMode) {
            drawable.setTintMode(tintMode);
        }
    }
    
    public static final class c
    {
        public static int a(final Drawable drawable) {
            return drawable.getLayoutDirection();
        }
        
        public static boolean b(final Drawable drawable, final int layoutDirection) {
            return drawable.setLayoutDirection(layoutDirection);
        }
    }
}
