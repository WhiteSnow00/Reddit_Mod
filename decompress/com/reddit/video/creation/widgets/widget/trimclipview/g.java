// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import af2.t;
import ff2.o;

public final class g implements o
{
    public final int f;
    public final t g;
    
    public g(final t g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber.Companion.c(this.g, (MotionEvent)o);
            }
            case 0: {
                return StickerTimerScrubber.Companion.a(this.g, (MotionEvent)o);
            }
        }
    }
}
