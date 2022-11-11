// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;

public final class e
{
    public static ColorStateList a(final ImageView imageView) {
        return imageView.getImageTintList();
    }
    
    public static PorterDuff$Mode b(final ImageView imageView) {
        return imageView.getImageTintMode();
    }
    
    public static void c(final ImageView imageView, final ColorStateList imageTintList) {
        imageView.setImageTintList(imageTintList);
    }
    
    public static void d(final ImageView imageView, final PorterDuff$Mode imageTintMode) {
        imageView.setImageTintMode(imageTintMode);
    }
}
