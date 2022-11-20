// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.o;

public final class h implements o
{
    public final int f;
    public final float g;
    
    public h(final float g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber.Companion.d(this.g, (MotionEvent)o);
            }
            case 0: {
                return StickerTimerScrubber.Companion.c(this.g, (MotionEvent)o);
            }
        }
    }
}
