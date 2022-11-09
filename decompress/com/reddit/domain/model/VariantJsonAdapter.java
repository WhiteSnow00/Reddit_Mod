// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import qd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import com.reddit.domain.image.model.ImageResolution;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/VariantJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Variant;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/image/model/ImageResolution;", "listOfImageResolutionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "imageResolutionAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class VariantJsonAdapter extends JsonAdapter<Variant>
{
    private final JsonAdapter<ImageResolution> imageResolutionAdapter;
    private final JsonAdapter<List<ImageResolution>> listOfImageResolutionAdapter;
    private final JsonReader$b options;
    
    public VariantJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "resolutions", "source" });
        final a$b d = a0.d((Class)List.class, new Type[] { ImageResolution.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfImageResolutionAdapter = (JsonAdapter<List<ImageResolution>>)y.c((Type)d, (Set)instance, "resolutions");
        this.imageResolutionAdapter = (JsonAdapter<ImageResolution>)y.c((Type)ImageResolution.class, (Set)instance, "source");
    }
    
    public Variant fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        List<ImageResolution> list = null;
        ImageResolution imageResolution = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    imageResolution = (ImageResolution)this.imageResolutionAdapter.fromJson(jsonReader);
                    if (imageResolution != null) {
                        continue;
                    }
                    throw a.n("source", "source", jsonReader);
                }
                else {
                    list = (List)this.listOfImageResolutionAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("resolutions", "resolutions", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (list == null) {
            throw a.h("resolutions", "resolutions", jsonReader);
        }
        if (imageResolution != null) {
            return new Variant(list, imageResolution);
        }
        throw a.h("source", "source", jsonReader);
    }
    
    public void toJson(final x x, final Variant variant) {
        f.f((Object)x, "writer");
        if (variant != null) {
            x.h();
            x.w("resolutions");
            this.listOfImageResolutionAdapter.toJson(x, (Object)variant.getResolutions());
            x.w("source");
            this.imageResolutionAdapter.toJson(x, (Object)variant.getSource());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Variant)";
    }
}
