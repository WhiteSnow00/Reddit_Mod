// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import a2.b;
import android.os.Parcel;
import ah2.f;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J-\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006%" }, d2 = { "Lcom/reddit/domain/model/Image;", "Landroid/os/Parcelable;", "", "Lcom/reddit/domain/image/model/ImageResolution;", "component1", "component2", "Lcom/reddit/domain/model/Variants;", "component3", "resolutions", "source", "variants", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/util/List;", "getResolutions", "()Ljava/util/List;", "Lcom/reddit/domain/image/model/ImageResolution;", "getSource", "()Lcom/reddit/domain/image/model/ImageResolution;", "Lcom/reddit/domain/model/Variants;", "getVariants", "()Lcom/reddit/domain/model/Variants;", "<init>", "(Ljava/util/List;Lcom/reddit/domain/image/model/ImageResolution;Lcom/reddit/domain/model/Variants;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Image implements Parcelable
{
    public static final Parcelable$Creator<Image> CREATOR;
    private final List<ImageResolution> resolutions;
    private final ImageResolution source;
    private final Variants variants;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Image(final List<ImageResolution> resolutions, final ImageResolution source, final Variants variants) {
        f.f((Object)resolutions, "resolutions");
        f.f((Object)source, "source");
        f.f((Object)variants, "variants");
        this.resolutions = resolutions;
        this.source = source;
        this.variants = variants;
    }
    
    public final List<ImageResolution> component1() {
        return this.resolutions;
    }
    
    public final ImageResolution component2() {
        return this.source;
    }
    
    public final Variants component3() {
        return this.variants;
    }
    
    public final Image copy(final List<ImageResolution> list, final ImageResolution imageResolution, final Variants variants) {
        f.f((Object)list, "resolutions");
        f.f((Object)imageResolution, "source");
        f.f((Object)variants, "variants");
        return new Image(list, imageResolution, variants);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Image)) {
            return false;
        }
        final Image image = (Image)o;
        return f.a((Object)this.resolutions, (Object)image.resolutions) && f.a((Object)this.source, (Object)image.source) && f.a((Object)this.variants, (Object)image.variants);
    }
    
    public final List<ImageResolution> getResolutions() {
        return this.resolutions;
    }
    
    public final ImageResolution getSource() {
        return this.source;
    }
    
    public final Variants getVariants() {
        return this.variants;
    }
    
    @Override
    public int hashCode() {
        return this.variants.hashCode() + (this.source.hashCode() + this.resolutions.hashCode() * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Image(resolutions=");
        k.append(this.resolutions);
        k.append(", source=");
        k.append(this.source);
        k.append(", variants=");
        k.append(this.variants);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        final Iterator n2 = b.n((List)this.resolutions, parcel);
        while (n2.hasNext()) {
            parcel.writeParcelable((Parcelable)n2.next(), n);
        }
        parcel.writeParcelable((Parcelable)this.source, n);
        this.variants.writeToParcel(parcel, n);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Image>
    {
        public final Image createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = d.e((Class)Image.class, parcel, list, i, 1)) {}
            return new Image((List<ImageResolution>)list, (ImageResolution)parcel.readParcelable(Image.class.getClassLoader()), (Variants)Variants.CREATOR.createFromParcel(parcel));
        }
        
        public final Image[] newArray(final int n) {
            return new Image[n];
        }
    }
}
