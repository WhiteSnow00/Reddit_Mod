// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
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

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lcom/reddit/data/richcontent/GifResponseDataModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/richcontent/GifResponseDataModel;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/data/richcontent/GifItemDataModel;", "listOfGifItemDataModelAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifResponseDataModelJsonAdapter extends JsonAdapter<GifResponseDataModel>
{
    private final JsonAdapter<List<GifItemDataModel>> listOfGifItemDataModelAdapter;
    private final JsonReader$b options;
    
    public GifResponseDataModelJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "data" });
        this.listOfGifItemDataModelAdapter = (JsonAdapter<List<GifItemDataModel>>)y.c((Type)a0.d((Class)List.class, new Type[] { GifItemDataModel.class }), (Set)EmptySet.INSTANCE, "data");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        List<GifItemDataModel> list = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    continue;
                }
                list = (List)this.listOfGifItemDataModelAdapter.fromJson(jsonReader);
                if (list != null) {
                    continue;
                }
                throw a.n("data_", "data", jsonReader);
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (list != null) {
            return new GifResponseDataModel(list);
        }
        throw a.h("data_", "data", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final GifResponseDataModel gifResponseDataModel = (GifResponseDataModel)o;
        e.f((Object)x, "writer");
        if (gifResponseDataModel != null) {
            x.h();
            x.u("data");
            this.listOfGifItemDataModelAdapter.toJson(x, (Object)gifResponseDataModel.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(GifResponseDataModel)";
    }
}
