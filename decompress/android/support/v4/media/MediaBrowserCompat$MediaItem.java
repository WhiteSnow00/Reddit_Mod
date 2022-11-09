// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable
{
    public static final Parcelable$Creator<MediaBrowserCompat$MediaItem> CREATOR;
    public final int f;
    public final MediaDescriptionCompat g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaBrowserCompat$MediaItem>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new MediaBrowserCompat$MediaItem(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new MediaBrowserCompat$MediaItem[n];
            }
        };
    }
    
    public MediaBrowserCompat$MediaItem(final Parcel parcel) {
        this.f = parcel.readInt();
        this.g = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaItem{");
        sb.append("mFlags=");
        sb.append(this.f);
        sb.append(", mDescription=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        this.g.writeToParcel(parcel, n);
    }
}
