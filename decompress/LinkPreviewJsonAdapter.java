// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

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
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/data/model/v1/LinkPreviewJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/v1/LinkPreview;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/data/model/v1/ImageResolution;", "nullableImageResolutionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfImageResolutionAdapter", "Lcom/reddit/data/model/v1/RedditVideo;", "nullableRedditVideoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkPreviewJsonAdapter extends JsonAdapter<LinkPreview>
{
    private volatile Constructor<LinkPreview> constructorRef;
    private final JsonAdapter<List<ImageResolution>> listOfImageResolutionAdapter;
    private final JsonAdapter<ImageResolution> nullableImageResolutionAdapter;
    private final JsonAdapter<RedditVideo> nullableRedditVideoAdapter;
    private final JsonReader$b options;
    
    public LinkPreviewJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "source", "sourceResolutions", "obfuscated", "obfuscatedResolutions", "gif", "gifResolutions", "mp4", "mp4Resolutions", "redditVideoPreview" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableImageResolutionAdapter = (JsonAdapter<ImageResolution>)y.c((Type)ImageResolution.class, (Set)instance, "source");
        this.listOfImageResolutionAdapter = (JsonAdapter<List<ImageResolution>>)y.c((Type)a0.d((Class)List.class, new Type[] { ImageResolution.class }), (Set)instance, "sourceResolutions");
        this.nullableRedditVideoAdapter = (JsonAdapter<RedditVideo>)y.c((Type)RedditVideo.class, (Set)instance, "redditVideoPreview");
    }
    
    public LinkPreview fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        ImageResolution imageResolution = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    o8 = this.nullableRedditVideoAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o7 = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                    if (o7 != null) {
                        n &= 0xFFFFFF7F;
                        continue;
                    }
                    throw a.n("mp4Resolutions", "mp4Resolutions", jsonReader);
                }
                case 6: {
                    o6 = this.nullableImageResolutionAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o5 = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        n &= 0xFFFFFFDF;
                        continue;
                    }
                    throw a.n("gifResolutions", "gifResolutions", jsonReader);
                }
                case 4: {
                    o4 = this.nullableImageResolutionAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        n &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("obfuscatedResolutions", "obfuscatedResolutions", jsonReader);
                }
                case 2: {
                    o2 = this.nullableImageResolutionAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("sourceResolutions", "sourceResolutions", jsonReader);
                }
                case 0: {
                    imageResolution = (ImageResolution)this.nullableImageResolutionAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -512) {
            f.d(o, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.data.model.v1.ImageResolution>");
            f.d(o3, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.data.model.v1.ImageResolution>");
            f.d(o5, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.data.model.v1.ImageResolution>");
            f.d(o7, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.data.model.v1.ImageResolution>");
            return new LinkPreview(imageResolution, (List<ImageResolution>)o, (ImageResolution)o2, (List<ImageResolution>)o3, (ImageResolution)o4, (List<ImageResolution>)o5, (ImageResolution)o6, (List<ImageResolution>)o7, (RedditVideo)o8);
        }
        Constructor<LinkPreview> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = LinkPreview.class.getDeclaredConstructor(ImageResolution.class, List.class, ImageResolution.class, List.class, ImageResolution.class, List.class, ImageResolution.class, List.class, RedditVideo.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "LinkPreview::class.java.\u2026his.constructorRef = it }");
        }
        final LinkPreview instance = constructorRef.newInstance(imageResolution, o, o2, o3, o4, o5, o6, o7, o8, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final LinkPreview linkPreview) {
        f.f((Object)x, "writer");
        if (linkPreview != null) {
            x.h();
            x.w("source");
            this.nullableImageResolutionAdapter.toJson(x, (Object)linkPreview.getSource());
            x.w("sourceResolutions");
            this.listOfImageResolutionAdapter.toJson(x, (Object)linkPreview.getSourceResolutions());
            x.w("obfuscated");
            this.nullableImageResolutionAdapter.toJson(x, (Object)linkPreview.getObfuscated());
            x.w("obfuscatedResolutions");
            this.listOfImageResolutionAdapter.toJson(x, (Object)linkPreview.getObfuscatedResolutions());
            x.w("gif");
            this.nullableImageResolutionAdapter.toJson(x, (Object)linkPreview.getGif());
            x.w("gifResolutions");
            this.listOfImageResolutionAdapter.toJson(x, (Object)linkPreview.getGifResolutions());
            x.w("mp4");
            this.nullableImageResolutionAdapter.toJson(x, (Object)linkPreview.getMp4());
            x.w("mp4Resolutions");
            this.listOfImageResolutionAdapter.toJson(x, (Object)linkPreview.getMp4Resolutions());
            x.w("redditVideoPreview");
            this.nullableRedditVideoAdapter.toJson(x, (Object)linkPreview.getRedditVideoPreview());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(LinkPreview)";
    }
}
