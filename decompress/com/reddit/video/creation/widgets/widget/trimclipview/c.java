// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ff2.o;

public final class c implements o
{
    public final StickerTimerScrubber f;
    
    public c(final StickerTimerScrubber f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        return StickerTimerScrubber.a(this.f, (TrimClipUnits.Pixels)o);
    }
}
