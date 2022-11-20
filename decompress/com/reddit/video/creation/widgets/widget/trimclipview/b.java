// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ag2.a;
import ff2.g;

public final class b implements g
{
    public final int f;
    public final Object g;
    
    public b(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                VoiceoverScrubber.b((VoiceoverScrubber)this.g, (TrimClipUnits.Milliseconds)o);
                return;
            }
            case 1: {
                ((a)this.g).onNext(o);
                return;
            }
            case 0: {
                ((a)this.g).onNext(o);
            }
        }
    }
}
