// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import a2.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001¨\u0006\r" }, d2 = { "Lcom/reddit/domain/awards/model/GroupAwardTier;", "Landroid/os/Parcelable;", "", "awardingsRequired", "", "Lcom/reddit/domain/image/model/ImageResolution;", "resizedIcons", "resizedStaticIcons", "", "iconFormatRaw", "copy", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class GroupAwardTier implements Parcelable
{
    public static final Parcelable$Creator<GroupAwardTier> CREATOR;
    public final int f;
    public final List<ImageResolution> g;
    public final List<ImageResolution> h;
    public final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public GroupAwardTier(@n(name = "awardings_required") final int f, @n(name = "resized_icons") final List<ImageResolution> g, @n(name = "resized_static_icons") final List<ImageResolution> h, @n(name = "icon_format") final String i) {
        ah2.f.f((Object)g, "resizedIcons");
        ah2.f.f((Object)h, "resizedStaticIcons");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final GroupAwardTier copy(@n(name = "awardings_required") final int n, @n(name = "resized_icons") final List<ImageResolution> list, @n(name = "resized_static_icons") final List<ImageResolution> list2, @n(name = "icon_format") final String s) {
        ah2.f.f((Object)list, "resizedIcons");
        ah2.f.f((Object)list2, "resizedStaticIcons");
        return new GroupAwardTier(n, list, list2, s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupAwardTier)) {
            return false;
        }
        final GroupAwardTier groupAwardTier = (GroupAwardTier)o;
        return this.f == groupAwardTier.f && ah2.f.a((Object)this.g, (Object)groupAwardTier.g) && ah2.f.a((Object)this.h, (Object)groupAwardTier.h) && ah2.f.a((Object)this.i, (Object)groupAwardTier.i);
    }
    
    @Override
    public final int hashCode() {
        final int a = b.a((List)this.h, b.a((List)this.g, Integer.hashCode(this.f) * 31, 31), 31);
        final String i = this.i;
        int hashCode;
        if (i == null) {
            hashCode = 0;
        }
        else {
            hashCode = i.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("GroupAwardTier(awardingsRequired=");
        k.append(this.f);
        k.append(", resizedIcons=");
        k.append(this.g);
        k.append(", resizedStaticIcons=");
        k.append(this.h);
        k.append(", iconFormatRaw=");
        return b.k(k, this.i, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ah2.f.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        final Iterator n2 = b.n((List)this.g, parcel);
        while (n2.hasNext()) {
            parcel.writeParcelable((Parcelable)n2.next(), n);
        }
        final Iterator n3 = b.n((List)this.h, parcel);
        while (n3.hasNext()) {
            parcel.writeParcelable((Parcelable)n3.next(), n);
        }
        parcel.writeString(this.i);
    }
    
    public static final class a implements Parcelable$Creator<GroupAwardTier>
    {
        public final Object createFromParcel(final Parcel parcel) {
            ah2.f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final ArrayList list = new ArrayList(int2);
            final int n = 0;
            for (int i = 0; i != int2; i = d.e((Class)GroupAwardTier.class, parcel, list, i, 1)) {}
            final int int3 = parcel.readInt();
            final ArrayList list2 = new ArrayList(int3);
            for (int j = n; j != int3; j = d.e((Class)GroupAwardTier.class, parcel, list2, j, 1)) {}
            return new GroupAwardTier(int1, (List<ImageResolution>)list, (List<ImageResolution>)list2, parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new GroupAwardTier[n];
        }
    }
}
