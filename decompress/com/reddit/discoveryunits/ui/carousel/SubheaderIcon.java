// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui.carousel;

import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/discoveryunits/ui/carousel/SubheaderIcon;", "", "drawable", "", "(Ljava/lang/String;II)V", "getDrawable", "()I", "TOP", "DISCOVER", "LOCATION", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum SubheaderIcon
{
    @n(name = "icon_discover")
    DISCOVER(2131231982), 
    @n(name = "location")
    LOCATION(2131232083), 
    @n(name = "icon_top")
    TOP(2131232315);
    
    private final int drawable;
    
    private SubheaderIcon(final int drawable) {
        this.drawable = drawable;
    }
    
    public final int getDrawable() {
        return this.drawable;
    }
}
