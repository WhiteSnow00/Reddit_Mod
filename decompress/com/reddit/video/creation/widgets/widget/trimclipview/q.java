// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.o;

public final class q implements o
{
    public final int f;
    
    public q(final int f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber.a((TrimClipUnits.Milliseconds)o);
            }
            case 1: {
                return VoiceoverScrubber$editingObservable$2.b((MotionEvent)o);
            }
            case 0: {
                return TrimClipScrubber.g((TrimClipScrubber.SeekPositionData)o);
            }
        }
    }
}
