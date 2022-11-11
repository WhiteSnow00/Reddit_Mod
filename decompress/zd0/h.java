// 
// Decompiled by Procyon v0.6.0
// 

package zd0;

import android.os.Parcel;
import sg2.e;
import com.reddit.domain.model.Subreddit;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class h implements Parcelable
{
    public static final Parcelable$Creator<h> CREATOR;
    public final String f;
    public final String g;
    public Subreddit h;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public h(final Subreddit h) {
        e.f((Object)h, "subreddit");
        this(h.getDisplayName(), h.getKindWithId());
        this.h = h;
    }
    
    public h(final String f, final String g) {
        e.f((Object)f, "subredditName");
        this.f = f;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
    
    public static final class a implements Parcelable$Creator<h>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new h(parcel.readString(), parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new h[n];
        }
    }
}
