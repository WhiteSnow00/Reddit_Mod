// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.powerups;

import ah2.f;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001j\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/powerups/FlairCategory;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "SUPPORTER", "ACHIEVEMENT", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum FlairCategory implements Parcelable
{
    ACHIEVEMENT;
    
    public static final Parcelable$Creator<FlairCategory> CREATOR;
    
    SUPPORTER;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.name());
    }
    
    public static final class a implements Parcelable$Creator<FlairCategory>
    {
        public final Object createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return FlairCategory.valueOf(parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new FlairCategory[n];
        }
    }
}
