// 
// Decompiled by Procyon v0.6.0
// 

package ac0;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import p1.h;
import ng2.e;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final List<ImageResolution> i;
    public final String j;
    public final boolean k;
    public final String l;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a(final boolean f, final String g, final boolean h, final List<ImageResolution> i, final String j, final boolean k, final String l) {
        e.f((Object)i, "mp4Resolutions");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.f == a.f && e.a((Object)this.g, (Object)a.g) && this.h == a.h && e.a((Object)this.i, (Object)a.i) && e.a((Object)this.j, (Object)a.j) && this.k == a.k && e.a((Object)this.l, (Object)a.l);
    }
    
    @Override
    public final int hashCode() {
        final int f = this.f ? 1 : 0;
        final int n = 1;
        int n2 = f;
        if (f != 0) {
            n2 = 1;
        }
        final String g = this.g;
        final int n3 = 0;
        int hashCode;
        if (g == null) {
            hashCode = 0;
        }
        else {
            hashCode = g.hashCode();
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final int b = a.b((List)this.i, ((n2 * 31 + hashCode) * 31 + h) * 31, 31);
        final String j = this.j;
        int hashCode2;
        if (j == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = j.hashCode();
        }
        int k = this.k ? 1 : 0;
        if (k != 0) {
            k = n;
        }
        final String l = this.l;
        int hashCode3;
        if (l == null) {
            hashCode3 = n3;
        }
        else {
            hashCode3 = l.hashCode();
        }
        return ((b + hashCode2) * 31 + k) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Mp4PreviewParams(isVideo=");
        t.append(this.f);
        t.append(", redditVideoDashUrl=");
        t.append(this.g);
        t.append(", hasMp4Url=");
        t.append(this.h);
        t.append(", mp4Resolutions=");
        t.append(this.i);
        t.append(", mp4Url=");
        t.append(this.j);
        t.append(", isImgurLink=");
        t.append(this.k);
        t.append(", imgurMp4Url=");
        return p1.h.c(t, this.l, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt((int)(this.f ? 1 : 0));
        parcel.writeString(this.g);
        parcel.writeInt((int)(this.h ? 1 : 0));
        final Iterator r = android.support.v4.media.a.r((List)this.i, parcel);
        while (r.hasNext()) {
            parcel.writeParcelable((Parcelable)r.next(), n);
        }
        parcel.writeString(this.j);
        parcel.writeInt((int)(this.k ? 1 : 0));
        parcel.writeString(this.l);
    }
    
    public static final class a implements Parcelable$Creator<ac0.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final boolean b = parcel.readInt() != 0;
            final String string = parcel.readString();
            final boolean b2 = parcel.readInt() != 0;
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = android.support.v4.media.a.f((Class)ac0.a.class, parcel, list, i, 1)) {}
            return new ac0.a(b, string, b2, (List<ImageResolution>)list, parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new ac0.a[n];
        }
    }
}
