// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t?\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0007\u0010\b?\u0006\r" }, d2 = { "Lcom/reddit/data/richcontent/GifDetailResponseDataModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/richcontent/GifDetailResponseDataModel;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/data/richcontent/GifItemDataModel;", "gifItemDataModelAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifDetailResponseDataModelJsonAdapter extends JsonAdapter<GifDetailResponseDataModel>
{
    private final JsonAdapter<GifItemDataModel> gifItemDataModelAdapter;
    private final JsonReader$b options;
    
    public GifDetailResponseDataModelJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "data" });
        this.gifItemDataModelAdapter = (JsonAdapter<GifItemDataModel>)y.c((Type)GifItemDataModel.class, (Set)EmptySet.INSTANCE, "data");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        GifItemDataModel gifItemDataModel = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    continue;
                }
                gifItemDataModel = (GifItemDataModel)this.gifItemDataModelAdapter.fromJson(jsonReader);
                if (gifItemDataModel != null) {
                    continue;
                }
                throw a.n("data_", "data", jsonReader);
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (gifItemDataModel != null) {
            return new GifDetailResponseDataModel(gifItemDataModel);
        }
        throw a.h("data_", "data", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final GifDetailResponseDataModel gifDetailResponseDataModel = (GifDetailResponseDataModel)o;
        e.f((Object)x, "writer");
        if (gifDetailResponseDataModel != null) {
            x.h();
            x.v("data");
            this.gifItemDataModelAdapter.toJson(x, (Object)gifDetailResponseDataModel.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(GifDetailResponseDataModel)";
    }
}
