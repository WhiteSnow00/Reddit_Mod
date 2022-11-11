// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.onboarding.question;

import ah2.f;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/onboarding/question/OnboardingSignalType;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "", "showToolbarSkip", "Z", "getShowToolbarSkip", "()Z", "<init>", "(Ljava/lang/String;IZ)V", "GENDER", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum OnboardingSignalType implements Parcelable
{
    public static final Parcelable$Creator<OnboardingSignalType> CREATOR;
    
    GENDER(true);
    
    private final boolean showToolbarSkip;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    private OnboardingSignalType(final boolean showToolbarSkip) {
        this.showToolbarSkip = showToolbarSkip;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final boolean getShowToolbarSkip() {
        return this.showToolbarSkip;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.name());
    }
    
    public static final class a implements Parcelable$Creator<OnboardingSignalType>
    {
        public final Object createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return OnboardingSignalType.valueOf(parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new OnboardingSignalType[n];
        }
    }
}
