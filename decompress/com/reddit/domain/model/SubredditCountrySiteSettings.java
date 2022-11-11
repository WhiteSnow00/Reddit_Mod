// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010H\u00d6\u0001R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006#" }, d2 = { "Lcom/reddit/domain/model/SubredditCountrySiteSettings;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "countryCode", "languageCode", "isCountrySiteEditable", "modMigrationDate", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/reddit/domain/model/SubredditCountrySiteSettings;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "getLanguageCode", "Ljava/lang/Boolean;", "getModMigrationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditCountrySiteSettings implements Parcelable
{
    public static final Parcelable$Creator<SubredditCountrySiteSettings> CREATOR;
    private final String countryCode;
    private final Boolean isCountrySiteEditable;
    private final String languageCode;
    private final String modMigrationDate;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditCountrySiteSettings() {
        this(null, null, null, null, 15, null);
    }
    
    public SubredditCountrySiteSettings(@n(name = "country_code") final String countryCode, @n(name = "language_code") final String languageCode, @n(name = "is_country_site_editable") final Boolean isCountrySiteEditable, @n(name = "mod_migration_at") final String modMigrationDate) {
        this.countryCode = countryCode;
        this.languageCode = languageCode;
        this.isCountrySiteEditable = isCountrySiteEditable;
        this.modMigrationDate = modMigrationDate;
    }
    
    public final String component1() {
        return this.countryCode;
    }
    
    public final String component2() {
        return this.languageCode;
    }
    
    public final Boolean component3() {
        return this.isCountrySiteEditable;
    }
    
    public final String component4() {
        return this.modMigrationDate;
    }
    
    public final SubredditCountrySiteSettings copy(@n(name = "country_code") final String s, @n(name = "language_code") final String s2, @n(name = "is_country_site_editable") final Boolean b, @n(name = "mod_migration_at") final String s3) {
        return new SubredditCountrySiteSettings(s, s2, b, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditCountrySiteSettings)) {
            return false;
        }
        final SubredditCountrySiteSettings subredditCountrySiteSettings = (SubredditCountrySiteSettings)o;
        return e.a((Object)this.countryCode, (Object)subredditCountrySiteSettings.countryCode) && e.a((Object)this.languageCode, (Object)subredditCountrySiteSettings.languageCode) && e.a((Object)this.isCountrySiteEditable, (Object)subredditCountrySiteSettings.isCountrySiteEditable) && e.a((Object)this.modMigrationDate, (Object)subredditCountrySiteSettings.modMigrationDate);
    }
    
    public final String getCountryCode() {
        return this.countryCode;
    }
    
    public final String getLanguageCode() {
        return this.languageCode;
    }
    
    public final String getModMigrationDate() {
        return this.modMigrationDate;
    }
    
    @Override
    public int hashCode() {
        final String countryCode = this.countryCode;
        int hashCode = 0;
        int hashCode2;
        if (countryCode == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = countryCode.hashCode();
        }
        final String languageCode = this.languageCode;
        int hashCode3;
        if (languageCode == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = languageCode.hashCode();
        }
        final Boolean isCountrySiteEditable = this.isCountrySiteEditable;
        int hashCode4;
        if (isCountrySiteEditable == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isCountrySiteEditable.hashCode();
        }
        final String modMigrationDate = this.modMigrationDate;
        if (modMigrationDate != null) {
            hashCode = modMigrationDate.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    public final Boolean isCountrySiteEditable() {
        return this.isCountrySiteEditable;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditCountrySiteSettings(countryCode=");
        r.append(this.countryCode);
        r.append(", languageCode=");
        r.append(this.languageCode);
        r.append(", isCountrySiteEditable=");
        r.append(this.isCountrySiteEditable);
        r.append(", modMigrationDate=");
        return f0.n(r, this.modMigrationDate, ')');
    }
    
    public void writeToParcel(final Parcel parcel, int booleanValue) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.countryCode);
        parcel.writeString(this.languageCode);
        final Boolean isCountrySiteEditable = this.isCountrySiteEditable;
        if (isCountrySiteEditable == null) {
            booleanValue = 0;
        }
        else {
            parcel.writeInt(1);
            booleanValue = (((boolean)isCountrySiteEditable) ? 1 : 0);
        }
        parcel.writeInt(booleanValue);
        parcel.writeString(this.modMigrationDate);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditCountrySiteSettings>
    {
        public final SubredditCountrySiteSettings createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            Boolean value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            return new SubredditCountrySiteSettings(string, string2, value, parcel.readString());
        }
        
        public final SubredditCountrySiteSettings[] newArray(final int n) {
            return new SubredditCountrySiteSettings[n];
        }
    }
}
