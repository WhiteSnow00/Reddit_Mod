// 
// Decompiled by Procyon v0.6.0
// 

package j9;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import i9.f;
import android.graphics.drawable.Drawable;

public final class b implements d<Drawable>
{
    public final int a;
    public final boolean b;
    
    public b(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(Object imageDrawable, final d$a d$a) {
        final Drawable drawable = (Drawable)imageDrawable;
        final f f = (f)d$a;
        Object drawable2;
        if ((drawable2 = ((ImageView)f.g).getDrawable()) == null) {
            drawable2 = new ColorDrawable(0);
        }
        imageDrawable = new TransitionDrawable(new Drawable[] { (Drawable)drawable2, drawable });
        ((TransitionDrawable)imageDrawable).setCrossFadeEnabled(this.b);
        ((TransitionDrawable)imageDrawable).startTransition(this.a);
        ((ImageView)f.g).setImageDrawable((Drawable)imageDrawable);
        return true;
    }
}
