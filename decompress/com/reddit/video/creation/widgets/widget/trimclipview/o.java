// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.widget.RelativeLayout;

public final class o implements ff2.o
{
    public final int f;
    public final RelativeLayout g;
    
    public o(final RelativeLayout g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return VoiceoverScrubber.h((VoiceoverScrubber)this.g, (TrimClipUnits.Pixels)o);
            }
            case 0: {
                return TrimClipScrubber.k((TrimClipScrubber)this.g, (TrimClipUnits.Pixels)o);
            }
        }
    }
}
