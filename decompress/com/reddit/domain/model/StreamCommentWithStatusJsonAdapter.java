// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.streaming.AutoMuteStatus;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/StreamCommentWithStatusJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/StreamCommentWithStatus;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/streaming/AutoMuteStatus;", "autoMuteStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/LiveComment;", "liveCommentAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamCommentWithStatusJsonAdapter extends JsonAdapter<StreamCommentWithStatus>
{
    private final JsonAdapter<AutoMuteStatus> autoMuteStatusAdapter;
    private final JsonAdapter<LiveComment> liveCommentAdapter;
    private final JsonReader$b options;
    
    public StreamCommentWithStatusJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "autoMuteStatus", "comment" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.autoMuteStatusAdapter = (JsonAdapter<AutoMuteStatus>)y.c((Type)AutoMuteStatus.class, (Set)instance, "autoMuteStatus");
        this.liveCommentAdapter = (JsonAdapter<LiveComment>)y.c((Type)LiveComment.class, (Set)instance, "comment");
    }
    
    public StreamCommentWithStatus fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        AutoMuteStatus autoMuteStatus = null;
        LiveComment liveComment = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    liveComment = (LiveComment)this.liveCommentAdapter.fromJson(jsonReader);
                    if (liveComment != null) {
                        continue;
                    }
                    throw a.n("comment", "comment", jsonReader);
                }
                else {
                    autoMuteStatus = (AutoMuteStatus)this.autoMuteStatusAdapter.fromJson(jsonReader);
                    if (autoMuteStatus != null) {
                        continue;
                    }
                    throw a.n("autoMuteStatus", "autoMuteStatus", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (autoMuteStatus == null) {
            throw a.h("autoMuteStatus", "autoMuteStatus", jsonReader);
        }
        if (liveComment != null) {
            return new StreamCommentWithStatus(autoMuteStatus, liveComment);
        }
        throw a.h("comment", "comment", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final StreamCommentWithStatus streamCommentWithStatus) {
        e.f((Object)x, "writer");
        if (streamCommentWithStatus != null) {
            x.h();
            x.v("autoMuteStatus");
            this.autoMuteStatusAdapter.toJson(x, (Object)streamCommentWithStatus.getAutoMuteStatus());
            x.v("comment");
            this.liveCommentAdapter.toJson(x, (Object)streamCommentWithStatus.getComment());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (StreamCommentWithStatus)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamCommentWithStatus)";
    }
}
