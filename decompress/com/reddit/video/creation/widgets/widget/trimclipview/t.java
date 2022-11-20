// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ff2.q;

public final class t implements q
{
    public final VoiceoverScrubber f;
    
    public t(final VoiceoverScrubber f) {
        this.f = f;
    }
    
    public final boolean test(final Object o) {
        return VoiceoverScrubber.a(this.f, (Boolean)o);
    }
}
