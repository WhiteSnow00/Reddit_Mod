// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import kotlin.jvm.internal.DefaultConstructorMarker;
import hg2.j;
import rg2.a;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004R*\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR*\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR*\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u001b" }, d2 = { "Lcom/reddit/video/player/controls/Margins;", "", "Lkotlin/Function0;", "Lhg2/j;", "Lcom/reddit/video/player/internal/Delegate;", "callback", "onUpdate", "", "value", "top", "I", "getTop", "()I", "setTop", "(I)V", "right", "getRight", "setRight", "bottom", "getBottom", "setBottom", "left", "getLeft", "setLeft", "<init>", "(IIII)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class Margins
{
    public static final Companion Companion;
    private static final Margins zero;
    private int bottom;
    private int left;
    private a<j> onUpdate;
    private int right;
    private int top;
    
    static {
        Companion = new Companion(null);
        zero = new Margins(0, 0, 0, 0, 15, null);
    }
    
    public Margins() {
        this(0, 0, 0, 0, 15, null);
    }
    
    public Margins(final int top, final int right, final int bottom, final int left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }
    
    public static final /* synthetic */ Margins access$getZero$cp() {
        return Margins.zero;
    }
    
    public static final Margins getZero() {
        return Margins.Companion.getZero();
    }
    
    public final int getBottom() {
        return this.bottom;
    }
    
    public final int getLeft() {
        return this.left;
    }
    
    public final int getRight() {
        return this.right;
    }
    
    public final int getTop() {
        return this.top;
    }
    
    public final void onUpdate(final a<j> onUpdate) {
        this.onUpdate = onUpdate;
    }
    
    public final void setBottom(final int bottom) {
        this.bottom = bottom;
        final a<j> onUpdate = this.onUpdate;
        if (onUpdate != null) {
            onUpdate.invoke();
        }
    }
    
    public final void setLeft(final int left) {
        this.left = left;
        final a<j> onUpdate = this.onUpdate;
        if (onUpdate != null) {
            onUpdate.invoke();
        }
    }
    
    public final void setRight(final int right) {
        this.right = right;
        final a<j> onUpdate = this.onUpdate;
        if (onUpdate != null) {
            onUpdate.invoke();
        }
    }
    
    public final void setTop(final int top) {
        this.top = top;
        final a<j> onUpdate = this.onUpdate;
        if (onUpdate != null) {
            onUpdate.invoke();
        }
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/controls/Margins$Companion;", "", "()V", "zero", "Lcom/reddit/video/player/controls/Margins;", "getZero$annotations", "getZero", "()Lcom/reddit/video/player/controls/Margins;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final Margins getZero() {
            return Margins.access$getZero$cp();
        }
    }
}
