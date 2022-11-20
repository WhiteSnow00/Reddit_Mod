// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.voiceover;

import cg2.j;
import com.reddit.video.creation.widgets.widget.trimclipview.StickerTimerScrubber;
import ff2.g;

public final class a implements g
{
    public final int f;
    public final Object g;
    
    public a(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                StickerTimerScrubber.e((StickerTimerScrubber)this.g, (Boolean)o);
                return;
            }
            case 0: {
                VoiceoverPresenter.G((VoiceoverPresenter)this.g, (j)o);
            }
        }
    }
}
