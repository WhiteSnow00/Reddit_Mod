// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/streaming/PostStreamNavigationModel;", "", "awards", "", "Landroid/os/Parcelable;", "getAwards", "()Ljava/util/List;", "broadcastTimeLabel", "", "getBroadcastTimeLabel", "()Ljava/lang/String;", "downvotes", "getDownvotes", "reportReason", "getReportReason", "streamId", "getStreamId", "uniqueWatchersLabel", "getUniqueWatchersLabel", "upvotes", "getUpvotes", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface PostStreamNavigationModel
{
    List<Parcelable> getAwards();
    
    String getBroadcastTimeLabel();
    
    String getDownvotes();
    
    String getReportReason();
    
    String getStreamId();
    
    String getUniqueWatchersLabel();
    
    String getUpvotes();
}
