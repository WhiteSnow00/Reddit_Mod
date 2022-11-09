// 
// Decompiled by Procyon v0.6.0
// 

package v6;

import c7.c;
import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.AssetManager;
import java.util.HashMap;
import y0.f;

public final class a
{
    public final f a;
    public final HashMap b;
    public final HashMap c;
    public final AssetManager d;
    public String e;
    
    public a(final Drawable$Callback drawable$Callback) {
        this.a = new f(1);
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = ".ttf";
        if (!(drawable$Callback instanceof View)) {
            c7.c.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View)drawable$Callback).getContext().getAssets();
    }
}
