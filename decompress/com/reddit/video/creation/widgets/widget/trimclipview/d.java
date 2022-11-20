// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ag2.a;
import ff2.g;

public final class d implements g
{
    public final int f;
    public final a g;
    
    public d(final a g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                this.g.onNext(o);
            }
        }
    }
}
