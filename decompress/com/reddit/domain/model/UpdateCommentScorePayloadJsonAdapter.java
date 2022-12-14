// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import java.io.Serializable;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014?\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0013\u0010\u0011?\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/UpdateCommentScorePayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/UpdateCommentScorePayload;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class UpdateCommentScorePayloadJsonAdapter extends JsonAdapter<UpdateCommentScorePayload>
{
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public UpdateCommentScorePayloadJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "subreddit_id", "link_id", "name", "score" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "subredditKindWithId");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "commentScore");
    }
    
    public UpdateCommentScorePayload fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s2 = null;
        Integer n;
        Serializable s3 = n = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                continue;
                            }
                            n = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n != null) {
                                continue;
                            }
                            throw a.n("commentScore", "score", jsonReader);
                        }
                        else {
                            s3 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                continue;
                            }
                            throw a.n("commentKindWithId", "name", jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("linkKindWithId", "link_id", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("subredditKindWithId", "subreddit_id", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("subredditKindWithId", "subreddit_id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("linkKindWithId", "link_id", jsonReader);
        }
        if (s3 == null) {
            throw a.h("commentKindWithId", "name", jsonReader);
        }
        if (n != null) {
            return new UpdateCommentScorePayload(s, s2, (String)s3, (int)n);
        }
        throw a.h("commentScore", "score", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final UpdateCommentScorePayload updateCommentScorePayload) {
        e.f((Object)x, "writer");
        if (updateCommentScorePayload != null) {
            x.h();
            x.v("subreddit_id");
            this.stringAdapter.toJson(x, (Object)updateCommentScorePayload.getSubredditKindWithId());
            x.v("link_id");
            this.stringAdapter.toJson(x, (Object)updateCommentScorePayload.getLinkKindWithId());
            x.v("name");
            this.stringAdapter.toJson(x, (Object)updateCommentScorePayload.getCommentKindWithId());
            x.v("score");
            this.intAdapter.toJson(x, (Object)updateCommentScorePayload.getCommentScore());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (UpdateCommentScorePayload)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(UpdateCommentScorePayload)";
    }
}
