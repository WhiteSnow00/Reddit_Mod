// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b" }, d2 = { "Lcom/tonyodev/fetch2core/Reason;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "NOT_SPECIFIED", "DOWNLOAD_ADDED", "DOWNLOAD_QUEUED", "DOWNLOAD_STARTED", "DOWNLOAD_WAITING_ON_NETWORK", "DOWNLOAD_PROGRESS_CHANGED", "DOWNLOAD_COMPLETED", "DOWNLOAD_ERROR", "DOWNLOAD_PAUSED", "DOWNLOAD_RESUMED", "DOWNLOAD_CANCELLED", "DOWNLOAD_REMOVED", "DOWNLOAD_DELETED", "DOWNLOAD_BLOCK_UPDATED", "OBSERVER_ATTACHED", "REPORTING", "fetch2core_release" }, k = 1, mv = { 1, 4, 0 })
public enum Reason
{
    private static final Reason[] $VALUES;
    public static final a Companion;
    
    DOWNLOAD_ADDED(1), 
    DOWNLOAD_BLOCK_UPDATED(13), 
    DOWNLOAD_CANCELLED(10), 
    DOWNLOAD_COMPLETED(6), 
    DOWNLOAD_DELETED(12), 
    DOWNLOAD_ERROR(7), 
    DOWNLOAD_PAUSED(8), 
    DOWNLOAD_PROGRESS_CHANGED(5), 
    DOWNLOAD_QUEUED(2), 
    DOWNLOAD_REMOVED(11), 
    DOWNLOAD_RESUMED(9), 
    DOWNLOAD_STARTED(3), 
    DOWNLOAD_WAITING_ON_NETWORK(4), 
    NOT_SPECIFIED(0), 
    OBSERVER_ATTACHED(14), 
    REPORTING(15);
    
    private final int value;
    
    static {
        Companion = new a();
    }
    
    private Reason(final int value) {
        this.value = value;
    }
    
    public static final Reason valueOf(final int n) {
        Reason.Companion.getClass();
        Reason reason = null;
        switch (n) {
            default: {
                reason = Reason.NOT_SPECIFIED;
                break;
            }
            case 15: {
                reason = Reason.REPORTING;
                break;
            }
            case 14: {
                reason = Reason.OBSERVER_ATTACHED;
                break;
            }
            case 13: {
                reason = Reason.DOWNLOAD_BLOCK_UPDATED;
                break;
            }
            case 12: {
                reason = Reason.DOWNLOAD_DELETED;
                break;
            }
            case 11: {
                reason = Reason.DOWNLOAD_REMOVED;
                break;
            }
            case 10: {
                reason = Reason.DOWNLOAD_CANCELLED;
                break;
            }
            case 9: {
                reason = Reason.DOWNLOAD_RESUMED;
                break;
            }
            case 8: {
                reason = Reason.DOWNLOAD_PAUSED;
                break;
            }
            case 7: {
                reason = Reason.DOWNLOAD_ERROR;
                break;
            }
            case 6: {
                reason = Reason.DOWNLOAD_COMPLETED;
                break;
            }
            case 5: {
                reason = Reason.DOWNLOAD_PROGRESS_CHANGED;
                break;
            }
            case 4: {
                reason = Reason.DOWNLOAD_WAITING_ON_NETWORK;
                break;
            }
            case 3: {
                reason = Reason.DOWNLOAD_STARTED;
                break;
            }
            case 2: {
                reason = Reason.DOWNLOAD_QUEUED;
                break;
            }
            case 1: {
                reason = Reason.DOWNLOAD_ADDED;
                break;
            }
        }
        return reason;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    public static final class a
    {
    }
}
