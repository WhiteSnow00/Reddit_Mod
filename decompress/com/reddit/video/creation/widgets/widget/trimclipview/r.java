// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.widget.RelativeLayout;
import ff2.q;
import ff2.o;

public final class r implements o, q
{
    public final int f;
    public final RelativeLayout g;
    
    public r(final RelativeLayout g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public Object apply(final Object o) {
        switch (this.f) {
            default: {
                return VoiceoverScrubber.e((VoiceoverScrubber)this.g, (TrimClipUnits.Pixels)o);
            }
            case 0: {
                return TrimClipScrubber.j((TrimClipScrubber)this.g, (TrimClipUnits.Pixels)o);
            }
        }
    }
    
    public boolean test(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber.c((TrimClipScrubber)this.g, (Boolean)o);
            }
            case 0: {
                return StickerTimerScrubber.g((StickerTimerScrubber)this.g, (Boolean)o);
            }
        }
    }
}
