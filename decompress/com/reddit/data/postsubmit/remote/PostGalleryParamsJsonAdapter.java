// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.remote;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
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
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "sr", "api_type", "show_error_list", "title", "text", "spoiler", "nsfw", "flair_id", "flair_text", "discussion_type", "items", "validate_on_submit" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "subreddit");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "showErrorList");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "text");
        this.nullableListOfGalleryItemAdapter = (JsonAdapter<List<GalleryItem>>)y.c((Type)a0.d((Class)List.class, new Type[] { GalleryItem.class }), (Set)instance, "items");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        List<GalleryItem> list = null;
        List<GalleryItem> list2;
        Object o = list2 = list;
        Object o3;
        Object o2 = o3 = list2;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o8;
        String s = (String)(o8 = o7);
        while (jsonReader.hasNext()) {
            Object o9 = null;
            Boolean b3 = null;
            Object o10 = null;
            List<GalleryItem> list3 = null;
            Label_0606: {
                Boolean b6 = null;
                List<GalleryItem> list4 = null;
                Label_0600: {
                    Label_0597: {
                        Label_0594: {
                            Label_0591: {
                                Label_0588: {
                                    Label_0584: {
                                        switch (jsonReader.F(this.options)) {
                                            case 11: {
                                                final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b2 != null) {
                                                    o9 = s;
                                                    b3 = b2;
                                                    o10 = o5;
                                                    break Label_0591;
                                                }
                                                throw a.n("validateOnSubmit", "validate_on_submit", jsonReader);
                                            }
                                            case 10: {
                                                o8 = this.nullableListOfGalleryItemAdapter.fromJson(jsonReader);
                                                break;
                                            }
                                            case 9: {
                                                o9 = this.nullableStringAdapter.fromJson(jsonReader);
                                                break Label_0584;
                                            }
                                            case 8: {
                                                o7 = this.stringAdapter.fromJson(jsonReader);
                                                if (o7 != null) {
                                                    o9 = s;
                                                    b3 = b;
                                                    o10 = o5;
                                                    break Label_0591;
                                                }
                                                throw a.n("flairText", "flair_text", jsonReader);
                                            }
                                            case 7: {
                                                o6 = this.stringAdapter.fromJson(jsonReader);
                                                if (o6 != null) {
                                                    o9 = s;
                                                    b3 = b;
                                                    o10 = o5;
                                                    break Label_0591;
                                                }
                                                throw a.n("flairId", "flair_id", jsonReader);
                                            }
                                            case 6: {
                                                final Boolean b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b4 != null) {
                                                    o9 = s;
                                                    o10 = o5;
                                                    b3 = b;
                                                    list3 = (List<GalleryItem>)b4;
                                                    break Label_0594;
                                                }
                                                throw a.n("isNsfw", "nsfw", jsonReader);
                                            }
                                            case 5: {
                                                final Boolean b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b5 != null) {
                                                    o9 = s;
                                                    o10 = o5;
                                                    b3 = b;
                                                    list3 = list;
                                                    b6 = b5;
                                                    break Label_0597;
                                                }
                                                throw a.n("isSpoiler", "spoiler", jsonReader);
                                            }
                                            case 4: {
                                                o10 = this.nullableStringAdapter.fromJson(jsonReader);
                                                o9 = s;
                                                break Label_0588;
                                            }
                                            case 3: {
                                                o4 = this.stringAdapter.fromJson(jsonReader);
                                                if (o4 != null) {
                                                    o9 = s;
                                                    o10 = o5;
                                                    b3 = b;
                                                    list3 = list;
                                                    b6 = (Boolean)o;
                                                    break Label_0597;
                                                }
                                                throw a.n("title", "title", jsonReader);
                                            }
                                            case 2: {
                                                final Boolean b7 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b7 != null) {
                                                    o9 = s;
                                                    o10 = o5;
                                                    b3 = b;
                                                    list3 = list;
                                                    b6 = (Boolean)o;
                                                    list4 = (List<GalleryItem>)b7;
                                                    break Label_0600;
                                                }
                                                throw a.n("showErrorList", "show_error_list", jsonReader);
                                            }
                                            case 1: {
                                                o3 = this.stringAdapter.fromJson(jsonReader);
                                                if (o3 != null) {
                                                    o9 = s;
                                                    o10 = o5;
                                                    b3 = b;
                                                    list3 = list;
                                                    break Label_0606;
                                                }
                                                throw a.n("apiType", "api_type", jsonReader);
                                            }
                                            case 0: {
                                                o2 = this.stringAdapter.fromJson(jsonReader);
                                                if (o2 != null) {
                                                    continue;
                                                }
                                                throw a.n("subreddit", "sr", jsonReader);
                                            }
                                            case -1: {
                                                jsonReader.J();
                                                jsonReader.z1();
                                                break;
                                            }
                                        }
                                        o9 = s;
                                    }
                                    o10 = o5;
                                }
                                b3 = b;
                            }
                            list3 = list;
                        }
                        b6 = (Boolean)o;
                    }
                    list4 = list2;
                }
                list2 = list4;
                o = b6;
            }
            b = b3;
            list = list3;
            o5 = o10;
            s = (String)o9;
        }
        jsonReader.r();
        if (o2 == null) {
            throw a.h("subreddit", "sr", jsonReader);
        }
        if (o3 == null) {
            throw a.h("apiType", "api_type", jsonReader);
        }
        if (list2 == null) {
            throw a.h("showErrorList", "show_error_list", jsonReader);
        }
        final boolean booleanValue = (boolean)list2;
        if (o4 == null) {
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
        if (o6 == null) {
            throw a.h("flairId", "flair_id", jsonReader);
        }
        if (o7 == null) {
            throw a.h("flairText", "flair_text", jsonReader);
        }
        if (b != null) {
            return new PostGalleryParams((String)o2, (String)o3, booleanValue, (String)o4, (String)o5, booleanValue2, booleanValue3, (String)o6, (String)o7, s, (List<GalleryItem>)o8, b);
        }
        throw a.h("validateOnSubmit", "validate_on_submit", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final PostGalleryParams postGalleryParams = (PostGalleryParams)o;
        f.f((Object)x, "writer");
        if (postGalleryParams != null) {
            x.h();
            x.w("sr");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.a);
            x.w("api_type");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.b);
            x.w("show_error_list");
            a.v(postGalleryParams.c, (JsonAdapter)this.booleanAdapter, x, "title");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.d);
            x.w("text");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryParams.e);
            x.w("spoiler");
            a.v(postGalleryParams.f, (JsonAdapter)this.booleanAdapter, x, "nsfw");
            a.v(postGalleryParams.g, (JsonAdapter)this.booleanAdapter, x, "flair_id");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.h);
            x.w("flair_text");
            this.stringAdapter.toJson(x, (Object)postGalleryParams.i);
            x.w("discussion_type");
            this.nullableStringAdapter.toJson(x, (Object)postGalleryParams.j);
            x.w("items");
            this.nullableListOfGalleryItemAdapter.toJson(x, (Object)postGalleryParams.k);
            x.w("validate_on_submit");
            c.u(postGalleryParams.l, this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(PostGalleryParams)";
    }
}
