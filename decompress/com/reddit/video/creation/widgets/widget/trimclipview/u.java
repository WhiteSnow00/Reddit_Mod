// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ag2.a;
import ff2.g;

public final class u implements g
{
    public final int f;
    public final Object g;
    
    public u(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                ((a)this.g).onNext(o);
                return;
            }
            case 0: {
                VoiceoverScrubber.c((VoiceoverScrubber)this.g, (Boolean)o);
            }
        }
    }
}
