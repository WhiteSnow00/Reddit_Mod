// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.q;

public final class p implements q
{
    public final int f;
    
    public p(final int f) {
        this.f = f;
    }
    
    public final boolean test(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber.Companion.a((MotionEvent)o);
            }
            case 1: {
                return StickerTimerScrubber.Companion.d((MotionEvent)o);
            }
            case 0: {
                return TrimClipScrubber.n((TrimClipScrubber.SeekPositionData)o);
            }
        }
    }
}
