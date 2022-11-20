// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core;

import kotlin.Metadata;
import java.io.Serializable;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0013\u001a\u00020\u0000H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0012\u0010\u0011\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014" }, d2 = { "Lcom/tonyodev/fetch2core/DownloadBlock;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "blockPosition", "", "getBlockPosition", "()I", "downloadId", "getDownloadId", "downloadedBytes", "", "getDownloadedBytes", "()J", "endByte", "getEndByte", "progress", "getProgress", "startByte", "getStartByte", "copy", "fetch2core_release" }, k = 1, mv = { 1, 1, 16 })
public interface DownloadBlock extends Parcelable, Serializable
{
    DownloadBlock copy();
    
    int getBlockPosition();
    
    int getDownloadId();
    
    long getDownloadedBytes();
    
    long getEndByte();
    
    int getProgress();
    
    long getStartByte();
}
