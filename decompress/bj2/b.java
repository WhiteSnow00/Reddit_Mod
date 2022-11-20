// 
// Decompiled by Procyon v0.6.0
// 

package bj2;

import dg.l0;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

public final class b extends LockFreeLinkedListNode.b
{
    public final bj2.a d;
    
    public b(final u u, final bj2.a d) {
        this.d = d;
        super((LockFreeLinkedListNode)u);
    }
    
    public final Object i(final Object o) {
        final LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode)o;
        Object d;
        if (this.d.l()) {
            d = null;
        }
        else {
            d = l0.D;
        }
        return d;
    }
}
