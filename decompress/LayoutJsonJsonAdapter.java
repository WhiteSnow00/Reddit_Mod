// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import qd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import t60.a;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/LayoutJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/LayoutJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lt60/a;", "listOfLayoutSectionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/LayoutMetadata;", "layoutMetadataAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class LayoutJsonJsonAdapter extends JsonAdapter<LayoutJson>
{
    private final JsonAdapter<LayoutMetadata> layoutMetadataAdapter;
    private final JsonAdapter<List<a>> listOfLayoutSectionAdapter;
    private final JsonReader$b options;
    
    public LayoutJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "sections", "metadata" });
        final a$b d = a0.d((Class)List.class, new Type[] { a.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfLayoutSectionAdapter = (JsonAdapter<List<a>>)y.c((Type)d, (Set)instance, "sections");
        this.layoutMetadataAdapter = (JsonAdapter<LayoutMetadata>)y.c((Type)LayoutMetadata.class, (Set)instance, "metadata");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        List<? extends a> list = null;
        LayoutMetadata layoutMetadata = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    layoutMetadata = (LayoutMetadata)this.layoutMetadataAdapter.fromJson(jsonReader);
                    if (layoutMetadata != null) {
                        continue;
                    }
                    throw qd2.a.n("metadata", "metadata", jsonReader);
                }
                else {
                    list = (List)this.listOfLayoutSectionAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw qd2.a.n("sections", "sections", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (list == null) {
            throw qd2.a.h("sections", "sections", jsonReader);
        }
        if (layoutMetadata != null) {
            return new LayoutJson(list, layoutMetadata);
        }
        throw qd2.a.h("metadata", "metadata", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final LayoutJson layoutJson = (LayoutJson)o;
        f.f((Object)x, "writer");
        if (layoutJson != null) {
            x.h();
            x.w("sections");
            this.listOfLayoutSectionAdapter.toJson(x, (Object)layoutJson.a);
            x.w("metadata");
            this.layoutMetadataAdapter.toJson(x, (Object)layoutJson.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(LayoutJson)";
    }
}
