// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.postsubmit;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.image.model.ImageResolution;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019?\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004?\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e?\u0006\u0006\n\u0004\b\u0017\u0010\u0018?\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/postsubmit/PreviewImageModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/postsubmit/PreviewImageModel;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/image/model/ImageResolution;", "nullableImageResolutionAdapter", "Lcom/reddit/domain/model/postsubmit/CreatorKitResult$ImageInfo;", "nullableImageInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PreviewImageModelJsonAdapter extends JsonAdapter<PreviewImageModel>
{
    private volatile Constructor<PreviewImageModel> constructorRef;
    private final JsonAdapter<CreatorKitResult$ImageInfo> nullableImageInfoAdapter;
    private final JsonAdapter<ImageResolution> nullableImageResolutionAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PreviewImageModelJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "filePath", "caption", "link", "resolution", "imageInfo" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "filePath");
        this.nullableImageResolutionAdapter = (JsonAdapter<ImageResolution>)y.c((Type)ImageResolution.class, (Set)instance, "resolution");
        this.nullableImageInfoAdapter = (JsonAdapter<CreatorKitResult$ImageInfo>)y.c((Type)CreatorKitResult$ImageInfo.class, (Set)instance, "imageInfo");
    }
    
    public PreviewImageModel fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                if (e != 4) {
                                    continue;
                                }
                                o4 = this.nullableImageInfoAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFEF;
                            }
                            else {
                                o3 = this.nullableImageResolutionAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFF7;
                            }
                        }
                        else {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                continue;
                            }
                            throw a.n("link", "link", jsonReader);
                        }
                    }
                    else {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("caption", "caption", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("filePath", "filePath", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (n == -25) {
            if (s == null) {
                throw a.h("filePath", "filePath", jsonReader);
            }
            if (o == null) {
                throw a.h("caption", "caption", jsonReader);
            }
            if (o2 != null) {
                return new PreviewImageModel(s, (String)o, (String)o2, (ImageResolution)o3, (CreatorKitResult$ImageInfo)o4);
            }
            throw a.h("link", "link", jsonReader);
        }
        else {
            Constructor<PreviewImageModel> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = PreviewImageModel.class.getDeclaredConstructor(String.class, String.class, String.class, ImageResolution.class, CreatorKitResult$ImageInfo.class, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "PreviewImageModel::class\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("filePath", "filePath", jsonReader);
            }
            if (o == null) {
                throw a.h("caption", "caption", jsonReader);
            }
            if (o2 != null) {
                final PreviewImageModel instance = constructorRef.newInstance(s, o, o2, o3, o4, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("link", "link", jsonReader);
        }
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final PreviewImageModel previewImageModel) {
        e.f((Object)x, "writer");
        if (previewImageModel != null) {
            x.h();
            x.v("filePath");
            this.stringAdapter.toJson(x, (Object)previewImageModel.getFilePath());
            x.v("caption");
            this.stringAdapter.toJson(x, (Object)previewImageModel.getCaption());
            x.v("link");
            this.stringAdapter.toJson(x, (Object)previewImageModel.getLink());
            x.v("resolution");
            this.nullableImageResolutionAdapter.toJson(x, (Object)previewImageModel.getResolution());
            x.v("imageInfo");
            this.nullableImageInfoAdapter.toJson(x, (Object)previewImageModel.getImageInfo());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (PreviewImageModel)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PreviewImageModel)";
    }
}
