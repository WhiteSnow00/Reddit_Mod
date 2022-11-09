// 
// Decompiled by Procyon v0.6.0
// 

package v6;

import android.graphics.Bitmap;
import java.util.HashMap;
import c7.c;
import android.view.View;
import android.text.TextUtils;
import android.graphics.drawable.Drawable$Callback;
import q6.d0;
import java.util.Map;
import android.content.Context;

public final class b
{
    public static final Object d;
    public final Context a;
    public final String b;
    public final Map<String, d0> c;
    
    static {
        d = new Object();
    }
    
    public b(final Drawable$Callback drawable$Callback, final String b, final q6.b b2, final Map<String, d0> c) {
        if (!TextUtils.isEmpty((CharSequence)b) && b.charAt(b.length() - 1) != '/') {
            this.b = b.g(b, '/');
        }
        else {
            this.b = b;
        }
        if (!(drawable$Callback instanceof View)) {
            c7.c.b("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap<String, d0>();
            this.a = null;
            return;
        }
        this.a = ((View)drawable$Callback).getContext();
        this.c = c;
    }
    
    public final void a(final Bitmap d, final String s) {
        synchronized (v6.b.d) {
            this.c.get(s).d = d;
        }
    }
}
