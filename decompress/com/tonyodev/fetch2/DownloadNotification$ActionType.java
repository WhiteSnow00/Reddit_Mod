// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "com/tonyodev/fetch2/DownloadNotification$ActionType", "", "Lcom/tonyodev/fetch2/DownloadNotification$ActionType;", "<init>", "(Ljava/lang/String;I)V", "PAUSE", "RESUME", "CANCEL", "DELETE", "RETRY", "PAUSE_ALL", "RESUME_ALL", "CANCEL_ALL", "DELETE_ALL", "RETRY_ALL", "fetch2_release" }, k = 1, mv = { 1, 4, 0 })
public enum DownloadNotification$ActionType
{
    private static final DownloadNotification$ActionType[] $VALUES;
    
    CANCEL, 
    CANCEL_ALL, 
    DELETE, 
    DELETE_ALL, 
    PAUSE, 
    PAUSE_ALL, 
    RESUME, 
    RESUME_ALL, 
    RETRY, 
    RETRY_ALL;
}
