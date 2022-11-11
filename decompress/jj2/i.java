// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

public class i extends LockFreeLinkedListNode
{
    public final boolean v() {
        return false;
    }
    
    public final boolean w() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
