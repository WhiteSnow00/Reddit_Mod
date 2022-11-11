// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.extensions;

import sg2.e;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "vis", "", "visible", "Landroid/view/View;", "getVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "player_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class ViewExtensionsKt
{
    public static final boolean getVisible(final View view) {
        e.f((Object)view, "<this>");
        return view.getVisibility() == 0;
    }
    
    public static final void setVisible(final View view, final boolean b) {
        e.f((Object)view, "<this>");
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        view.setVisibility(visibility);
    }
}
