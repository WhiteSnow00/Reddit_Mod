// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lcom/reddit/data/richcontent/GifUserDataModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/richcontent/GifUserDataModel;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifUserDataModelJsonAdapter extends JsonAdapter<GifUserDataModel>
{
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public GifUserDataModelJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "username", "display_name", "profile_url" });
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "username");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s2 = null;
        String s3 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            continue;
                        }
                        s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                    else {
                        s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        return new GifUserDataModel(s, s2, s3);
    }
    
    public final void toJson(final x x, final Object o) {
        final GifUserDataModel gifUserDataModel = (GifUserDataModel)o;
        e.f((Object)x, "writer");
        if (gifUserDataModel != null) {
            x.h();
            x.v("username");
            this.nullableStringAdapter.toJson(x, (Object)gifUserDataModel.a);
            x.v("display_name");
            this.nullableStringAdapter.toJson(x, (Object)gifUserDataModel.b);
            x.v("profile_url");
            this.nullableStringAdapter.toJson(x, (Object)gifUserDataModel.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(GifUserDataModel)";
    }
}
