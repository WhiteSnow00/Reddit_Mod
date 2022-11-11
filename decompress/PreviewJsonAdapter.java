// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import id2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/PreviewJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Preview;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/model/Image;", "listOfImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/RedditVideo;", "nullableRedditVideoAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PreviewJsonAdapter extends JsonAdapter<Preview>
{
    private final JsonAdapter<List<Image>> listOfImageAdapter;
    private final JsonAdapter<RedditVideo> nullableRedditVideoAdapter;
    private final JsonReader$b options;
    
    public PreviewJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "images", "reddit_video_preview" });
        final a$b d = a0.d((Class)List.class, new Type[] { Image.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfImageAdapter = (JsonAdapter<List<Image>>)y.c((Type)d, (Set)instance, "images");
        this.nullableRedditVideoAdapter = (JsonAdapter<RedditVideo>)y.c((Type)RedditVideo.class, (Set)instance, "redditVideoPreview");
    }
    
    public Preview fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        List<Image> list = null;
        RedditVideo redditVideo = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    redditVideo = (RedditVideo)this.nullableRedditVideoAdapter.fromJson(jsonReader);
                }
                else {
                    list = (List)this.listOfImageAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("images", "images", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (list != null) {
            return new Preview(list, redditVideo);
        }
        throw a.h("images", "images", jsonReader);
    }
    
    public void toJson(final x x, final Preview preview) {
        e.f((Object)x, "writer");
        if (preview != null) {
            x.h();
            x.u("images");
            this.listOfImageAdapter.toJson(x, (Object)preview.getImages());
            x.u("reddit_video_preview");
            this.nullableRedditVideoAdapter.toJson(x, (Object)preview.getRedditVideoPreview());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Preview)";
    }
}
