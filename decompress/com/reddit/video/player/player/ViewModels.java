// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import kotlin.collections.c;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011" }, d2 = { "Lcom/reddit/video/player/player/ViewModels;", "", "modes", "", "", "Lcom/reddit/video/player/player/ViewModel;", "(Ljava/util/Map;)V", "getModes", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ViewModels
{
    private final Map<String, ViewModel> modes;
    
    public ViewModels() {
        this(null, 1, null);
    }
    
    public ViewModels(final Map<String, ViewModel> modes) {
        e.f((Object)modes, "modes");
        this.modes = modes;
    }
    
    public ViewModels(Map u4, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            u4 = c.u4();
        }
        this(u4);
    }
    
    public static ViewModels copy$default(final ViewModels viewModels, Map modes, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            modes = viewModels.modes;
        }
        return viewModels.copy(modes);
    }
    
    public final Map<String, ViewModel> component1() {
        return this.modes;
    }
    
    public final ViewModels copy(final Map<String, ViewModel> map) {
        e.f((Object)map, "modes");
        return new ViewModels(map);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ViewModels && e.a((Object)this.modes, (Object)((ViewModels)o).modes));
    }
    
    public final Map<String, ViewModel> getModes() {
        return this.modes;
    }
    
    @Override
    public int hashCode() {
        return this.modes.hashCode();
    }
    
    @Override
    public String toString() {
        return aq2.a.p(a.t("ViewModels(modes="), (Map)this.modes, ')');
    }
}
