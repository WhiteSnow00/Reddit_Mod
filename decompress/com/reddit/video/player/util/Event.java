// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.util;

import java.util.Iterator;
import ng2.e;
import java.util.ArrayList;
import cg2.j;
import mg2.l;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0080\u0002¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/player/util/Event;", "A", "", "Lkotlin/Function1;", "Lcg2/j;", "delegate", "plusAssign", "minusAssign", "addHandler", "removeHandler", "arg", "invoke$player_release", "(Ljava/lang/Object;)V", "invoke", "", "delegates", "Ljava/util/List;", "", "getHasHandlers", "()Z", "hasHandlers", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public class Event<A>
{
    private final List<l<A, j>> delegates;
    
    public Event() {
        this.delegates = new ArrayList<l<A, j>>();
    }
    
    public final void addHandler(final l<? super A, j> l) {
        e.f((Object)l, "delegate");
        this.plusAssign(l);
    }
    
    public final boolean getHasHandlers() {
        return this.delegates.isEmpty() ^ true;
    }
    
    public final void invoke$player_release(final A a) {
        final Iterator<l<A, j>> iterator = this.delegates.iterator();
        while (iterator.hasNext()) {
            iterator.next().invoke((Object)a);
        }
    }
    
    public final void minusAssign(final l<? super A, j> l) {
        e.f((Object)l, "delegate");
        final Iterator<l<A, j>> iterator = this.delegates.iterator();
        while (iterator.hasNext()) {
            if (e.a((Object)iterator.next(), (Object)l)) {
                iterator.remove();
            }
        }
    }
    
    public final void plusAssign(final l<? super A, j> l) {
        e.f((Object)l, "delegate");
        this.delegates.add((l<A, j>)l);
    }
    
    public final void removeHandler(final l<? super A, j> l) {
        e.f((Object)l, "delegate");
        this.minusAssign(l);
    }
}
