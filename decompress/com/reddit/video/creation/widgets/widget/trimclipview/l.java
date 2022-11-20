// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.q;

public final class l implements q
{
    public final int f;
    
    public l(final int f) {
        this.f = f;
    }
    
    public final boolean test(final Object o) {
        switch (this.f) {
            default: {
                return VoiceoverScrubber.Companion.b((MotionEvent)o);
            }
            case 3: {
                return TrimClipScrubber.Companion.e((MotionEvent)o);
            }
            case 2: {
                return StickerTimerScrubber.Companion.e((MotionEvent)o);
            }
            case 1: {
                return TrimClipScrubber$editingObservable$2.c((Integer)o);
            }
            case 0: {
                return TrimClipScrubber.h((TrimClipScrubber.SeekPositionData)o);
            }
        }
    }
}
