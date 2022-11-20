// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/tonyodev/fetch2/EnqueueAction;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "REPLACE_EXISTING", "INCREMENT_FILE_NAME", "DO_NOT_ENQUEUE_IF_EXISTING", "UPDATE_ACCORDINGLY", "fetch2_release" }, k = 1, mv = { 1, 4, 0 })
public enum EnqueueAction
{
    private static final EnqueueAction[] $VALUES;
    public static final a Companion;
    
    DO_NOT_ENQUEUE_IF_EXISTING(2), 
    INCREMENT_FILE_NAME(1), 
    REPLACE_EXISTING(0), 
    UPDATE_ACCORDINGLY(3);
    
    private final int value;
    
    static {
        Companion = new a();
    }
    
    private EnqueueAction(final int value) {
        this.value = value;
    }
    
    public static final EnqueueAction valueOf(final int n) {
        EnqueueAction.Companion.getClass();
        return a.a(n);
    }
    
    public final int getValue() {
        return this.value;
    }
    
    public static final class a
    {
        public static EnqueueAction a(final int n) {
            EnqueueAction enqueueAction;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        enqueueAction = EnqueueAction.REPLACE_EXISTING;
                    }
                    else {
                        enqueueAction = EnqueueAction.UPDATE_ACCORDINGLY;
                    }
                }
                else {
                    enqueueAction = EnqueueAction.DO_NOT_ENQUEUE_IF_EXISTING;
                }
            }
            else {
                enqueueAction = EnqueueAction.INCREMENT_FILE_NAME;
            }
            return enqueueAction;
        }
    }
}
