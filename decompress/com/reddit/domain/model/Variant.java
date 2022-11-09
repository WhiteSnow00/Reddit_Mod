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
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J#\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/Variant;", "Landroid/os/Parcelable;", "", "Lcom/reddit/domain/image/model/ImageResolution;", "component1", "component2", "resolutions", "source", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/util/List;", "getResolutions", "()Ljava/util/List;", "Lcom/reddit/domain/image/model/ImageResolution;", "getSource", "()Lcom/reddit/domain/image/model/ImageResolution;", "<init>", "(Ljava/util/List;Lcom/reddit/domain/image/model/ImageResolution;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Variant implements Parcelable
{
    public static final Parcelable$Creator<Variant> CREATOR;
    private final List<ImageResolution> resolutions;
    private final ImageResolution source;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Variant(final List<ImageResolution> resolutions, final ImageResolution source) {
        f.f((Object)resolutions, "resolutions");
        f.f((Object)source, "source");
        this.resolutions = resolutions;
        this.source = source;
    }
    
    public final List<ImageResolution> component1() {
        return this.resolutions;
    }
    
    public final ImageResolution component2() {
        return this.source;
    }
    
    public final Variant copy(final List<ImageResolution> list, final ImageResolution imageResolution) {
        f.f((Object)list, "resolutions");
        f.f((Object)imageResolution, "source");
        return new Variant(list, imageResolution);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Variant)) {
            return false;
        }
        final Variant variant = (Variant)o;
        return f.a((Object)this.resolutions, (Object)variant.resolutions) && f.a((Object)this.source, (Object)variant.source);
    }
    
    public final List<ImageResolution> getResolutions() {
        return this.resolutions;
    }
    
    public final ImageResolution getSource() {
        return this.source;
    }
    
    @Override
    public int hashCode() {
        return this.source.hashCode() + this.resolutions.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Variant(resolutions=");
        k.append(this.resolutions);
        k.append(", source=");
        k.append(this.source);
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
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Variant>
    {
        public final Variant createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = d.e((Class)Variant.class, parcel, list, i, 1)) {}
            return new Variant((List<ImageResolution>)list, (ImageResolution)parcel.readParcelable(Variant.class.getClassLoader()));
        }
        
        public final Variant[] newArray(final int n) {
            return new Variant[n];
        }
    }
}
