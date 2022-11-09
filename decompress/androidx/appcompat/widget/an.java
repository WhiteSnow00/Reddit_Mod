// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.content.res.AssetManager;
import X.13X;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.ContextWrapper;

public class an extends ContextWrapper
{
    public final Resources LIZ;
    public final Resources$Theme LIZIZ;
    
    static {
        Covode.recordClassIndex(499);
    }
    
    public static Context LIZ(final Context context) {
        if (!(context instanceof an) && !(context.getResources() instanceof 13X)) {
            context.getResources();
        }
        return context;
    }
    
    public AssetManager getAssets() {
        return this.LIZ.getAssets();
    }
    
    public Resources getResources() {
        return this.LIZ;
    }
    
    public Resources$Theme getTheme() {
        Resources$Theme resources$Theme;
        if ((resources$Theme = this.LIZIZ) == null) {
            resources$Theme = super.getTheme();
        }
        return resources$Theme;
    }
    
    public void setTheme(final int theme) {
        final Resources$Theme liziz = this.LIZIZ;
        if (liziz == null) {
            super.setTheme(theme);
            return;
        }
        liziz.applyStyle(theme, true);
    }
}
