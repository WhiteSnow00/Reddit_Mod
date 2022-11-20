// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.view.MotionEvent;
import ff2.o;

public final class w implements o
{
    public final float f;
    
    public w(final float f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        return VoiceoverScrubber.Companion.e(this.f, (MotionEvent)o);
    }
}
