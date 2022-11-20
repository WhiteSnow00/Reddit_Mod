// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import java.util.List;
import ff2.g;

public final class a implements g
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public a(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public a(final StickerTimerScrubber h, final List g) {
        this.f = 2;
        this.h = h;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                VoiceoverScrubber.g((VoiceoverScrubber)this.g, (List)this.h, (TrimClipUnits.Pixels)o);
                return;
            }
            case 2: {
                StickerTimerScrubber.h((StickerTimerScrubber)this.h, (List)this.g, (TrimClipUnits.Pixels)o);
                return;
            }
            case 1: {
                TrimClipScrubber.l((ag2.a)this.g, (TrimClipScrubber)this.h, (TrimClipScrubber.PositionData)o);
                return;
            }
            case 0: {
                StickerTimerScrubber.b((ag2.a)this.g, (StickerTimerScrubber)this.h, (StickerTimerScrubber.PositionData)o);
            }
        }
    }
}
