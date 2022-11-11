// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.image.model.ImageResolution;
import com.reddit.ads.link.models.AdEvent;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/PostGalleryItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/PostGalleryItem;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "Lcom/reddit/domain/image/model/ImageResolution;", "nullableListOfImageResolutionAdapter", "Lcom/reddit/ads/link/models/AdEvent;", "nullableListOfAdEventAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostGalleryItemJsonAdapter extends JsonAdapter<PostGalleryItem>
{
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<AdEvent>> nullableListOfAdEventAdapter;
    private final JsonAdapter<List<ImageResolution>> nullableListOfImageResolutionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public PostGalleryItemJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "caption", "height", "media_id", "mimeType", "outbound_url", "resolutions", "url", "userId", "width", "call_to_action", "display_address", "display_url", "adEvents", "obfuscated_resolutions" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "caption");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "height");
        this.nullableListOfImageResolutionAdapter = (JsonAdapter<List<ImageResolution>>)y.c((Type)a0.d((Class)List.class, new Type[] { ImageResolution.class }), (Set)instance, "resolutions");
        this.nullableListOfAdEventAdapter = (JsonAdapter<List<AdEvent>>)y.c((Type)a0.d((Class)List.class, new Type[] { AdEvent.class }), (Set)instance, "adEvents");
    }
    
    public PostGalleryItem fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        Object o8;
        Object o7 = o8 = o6;
        Object o10;
        Object o9 = o10 = o8;
        Object o12;
        Object o11 = o12 = o10;
        Object o14;
        Object o13 = o14 = o12;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 13: {
                    o14 = this.nullableListOfImageResolutionAdapter.fromJson(jsonReader);
                    continue;
                }
                case 12: {
                    o13 = this.nullableListOfAdEventAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    o12 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o10 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o9 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o6 = this.nullableListOfImageResolutionAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o2 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
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
        return new PostGalleryItem((String)o, (Integer)o2, (String)o3, (String)o4, (String)o5, (List)o6, (String)o7, (String)o8, (Integer)o9, (String)o10, (String)o11, (String)o12, (List)o13, (List)o14);
    }
    
    public void toJson(final x x, final PostGalleryItem postGalleryItem) {
        e.f((Object)x, "writer");
        if (postGalleryItem != null) {
            x.h();
            x.u("caption");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getCaption());
            x.u("height");
            this.nullableIntAdapter.toJson(x, (Object)postGalleryItem.getHeight());
            x.u("media_id");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getMediaId());
            x.u("mimeType");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getMimeType());
            x.u("outbound_url");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getOutboundUrl());
            x.u("resolutions");
            this.nullableListOfImageResolutionAdapter.toJson(x, (Object)postGalleryItem.getResolutions());
            x.u("url");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getUrl());
            x.u("userId");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getUserId());
            x.u("width");
            this.nullableIntAdapter.toJson(x, (Object)postGalleryItem.getWidth());
            x.u("call_to_action");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getCallToAction());
            x.u("display_address");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getDisplayAddress());
            x.u("display_url");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryItem.getDisplayUrl());
            x.u("adEvents");
            this.nullableListOfAdEventAdapter.toJson(x, (Object)postGalleryItem.getAdEvents());
            x.u("obfuscated_resolutions");
            this.nullableListOfImageResolutionAdapter.toJson(x, (Object)postGalleryItem.getObfuscatedResolutions());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PostGalleryItem)";
    }
}
