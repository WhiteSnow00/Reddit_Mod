// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.remote;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.postsubmit.GalleryItem;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013" }, d2 = { "Lcom/reddit/data/postsubmit/remote/PostGalleryParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/postsubmit/remote/PostGalleryParams;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableStringAdapter", "", "Lcom/reddit/domain/model/postsubmit/GalleryItem;", "nullableListOfGalleryItemAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostGalleryParamsJsonAdapter extends JsonAdapter<PostGalleryParams>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<GalleryItem>> nullableListOfGalleryItemAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PostGalleryParamsJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "sr", "api_type", "show_error_list", "title", "text", "spoiler", "nsfw", "flair_id", "flair_text", "discussion_type", "items", "validate_on_submit" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "subreddit");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "showErrorList");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "text");
        this.nullableListOfGalleryItemAdapter = (JsonAdapter<List<GalleryItem>>)y.c((Type)a0.d((Class)List.class, new Type[] { GalleryItem.class }), (Set)instance, "items");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        List list = null;
        Object o2;
        Object o = o2 = list;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        Object o8;
        Object o7 = o8 = o6;
        Object o10;
        Object o9 = o10 = o8;
        while (jsonReader.hasNext()) {
            Object o11 = null;
            Boolean b3 = null;
            Object o12 = null;
            Object o13 = null;
            Label_0589: {
                List list2 = null;
                Object o14 = null;
                Label_0584: {
                    Label_0581: {
                        Label_0577: {
                            Label_0575: {
                                Label_0571: {
                                    Label_0568: {
                                        switch (jsonReader.E(this.options)) {
                                            case 11: {
                                                final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b2 != null) {
                                                    o11 = o6;
                                                    b3 = b2;
                                                    break Label_0571;
                                                }
                                                throw a.n("validateOnSubmit", "validate_on_submit", jsonReader);
                                            }
                                            case 10: {
                                                o10 = this.nullableListOfGalleryItemAdapter.fromJson(jsonReader);
                                                break;
                                            }
                                            case 9: {
                                                o9 = this.nullableStringAdapter.fromJson(jsonReader);
                                                break;
                                            }
                                            case 8: {
                                                o8 = this.stringAdapter.fromJson(jsonReader);
                                                if (o8 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    break Label_0571;
                                                }
                                                throw a.n("flairText", "flair_text", jsonReader);
                                            }
                                            case 7: {
                                                o12 = this.stringAdapter.fromJson(jsonReader);
                                                if (o12 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    break Label_0575;
                                                }
                                                throw a.n("flairId", "flair_id", jsonReader);
                                            }
                                            case 6: {
                                                final Boolean b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b4 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    list2 = (List)b4;
                                                    o12 = o7;
                                                    break Label_0577;
                                                }
                                                throw a.n("isNsfw", "nsfw", jsonReader);
                                            }
                                            case 5: {
                                                final Boolean b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b5 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    o12 = o7;
                                                    list2 = list;
                                                    o13 = b5;
                                                    break Label_0581;
                                                }
                                                throw a.n("isSpoiler", "spoiler", jsonReader);
                                            }
                                            case 4: {
                                                o11 = this.nullableStringAdapter.fromJson(jsonReader);
                                                break Label_0568;
                                            }
                                            case 3: {
                                                o5 = this.stringAdapter.fromJson(jsonReader);
                                                if (o5 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    o12 = o7;
                                                    list2 = list;
                                                    o13 = o;
                                                    break Label_0581;
                                                }
                                                throw a.n("title", "title", jsonReader);
                                            }
                                            case 2: {
                                                final Boolean b6 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b6 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    o12 = o7;
                                                    list2 = list;
                                                    o13 = o;
                                                    o14 = b6;
                                                    break Label_0584;
                                                }
                                                throw a.n("showErrorList", "show_error_list", jsonReader);
                                            }
                                            case 1: {
                                                o4 = this.stringAdapter.fromJson(jsonReader);
                                                if (o4 != null) {
                                                    o11 = o6;
                                                    b3 = b;
                                                    o12 = o7;
                                                    o13 = o;
                                                    break Label_0589;
                                                }
                                                throw a.n("apiType", "api_type", jsonReader);
                                            }
                                            case 0: {
                                                o3 = this.stringAdapter.fromJson(jsonReader);
                                                if (o3 != null) {
                                                    continue;
                                                }
                                                throw a.n("subreddit", "sr", jsonReader);
                                            }
                                            case -1: {
                                                jsonReader.H();
                                                jsonReader.F1();
                                                break;
                                            }
                                        }
                                        o11 = o6;
                                    }
                                    b3 = b;
                                }
                                o12 = o7;
                            }
                            list2 = list;
                        }
                        o13 = o;
                    }
                    o14 = o2;
                }
                o2 = o14;
                list = list2;
            }
            b = b3;
            o = o13;
            o6 = o11;
            o7 = o12;
        }
        jsonReader.r();
        if (o3 == null) {
            throw a.h("subreddit", "sr", jsonReader);
        }
        if (o4 == null) {
            throw a.h("apiType", "api_type", jsonReader);
        }
        if (o2 == null) {
            throw a.h("showErrorList", "show_error_list", jsonReader);
        }
        final boolean booleanValue = (boolean)o2;
        if (o5 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (o == null) {
            throw a.h("isSpoiler", "spoiler", jsonReader);
        }
        final boolean booleanValue2 = (boolean)o;
        if (list == null) {
            throw a.h("isNsfw", "nsfw", jsonReader);
        }
        final boolean booleanValue3 = (boolean)list;
        if (o7 == null) {
            throw a.h("flairId", "flair_id", jsonReader);
        }
        if (o8 == null) {
            throw a.h("flairText", "flair_text", jsonReader);
        }
        if (b != null) {
            return new PostGalleryParams((String)o3, (String)o4, booleanValue, (String)o5, (String)o6, booleanValue2, booleanValue3, (String)o7, (String)o8, (String)o9, (List)o10, (boolean)b);
        }
        throw a.h("validateOnSubmit", "validate_on_submit", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final PostGalleryParams postGalleryParams = (PostGalleryParams)o;
        e.f((Object)x, "writer");
        if (postGalleryParams != null) {
            x.h();
            x.u("sr");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.a);
            x.u("api_type");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.b);
            x.u("show_error_list");
            a81.e.C(postGalleryParams.c, (JsonAdapter)this.booleanAdapter, x, "title");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.d);
            x.u("text");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryParams.e);
            x.u("spoiler");
            a81.e.C(postGalleryParams.f, (JsonAdapter)this.booleanAdapter, x, "nsfw");
            a81.e.C(postGalleryParams.g, (JsonAdapter)this.booleanAdapter, x, "flair_id");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.h);
            x.u("flair_text");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.i);
            x.u("discussion_type");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryParams.j);
            x.u("items");
            this.nullableListOfGalleryItemAdapter.toJson(x, (Object)postGalleryParams.k);
            x.u("validate_on_submit");
            d.B(postGalleryParams.l, (JsonAdapter)this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(PostGalleryParams)";
    }
}
