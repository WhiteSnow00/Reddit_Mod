// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/bluelinelabs/conductor/ControllerChangeType;", "", "isPush", "", "isEnter", "(Ljava/lang/String;IZZ)V", "PUSH_ENTER", "PUSH_EXIT", "POP_ENTER", "POP_EXIT", "conductor_release" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum ControllerChangeType
{
    POP_ENTER(false, true), 
    POP_EXIT(false, false), 
    PUSH_ENTER(true, true), 
    PUSH_EXIT(true, false);
    
    public final boolean isEnter;
    public final boolean isPush;
    
    private ControllerChangeType(final boolean isPush, final boolean isEnter) {
        this.isPush = isPush;
        this.isEnter = isEnter;
    }
}
