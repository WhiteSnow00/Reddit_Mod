// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ff2.o;

public final class m implements o
{
    public final int f;
    
    public m(final int f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return TrimClipScrubber$editingObservable$2.b((Integer)o);
            }
            case 0: {
                return TrimClipScrubber.o((TrimClipScrubber.SeekPositionData)o);
            }
        }
    }
}
