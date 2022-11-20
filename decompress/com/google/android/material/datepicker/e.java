// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public final class e implements a$c
{
    public static final Parcelable$Creator<e> CREATOR;
    public final long f;
    
    static {
        CREATOR = (Parcelable$Creator)new e$a();
    }
    
    public e(final long f) {
        this.f = f;
    }
    
    public final boolean K(final long n) {
        return n >= this.f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        if (this.f != ((e)o).f) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.f);
    }
}
