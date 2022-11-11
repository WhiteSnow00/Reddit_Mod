// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.util;

import java.util.Iterator;
import sg2.e;
import java.util.ArrayList;
import hg2.j;
import rg2.a;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0086\u0002J\u001b\u0010\u0007\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0086\u0002J\u0018\u0010\b\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u0010\u0010\f\u001a\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/player/util/EventDelegate;", "", "Lkotlin/Function0;", "Lhg2/j;", "Lcom/reddit/video/player/internal/Delegate;", "delegate", "plusAssign", "minusAssign", "addHandler", "removeHandler", "invoke$player_release", "()V", "invoke", "", "delegates", "Ljava/util/List;", "", "getHasHandlers", "()Z", "hasHandlers", "<init>", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class EventDelegate
{
    private final List<a<j>> delegates;
    
    public EventDelegate() {
        this.delegates = new ArrayList<a<j>>();
    }
    
    public final void addHandler(final a<j> a) {
        e.f((Object)a, "delegate");
        this.plusAssign(a);
    }
    
    public final boolean getHasHandlers() {
        return this.delegates.isEmpty() ^ true;
    }
    
    public final void invoke$player_release() {
        final Iterator<a<j>> iterator = this.delegates.iterator();
        while (iterator.hasNext()) {
            iterator.next().invoke();
        }
    }
    
    public final void minusAssign(final a<j> a) {
        e.f((Object)a, "delegate");
        final Iterator<a<j>> iterator = this.delegates.iterator();
        while (iterator.hasNext()) {
            if (e.a((Object)iterator.next(), (Object)a)) {
                iterator.remove();
            }
        }
    }
    
    public final void plusAssign(final a<j> a) {
        e.f((Object)a, "delegate");
        this.delegates.add(a);
    }
    
    public final void removeHandler(final a<j> a) {
        e.f((Object)a, "delegate");
        this.minusAssign(a);
    }
}
