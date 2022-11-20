// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ag2.a;
import ff2.g;

public final class v implements g
{
    public final a f;
    public final VoiceoverScrubber g;
    
    public v(final a f, final VoiceoverScrubber g) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        VoiceoverScrubber.f(this.f, this.g, (VoiceoverScrubber.PositionData)o);
    }
}
