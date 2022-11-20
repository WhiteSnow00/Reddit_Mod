// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ff2.o;

public final class f implements o
{
    public final StickerTimerScrubber f;
    
    public f(final StickerTimerScrubber f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        return StickerTimerScrubber.d(this.f, (TrimClipUnits.Pixels)o);
    }
}
