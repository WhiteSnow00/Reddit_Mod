// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.image.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/image/model/ImageUrlsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/image/model/ImageUrls;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/image/model/ImageUrls$ImageUrl;", "imageUrlAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ImageUrlsJsonAdapter extends JsonAdapter<ImageUrls>
{
    private final JsonAdapter<ImageUrls$ImageUrl> imageUrlAdapter;
    private final JsonReader$b options;
    
    public ImageUrlsJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "1x", "1.5x", "2x", "3x", "4x" });
        this.imageUrlAdapter = (JsonAdapter<ImageUrls$ImageUrl>)y.c((Type)ImageUrls$ImageUrl.class, (Set)EmptySet.INSTANCE, "mdpi");
    }
    
    public ImageUrls fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        ImageUrls$ImageUrl imageUrls$ImageUrl = null;
        ImageUrls$ImageUrl imageUrls$ImageUrl3;
        ImageUrls$ImageUrl imageUrls$ImageUrl2 = imageUrls$ImageUrl3 = imageUrls$ImageUrl;
        ImageUrls$ImageUrl imageUrls$ImageUrl5;
        ImageUrls$ImageUrl imageUrls$ImageUrl4 = imageUrls$ImageUrl5 = imageUrls$ImageUrl3;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                imageUrls$ImageUrl5 = (ImageUrls$ImageUrl)this.imageUrlAdapter.fromJson(jsonReader);
                                if (imageUrls$ImageUrl5 != null) {
                                    continue;
                                }
                                throw a.n("xxxhdpi", "4x", jsonReader);
                            }
                            else {
                                imageUrls$ImageUrl4 = (ImageUrls$ImageUrl)this.imageUrlAdapter.fromJson(jsonReader);
                                if (imageUrls$ImageUrl4 != null) {
                                    continue;
                                }
                                throw a.n("xxhdpi", "3x", jsonReader);
                            }
                        }
                        else {
                            imageUrls$ImageUrl3 = (ImageUrls$ImageUrl)this.imageUrlAdapter.fromJson(jsonReader);
                            if (imageUrls$ImageUrl3 != null) {
                                continue;
                            }
                            throw a.n("xhdpi", "2x", jsonReader);
                        }
                    }
                    else {
                        imageUrls$ImageUrl2 = (ImageUrls$ImageUrl)this.imageUrlAdapter.fromJson(jsonReader);
                        if (imageUrls$ImageUrl2 != null) {
                            continue;
                        }
                        throw a.n("hdpi", "1.5x", jsonReader);
                    }
                }
                else {
                    imageUrls$ImageUrl = (ImageUrls$ImageUrl)this.imageUrlAdapter.fromJson(jsonReader);
                    if (imageUrls$ImageUrl != null) {
                        continue;
                    }
                    throw a.n("mdpi", "1x", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (imageUrls$ImageUrl == null) {
            throw a.h("mdpi", "1x", jsonReader);
        }
        if (imageUrls$ImageUrl2 == null) {
            throw a.h("hdpi", "1.5x", jsonReader);
        }
        if (imageUrls$ImageUrl3 == null) {
            throw a.h("xhdpi", "2x", jsonReader);
        }
        if (imageUrls$ImageUrl4 == null) {
            throw a.h("xxhdpi", "3x", jsonReader);
        }
        if (imageUrls$ImageUrl5 != null) {
            return new ImageUrls(imageUrls$ImageUrl, imageUrls$ImageUrl2, imageUrls$ImageUrl3, imageUrls$ImageUrl4, imageUrls$ImageUrl5);
        }
        throw a.h("xxxhdpi", "4x", jsonReader);
    }
    
    public void toJson(final x x, final ImageUrls imageUrls) {
        f.f((Object)x, "writer");
        if (imageUrls != null) {
            x.h();
            x.w("1x");
            this.imageUrlAdapter.toJson(x, (Object)imageUrls.getMdpi());
            x.w("1.5x");
            this.imageUrlAdapter.toJson(x, (Object)imageUrls.getHdpi());
            x.w("2x");
            this.imageUrlAdapter.toJson(x, (Object)imageUrls.getXhdpi());
            x.w("3x");
            this.imageUrlAdapter.toJson(x, (Object)imageUrls.getXxhdpi());
            x.w("4x");
            this.imageUrlAdapter.toJson(x, (Object)imageUrls.getXxxhdpi());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ImageUrls)";
    }
}
