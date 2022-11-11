// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui.carousel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e" }, d2 = { "Lcom/reddit/discoveryunits/ui/carousel/CarouselItemLayout;", "", "itemsPerScreen", "", "layoutFile", "", "snappingSupported", "", "paddingRecyclerStartDimen", "paddingRecyclerEndDimen", "paddingRecyclerBetweenItemsDimen", "updateCardWidth", "(Ljava/lang/String;IFIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getItemsPerScreen", "()F", "getLayoutFile", "()I", "getPaddingRecyclerBetweenItemsDimen", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaddingRecyclerEndDimen", "getPaddingRecyclerStartDimen", "getSnappingSupported", "()Z", "getUpdateCardWidth", "SMALL", "LARGE", "HERO", "GRID_LIST", "INVALID", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum CarouselItemLayout
{
    @n(name = "grid_list")
    GRID_LIST(1.1f, 2131624300, false, (Integer)null, (Integer)null, (Integer)null, false, 96, (DefaultConstructorMarker)null), 
    @n(name = "hero")
    HERO(2.5f, 2131624435, false, Integer.valueOf(2131165670), Integer.valueOf(2131166674), Integer.valueOf(2131165831), false), 
    @n(name = "banner")
    INVALID(0.0f, 0, false, (Integer)null, (Integer)null, (Integer)null, false, 120, (DefaultConstructorMarker)null), 
    @n(name = "large")
    LARGE(1.4f, 2131624436, false, (Integer)null, (Integer)null, (Integer)null, false, 120, (DefaultConstructorMarker)null), 
    @n(name = "small")
    SMALL(2.25f, 2131624437, false, (Integer)null, (Integer)null, (Integer)null, false, 120, (DefaultConstructorMarker)null);
    
    private final float itemsPerScreen;
    private final int layoutFile;
    private final Integer paddingRecyclerBetweenItemsDimen;
    private final Integer paddingRecyclerEndDimen;
    private final Integer paddingRecyclerStartDimen;
    private final boolean snappingSupported;
    private final boolean updateCardWidth;
    
    private CarouselItemLayout(final float itemsPerScreen, final int layoutFile, final boolean snappingSupported, final Integer paddingRecyclerStartDimen, final Integer paddingRecyclerEndDimen, final Integer paddingRecyclerBetweenItemsDimen, final boolean updateCardWidth) {
        this.itemsPerScreen = itemsPerScreen;
        this.layoutFile = layoutFile;
        this.snappingSupported = snappingSupported;
        this.paddingRecyclerStartDimen = paddingRecyclerStartDimen;
        this.paddingRecyclerEndDimen = paddingRecyclerEndDimen;
        this.paddingRecyclerBetweenItemsDimen = paddingRecyclerBetweenItemsDimen;
        this.updateCardWidth = updateCardWidth;
    }
    
    public final float getItemsPerScreen() {
        return this.itemsPerScreen;
    }
    
    public final int getLayoutFile() {
        return this.layoutFile;
    }
    
    public final Integer getPaddingRecyclerBetweenItemsDimen() {
        return this.paddingRecyclerBetweenItemsDimen;
    }
    
    public final Integer getPaddingRecyclerEndDimen() {
        return this.paddingRecyclerEndDimen;
    }
    
    public final Integer getPaddingRecyclerStartDimen() {
        return this.paddingRecyclerStartDimen;
    }
    
    public final boolean getSnappingSupported() {
        return this.snappingSupported;
    }
    
    public final boolean getUpdateCardWidth() {
        return this.updateCardWidth;
    }
}
