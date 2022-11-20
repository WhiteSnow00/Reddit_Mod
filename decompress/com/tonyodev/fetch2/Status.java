// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015" }, d2 = { "Lcom/tonyodev/fetch2/Status;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "NONE", "QUEUED", "DOWNLOADING", "PAUSED", "COMPLETED", "CANCELLED", "FAILED", "REMOVED", "DELETED", "ADDED", "fetch2_release" }, k = 1, mv = { 1, 4, 0 })
public enum Status
{
    private static final Status[] $VALUES;
    
    ADDED(9), 
    CANCELLED(5), 
    COMPLETED(4);
    
    public static final a Companion;
    
    DELETED(8), 
    DOWNLOADING(2), 
    FAILED(6), 
    NONE(0), 
    PAUSED(3), 
    QUEUED(1), 
    REMOVED(7);
    
    private final int value;
    
    static {
        Companion = new a();
    }
    
    private Status(final int value) {
        this.value = value;
    }
    
    public static final Status valueOf(final int n) {
        Status.Companion.getClass();
        return a.a(n);
    }
    
    public final int getValue() {
        return this.value;
    }
    
    public static final class a
    {
        public static Status a(final int n) {
            Status status = null;
            switch (n) {
                default: {
                    status = Status.NONE;
                    break;
                }
                case 9: {
                    status = Status.ADDED;
                    break;
                }
                case 8: {
                    status = Status.DELETED;
                    break;
                }
                case 7: {
                    status = Status.REMOVED;
                    break;
                }
                case 6: {
                    status = Status.FAILED;
                    break;
                }
                case 5: {
                    status = Status.CANCELLED;
                    break;
                }
                case 4: {
                    status = Status.COMPLETED;
                    break;
                }
                case 3: {
                    status = Status.PAUSED;
                    break;
                }
                case 2: {
                    status = Status.DOWNLOADING;
                    break;
                }
                case 1: {
                    status = Status.QUEUED;
                    break;
                }
                case 0: {
                    status = Status.NONE;
                    break;
                }
            }
            return status;
        }
    }
}
