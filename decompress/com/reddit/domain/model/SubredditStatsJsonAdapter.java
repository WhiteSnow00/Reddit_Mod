// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/SubredditStatsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/SubredditStats;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditStatsJsonAdapter extends JsonAdapter<SubredditStats>
{
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader$b options;
    
    public SubredditStatsJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "commenter_count", "subscribes", "post_count", "comment_count", "voter_count", "vote_count", "unique_users", "poster_count" });
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)EmptySet.INSTANCE, "commenterCount");
    }
    
    public SubredditStats fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Integer n2;
        Integer n = n2 = null;
        Integer n4;
        Integer n3 = n4 = n2;
        Integer n6;
        Integer n5 = n6 = n4;
        Integer n8;
        Integer n7 = n8 = n6;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 7: {
                    n8 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    n7 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    n6 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    n5 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    n4 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    n3 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    n2 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    n = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.F1();
                    continue;
                }
            }
        }
        jsonReader.r();
        return new SubredditStats(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void toJson(final x x, final SubredditStats subredditStats) {
        e.f((Object)x, "writer");
        if (subredditStats != null) {
            x.h();
            x.u("commenter_count");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getCommenterCount());
            x.u("subscribes");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getSubscribes());
            x.u("post_count");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getPostCount());
            x.u("comment_count");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getCommentCount());
            x.u("voter_count");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getVoterCount());
            x.u("vote_count");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getVoteCount());
            x.u("unique_users");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getUniqueUsers());
            x.u("poster_count");
            this.nullableIntAdapter.toJson(x, (Object)subredditStats.getPosterCount());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditStats)";
    }
}
