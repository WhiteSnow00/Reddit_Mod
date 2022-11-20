// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.o;

public final class s implements o
{
    public final int f;
    
    public s(final int f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber.Companion.b((MotionEvent)o);
            }
            case 2: {
                return TrimClipScrubber.i((TrimClipUnits.Milliseconds)o);
            }
            case 1: {
                return StickerTimerScrubber.Companion.b((MotionEvent)o);
            }
            case 0: {
                return TrimClipScrubber$editingObservable$2.a((MotionEvent)o);
            }
        }
    }
}
