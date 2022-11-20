// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.o;

public final class k implements o
{
    public final int f;
    
    public k(final int f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return VoiceoverScrubber.Companion.c((MotionEvent)o);
            }
            case 0: {
                return StickerTimerScrubber$editingObservable$2.a((Integer)o);
            }
        }
    }
}
