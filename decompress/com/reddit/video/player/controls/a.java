// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import android.view.View;
import android.view.View$OnClickListener;

public final class a implements View$OnClickListener
{
    public final int f;
    public final RedditVideoControlsView g;
    
    public a(final RedditVideoControlsView g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                RedditVideoControlsView.e(this.g, view);
                return;
            }
            case 0: {
                RedditVideoControlsView.a(this.g, view);
            }
        }
    }
}
