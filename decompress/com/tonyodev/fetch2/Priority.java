// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "Lcom/tonyodev/fetch2/Priority;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "HIGH", "NORMAL", "LOW", "fetch2_release" }, k = 1, mv = { 1, 4, 0 })
public enum Priority
{
    private static final Priority[] $VALUES;
    public static final a Companion;
    
    HIGH(1), 
    LOW(-1), 
    NORMAL(0);
    
    private final int value;
    
    static {
        Companion = new a();
    }
    
    private Priority(final int value) {
        this.value = value;
    }
    
    public static final Priority valueOf(final int n) {
        Priority.Companion.getClass();
        return a.a(n);
    }
    
    public final int getValue() {
        return this.value;
    }
    
    public static final class a
    {
        public static Priority a(final int n) {
            Priority priority;
            if (n != -1) {
                if (n != 0) {
                    if (n != 1) {
                        priority = Priority.NORMAL;
                    }
                    else {
                        priority = Priority.HIGH;
                    }
                }
                else {
                    priority = Priority.NORMAL;
                }
            }
            else {
                priority = Priority.LOW;
            }
            return priority;
        }
    }
}
