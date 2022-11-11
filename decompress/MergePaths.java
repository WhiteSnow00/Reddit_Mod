// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.content;

import s6.k;
import c7.c;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import y6.b;

public final class MergePaths implements b
{
    public final MergePaths.MergePaths$MergePathsMode a;
    public final boolean b;
    
    public MergePaths(final String s, final MergePaths.MergePaths$MergePathsMode a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final s6.b a(final LottieDrawable lottieDrawable, final a a) {
        if (!lottieDrawable.q) {
            c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return (s6.b)new k(this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MergePaths{mode=");
        k.append(this.a);
        k.append('}');
        return k.toString();
    }
}
