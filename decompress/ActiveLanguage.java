// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import ak0.m;
import android.os.Parcelable$Creator;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u00d6\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#" }, d2 = { "Lcom/reddit/data/modtools/ActiveLanguage;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "isoCode", "displayName", "englishName", "rtl", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getIsoCode", "()Ljava/lang/String;", "getDisplayName", "getEnglishName", "Z", "getRtl", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
@Keep
public final class ActiveLanguage implements Parcelable
{
    public static final Parcelable$Creator<ActiveLanguage> CREATOR;
    private final String displayName;
    private final String englishName;
    private final String isoCode;
    private final boolean rtl;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public ActiveLanguage(final String isoCode, final String displayName, final String englishName, final boolean rtl) {
        m.y(isoCode, "isoCode", displayName, "displayName", englishName, "englishName");
        this.isoCode = isoCode;
        this.displayName = displayName;
        this.englishName = englishName;
        this.rtl = rtl;
    }
    
    public final String component1() {
        return this.isoCode;
    }
    
    public final String component2() {
        return this.displayName;
    }
    
    public final String component3() {
        return this.englishName;
    }
    
    public final boolean component4() {
        return this.rtl;
    }
    
    public final ActiveLanguage copy(final String s, final String s2, final String s3, final boolean b) {
        f.f((Object)s, "isoCode");
        f.f((Object)s2, "displayName");
        f.f((Object)s3, "englishName");
        return new ActiveLanguage(s, s2, s3, b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActiveLanguage)) {
            return false;
        }
        final ActiveLanguage activeLanguage = (ActiveLanguage)o;
        return f.a((Object)this.isoCode, (Object)activeLanguage.isoCode) && f.a((Object)this.displayName, (Object)activeLanguage.displayName) && f.a((Object)this.englishName, (Object)activeLanguage.englishName) && this.rtl == activeLanguage.rtl;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getEnglishName() {
        return this.englishName;
    }
    
    public final String getIsoCode() {
        return this.isoCode;
    }
    
    public final boolean getRtl() {
        return this.rtl;
    }
    
    @Override
    public int hashCode() {
        final int f = ag0.a.f(this.englishName, ag0.a.f(this.displayName, this.isoCode.hashCode() * 31, 31), 31);
        int rtl;
        if ((rtl = (this.rtl ? 1 : 0)) != 0) {
            rtl = 1;
        }
        return f + rtl;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ActiveLanguage(isoCode=");
        k.append(this.isoCode);
        k.append(", displayName=");
        k.append(this.displayName);
        k.append(", englishName=");
        k.append(this.englishName);
        k.append(", rtl=");
        return s0.o(k, this.rtl, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.isoCode);
        parcel.writeString(this.displayName);
        parcel.writeString(this.englishName);
        parcel.writeInt((int)(this.rtl ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<ActiveLanguage>
    {
        public final Object createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new ActiveLanguage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
        
        public final Object[] newArray(final int n) {
            return new ActiveLanguage[n];
        }
    }
}
