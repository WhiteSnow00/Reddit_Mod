// 
// Decompiled by Procyon v0.6.0
// 

package c4;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

public final class a
{
    public static PathInterpolator a(final float n, final float n2) {
        return new PathInterpolator(n, n2);
    }
    
    public static PathInterpolator b(final float n, final float n2, final float n3, final float n4) {
        return new PathInterpolator(n, n2, n3, n4);
    }
    
    public static PathInterpolator c(final Path path) {
        return new PathInterpolator(path);
    }
}
