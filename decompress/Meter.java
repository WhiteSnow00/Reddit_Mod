// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import android.os.Parcel;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#" }, d2 = { "Lcom/reddit/domain/model/streaming/Meter;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "", "component3", "enabled", "proportionFull", "fullMeterDurationSeconds", "copy", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Z", "getEnabled", "()Z", "F", "getProportionFull", "()F", "I", "getFullMeterDurationSeconds", "()I", "<init>", "(ZFI)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class Meter implements Parcelable
{
    public static final Parcelable$Creator<Meter> CREATOR;
    private final boolean enabled;
    private final int fullMeterDurationSeconds;
    private final float proportionFull;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Meter(@n(name = "enabled") final boolean enabled, @n(name = "proportion_full") final float proportionFull, @n(name = "full_meter_duration") final int fullMeterDurationSeconds) {
        this.enabled = enabled;
        this.proportionFull = proportionFull;
        this.fullMeterDurationSeconds = fullMeterDurationSeconds;
    }
    
    public final boolean component1() {
        return this.enabled;
    }
    
    public final float component2() {
        return this.proportionFull;
    }
    
    public final int component3() {
        return this.fullMeterDurationSeconds;
    }
    
    public final Meter copy(@n(name = "enabled") final boolean b, @n(name = "proportion_full") final float n, @n(name = "full_meter_duration") final int n2) {
        return new Meter(b, n, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Meter)) {
            return false;
        }
        final Meter meter = (Meter)o;
        return this.enabled == meter.enabled && f.a((Object)this.proportionFull, (Object)meter.proportionFull) && this.fullMeterDurationSeconds == meter.fullMeterDurationSeconds;
    }
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    public final int getFullMeterDurationSeconds() {
        return this.fullMeterDurationSeconds;
    }
    
    public final float getProportionFull() {
        return this.proportionFull;
    }
    
    @Override
    public int hashCode() {
        int enabled;
        if ((enabled = (this.enabled ? 1 : 0)) != 0) {
            enabled = 1;
        }
        return Integer.hashCode(this.fullMeterDurationSeconds) + a.a(this.proportionFull, enabled * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Meter(enabled=");
        k.append(this.enabled);
        k.append(", proportionFull=");
        k.append(this.proportionFull);
        k.append(", fullMeterDurationSeconds=");
        return d.k(k, this.fullMeterDurationSeconds, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeInt((int)(this.enabled ? 1 : 0));
        parcel.writeFloat(this.proportionFull);
        parcel.writeInt(this.fullMeterDurationSeconds);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Meter>
    {
        public final Meter createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new Meter(parcel.readInt() != 0, parcel.readFloat(), parcel.readInt());
        }
        
        public final Meter[] newArray(final int n) {
            return new Meter[n];
        }
    }
}
