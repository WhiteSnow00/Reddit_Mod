// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.clipseekbar;

import ff2.g;

public final class b implements g
{
    public final ClipSeekBar f;
    public final int g;
    public final long h;
    
    public b(final ClipSeekBar f, final int g, final long h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void accept(final Object o) {
        ClipSeekBar.p(this.f, this.g, this.h, (Integer)o);
    }
}
