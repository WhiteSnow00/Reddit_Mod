// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import kotlin.Triple;
import android.widget.RelativeLayout;
import ff2.g;

public final class e implements g
{
    public final int f;
    public final RelativeLayout g;
    
    public e(final RelativeLayout g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                VoiceoverScrubber.i((VoiceoverScrubber)this.g, (TrimClipUnits.Milliseconds)o);
                return;
            }
            case 1: {
                TrimClipScrubber.d((TrimClipScrubber)this.g, (Triple)o);
                return;
            }
            case 0: {
                StickerTimerScrubber.c((StickerTimerScrubber)this.g, (Triple)o);
            }
        }
    }
}
