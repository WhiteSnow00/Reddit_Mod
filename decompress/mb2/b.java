// 
// Decompiled by Procyon v0.6.0
// 

package mb2;

import ng2.e;
import android.content.Context;
import n3.a;
import android.graphics.drawable.Drawable;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

public final class b extends LayerDrawable
{
    public final GradientDrawable f;
    
    public b(final Activity activity) {
        super(new Drawable[] { a.getDrawable((Context)activity, 2131230945) });
        final Drawable drawable = this.getDrawable(0);
        e.d((Object)drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        final Drawable drawable2 = ((LayerDrawable)drawable).getDrawable(0);
        e.d((Object)drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.f = (GradientDrawable)drawable2;
    }
}
