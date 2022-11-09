// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

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
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u0012" }, d2 = { "Lcom/reddit/data/richcontent/GifItemDataModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/richcontent/GifItemDataModel;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/data/richcontent/GifImageDataModel;", "mapOfStringGifImageDataModelAdapter", "Lcom/reddit/data/richcontent/GifUserDataModel;", "nullableGifUserDataModelAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifItemDataModelJsonAdapter extends JsonAdapter<GifItemDataModel>
{
    private final JsonAdapter<Map<String, GifImageDataModel>> mapOfStringGifImageDataModelAdapter;
    private final JsonAdapter<GifUserDataModel> nullableGifUserDataModelAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public GifItemDataModelJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "images", "user" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.mapOfStringGifImageDataModelAdapter = (JsonAdapter<Map<String, GifImageDataModel>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, GifImageDataModel.class }), (Set)instance, "images");
        this.nullableGifUserDataModelAdapter = (JsonAdapter<GifUserDataModel>)y.c((Type)GifUserDataModel.class, (Set)instance, "user");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        o2 = this.nullableGifUserDataModelAdapter.fromJson(jsonReader);
                    }
                    else {
                        o = this.mapOfStringGifImageDataModelAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("images", "images", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o != null) {
            return new GifItemDataModel(s, (Map<String, GifImageDataModel>)o, (GifUserDataModel)o2);
        }
        throw a.h("images", "images", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final GifItemDataModel gifItemDataModel = (GifItemDataModel)o;
        f.f((Object)x, "writer");
        if (gifItemDataModel != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)gifItemDataModel.a);
            x.w("images");
            this.mapOfStringGifImageDataModelAdapter.toJson(x, (Object)gifItemDataModel.b);
            x.w("user");
            this.nullableGifUserDataModelAdapter.toJson(x, (Object)gifItemDataModel.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(GifItemDataModel)";
    }
}
