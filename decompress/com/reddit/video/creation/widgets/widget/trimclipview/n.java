// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ff2.g;

public final class n implements g
{
    public final int f;
    public final TrimClipScrubber g;
    
    public n(final TrimClipScrubber g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                TrimClipScrubber.b(this.g, (TrimClipUnits.Milliseconds)o);
                return;
            }
            case 0: {
                TrimClipScrubber.f(this.g, (Boolean)o);
            }
        }
    }
}
