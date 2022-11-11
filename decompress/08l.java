// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

public final class 08l
{
    static {
        Covode.recordClassIndex(922);
    }
    
    public static void LIZ(final ImageView imageView, final ColorStateList imageTintList) {
        imageView.setImageTintList(imageTintList);
        if (Build$VERSION.SDK_INT == 21) {
            final Drawable drawable = imageView.getDrawable();
            if (drawable != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }
    
    public static void LIZ(final ImageView imageView, final PorterDuff$Mode imageTintMode) {
        imageView.setImageTintMode(imageTintMode);
        if (Build$VERSION.SDK_INT == 21) {
            final Drawable drawable = imageView.getDrawable();
            if (drawable != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }
}
